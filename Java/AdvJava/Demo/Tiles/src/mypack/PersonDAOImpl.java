package mypack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class PersonDAOImpl implements PersonDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List getPerson(String s) {
		
		List l;
		List person=null;
		Person per=null;
		Session session= sessionFactory.getCurrentSession();
		Query query = session.createQuery("select c.bookTransId from CustomerPersonId c where c.customerCustomerId=? ");
		query.setString(0, s);
		l=query.list();
		Iterator i=l.iterator();
		Query q = session.createQuery("select p from Person p where p.bookTransId=? ");
		while(i.hasNext())
		{
		q.setString(0, (String)i.next());	
		List p=q.list();
		Iterator itr=p.iterator();
		while(itr.hasNext())
		{
			per=(Person)itr.next();
		}
		person.add(per);
		}
		
		return person;
	}

	
	

}
