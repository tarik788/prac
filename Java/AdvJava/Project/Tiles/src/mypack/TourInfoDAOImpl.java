package mypack;


import java.util.ArrayList;
import java.util.List;

//import mypack.PackageDAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class TourInfoDAOImpl implements TourinfoDAO 
{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List getTours(String s) 
	{
		List list=null;
		try
		{
		Session session=sessionFactory.getCurrentSession();
		System.out.println(s);
		Query query= session.createQuery("select p from Tourinfo p where p.subCategoryId=?");
		System.out.println(s);
		query.setString(0,s);
		list = (List) query.list();
		System.out.println("size of list is\t"+list.size());
		System.out.println(list);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		return list;
	}
}














