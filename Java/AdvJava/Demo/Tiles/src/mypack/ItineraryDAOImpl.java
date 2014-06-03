package mypack;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@Component

public class ItineraryDAOImpl implements ItineraryDAO  
{
	@Autowired
	private SessionFactory sessionfactory;
	@Override
	public List getIList(String subcategoryid) {
		System.out.println("divyang");
		System.out.println(subcategoryid);
		// TODO Auto-generated method stub
		Session session= sessionfactory.getCurrentSession();
		Query query = session.createQuery("select k from Itinerary k where k.subcategoryid=? ");
		//System.out.println(query);
		System.out.println("subcat is"+subcategoryid);
		query.setString(0,subcategoryid);
		List iterlist=query.list();
		System.out.println(iterlist);
		return iterlist;
	}

}
