package mypack;


import java.util.ArrayList;
import java.util.List;

import mypack.PackageDAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class PackageDAOImpl implements PackageDAO 
{
	
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List getPackages() 
	{
		Session session=sessionFactory.getCurrentSession();
		Query query= session.createQuery("select p from Package p where p.subCategoryId is null");
		List list = (List) query.list();
		return list;
	}
	public List getSubPackages(String s)
	{
		Session session=sessionFactory.getCurrentSession();
		Query query= session.createQuery("select p from Package p where p.subCategoryId=?");
		query.setString(0,s);
		List list = (List) query.list();
		System.out.println(list);
		return list;
	}
}














