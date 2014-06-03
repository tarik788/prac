package mypack;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class TourDAOImpl implements TourDAO 
{
	@Autowired
	private SessionFactory sessionfactory;
	@Override
	public void add(Search ref) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		session.save(ref);

	}

	@SuppressWarnings("rawtypes")
	@Override
	public List get(Date startdate, Date enddate) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		Query q=session.createQuery("select k from Search k where k.startDate>=? and k.endDate<=?");
		q.setDate(0,startdate);
		q.setDate(1,enddate);
		List mylist=q.list();
		return mylist;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getcost(String cost1, String cost2) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		Query q=session.createQuery("select k from Search k where k.cost>=? and k.cost<=?");
		
		q.setDouble(0,Double.parseDouble(cost1));
		q.setDouble(1,Double.parseDouble(cost2));
		List mylist=q.list();
		return mylist;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getduration(String duration1,String duration2) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		Query q=session.createQuery("select k from Search k where k.duration>=? and k.duration<=?");
		
		q.setInteger(0,Integer.parseInt(duration1));
		q.setInteger(1,Integer.parseInt(duration2));
		List mylist=q.list();
		return mylist;
	}

}








