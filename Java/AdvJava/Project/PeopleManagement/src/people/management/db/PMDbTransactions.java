package people.management.db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.Session;

public class PMDbTransactions<T> {

	public Boolean Insert(T t) {
		Boolean insResult = true;
		Session session = PMHibernateSingleton.getSessionFactory().openSession();
		Transaction tran = null;
		try {
			tran = session.beginTransaction();
			session.save(t);
			tran.commit();

		} catch (Exception ex) {
			tran.rollback();
			ex.printStackTrace();
			insResult = false;
		} finally {
			session.close();
		}
		return insResult;
	}

	public Boolean Update(T t) {
		Boolean insResult = true;
		Session session = PMHibernateSingleton.getSessionFactory()
				.openSession();
		Transaction tran = null;
		try {
			tran = session.beginTransaction();
			session.update(t);
			tran.commit();

		} catch (Exception ex) {
			tran.rollback();
			ex.printStackTrace();
			insResult = false;
		} finally {
			session.close();
		}
		return insResult;
	}

	public Boolean Delete(T t) {
		Boolean insResult = true;
		Session session = PMHibernateSingleton.getSessionFactory()
				.openSession();
		Transaction tran = null;
		try {
			tran = session.beginTransaction();
			session.delete(t);
			tran.commit();

		} catch (Exception ex) {
			tran.rollback();
			ex.printStackTrace();
			insResult = false;
		} finally {
			session.close();
		}
		return insResult;
	}

	public List<T> SelectAll(String pQuery) {
		List<T> retTable = new ArrayList<T>();
		Session session = PMHibernateSingleton.getSessionFactory()
				.openSession();
		Transaction tran = null;
		try {
			tran = session.beginTransaction();
			Query query = session.createQuery(pQuery);
			List querylist = query.list();
			Iterator itr = querylist.iterator();
			while (itr.hasNext()) {
				T t = (T) itr.next();
				retTable.add(t);
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			session.close();
		}

		return retTable;
	}

	public T SelectSingle(String pQuery) {
		T resultT = null;
		Session session = PMHibernateSingleton.getSessionFactory()
				.openSession();
		Transaction tran = null;
		try {
			tran = session.beginTransaction();
			Query query = session.createQuery(pQuery);
			resultT = (T) query.uniqueResult();
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			session.close();
		}
		return resultT;
	}
}