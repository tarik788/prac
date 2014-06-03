package mypack;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
@Transactional
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void setCustomer(Customer cust) {
		Session session=sessionFactory.getCurrentSession();
		session.save(cust);
		
	}

	@Override
	public void setPerson(Person per) {
		Session session=sessionFactory.getCurrentSession();
		session.save(per);
		
	}

	

}
