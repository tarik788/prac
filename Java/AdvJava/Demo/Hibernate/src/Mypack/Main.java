package Mypack;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction transaction = null; 
        try { 
            transaction = session.beginTransaction(); 
            Product p=new Product();
            p.setId(1);
            p.setName("soap");
            p.setQty(75);
            p.setPrice(90);
         //   Product p=new Product(1,"soap",75,90);
            session.save(p);
            transaction.commit(); 
            System.out.println("done with product");
            System.out.println("now loading");
      
            Product ref2=(Product)session.load(Product.class,1);   
            System.out.println(ref2);
          
         
             }
        catch(Exception ee)
        {
        	System.out.println("in catch\t"+ee);
        }
}
}