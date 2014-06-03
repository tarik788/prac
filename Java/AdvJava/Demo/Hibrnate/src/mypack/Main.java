package mypack;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		org.hibernate.Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("from Product where pid = 1");
			List queryList =  query.list();
			Iterator itr = queryList.iterator();
			while (itr.hasNext()) {
				Product prod = (Product) itr.next();
				System.out.println("Product Name " + prod.getName());
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}

}
