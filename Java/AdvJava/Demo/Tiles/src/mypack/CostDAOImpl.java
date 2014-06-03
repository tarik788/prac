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
public class CostDAOImpl implements CostDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	
	/*public List getPerson(String s) 
	{
		
		Session session=sessionFactory.getCurrentSession();
		Query query= session.createQuery("Select p from Person p where p. ");
		query.setString(0, s);
		List list = (List) query.list();
		System.out.println("Customer list is="+list);
		return list;
	}*/
	public Cost getCost(String s) {
		
		
		Session session=sessionFactory.getCurrentSession();
		System.out.println("s = "+s);
		Cost c=null; 
		Query query= session.createQuery("select p from Cost p where p.subCategoryId=?");
		System.out.println("query = "+query);
		query.setString(0, s);
		List l=(List)query.list();
		System.out.println("list  = "+l);
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			c=(Cost)i.next();
			System.out.println("c = "+c);
		}
		return c;
	}

	public List getPax(String s)
	{
		Session session=sessionFactory.getCurrentSession();
		String id;
		return null;
	}
	/*@Override
	public Cost setCost() {
		// TODO Auto-generated method stub
		return null;
	}*/

	

}
