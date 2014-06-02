package mypack;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

public class FormAction extends ActionSupport implements SessionAware 
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Customer cust;
	private Collection<Person> person;
	private List per;
	private Map session;

	private List list;
	
	int adult=0;
	int child=0;
	double amt=0;
	private int totaladult;
	private int totalchild;

	private int perperson;
	private int perchild;
	
	@Autowired
	PersonDAO persondao;
	
	//private int a;
	
	/*public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}*/
	
	public int getAdult() {
		
		return adult;
	}

	public void setAdult(int adult) {
		
		this.adult = adult;
		
		}


	
	public int getChild() {
		return child;
	}

	public void setChild(int child) {
		if(child != 0)
		{
		this.child = child;
		}
	}


	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}
	
	public int getTotalchild() {
		return totalchild;
	}

	public void setTotalchild(int totalchild) {
		this.totalchild = totalchild;
	}

	public int getTotaladult() {
		return totaladult;
	}

	public void setTotaladult(int totaladult) {
		this.totaladult = totaladult;
	}

	
	public Cost c;
	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}
	
	public Collection<Person> getPerson() {
		
		return person;
	}

	public void setPerson(Collection<Person> per) {
		
		this.person = per;
	}

	@Autowired
	CostDAO costdao;
	
	@Autowired
	CustomerDAO customerdao;
	/*public void setC(costdao.getCost("AUS1")) {
		this.c = cost;
	}
	
	public Cost getC() {
		
		return c;
	}*/
	@Override
	public void setSession(Map<String, Object> arg0) 
	{
			session = arg0;
	}
	Person p;
	int totalamt = 0;
	public String execute()
	{
		//person = costdao.getPerson(cust.getFirstName());
		customerdao.setCustomer(cust);
		//a=cust.getPerson().size();
		try
		{
			Iterator itr=cust.getPerson().iterator();
			while(itr.hasNext())
			{
				p=(Person)itr.next();
				if(p.getAge()<12 && p.getAge()>=1)
				{
				child++;
				}
				else if(p.getAge()>=12)
				{
				adult++;
				}
				else 
				{
					System.out.println("Adults ="+adult);
				}
				}
				System.out.println("child = "+child);
				System.out.println("adult  ="+adult);
			
			c = costdao.getCost((String)session.get("tourid"));
			//System.out.println(costdao.getCost("Aus1"));
			System.out.println(c.getBaseCost());
			System.out.println(c.getChildWithBed().intValue());
			setPerperson(c.getBaseCost().intValue());
			setPerchild(c.getChildWithBed().intValue());
			perperson = c.getBaseCost().intValue();
			perchild  = c.getChildWithBed().intValue();
			totaladult = c.getBaseCost().intValue()*adult;
			totalchild = c.getChildWithBed().intValue()*child;
			amt = Double.valueOf(totaladult +totalchild);
			totalamt = (int) (totalamt+amt);
			session.put("totalamt", totalamt);
			System.out.println(totalamt);
			System.out.println("person="+person);
			System.out.println("c = "+c);
			System.out.println("amt = "+amt);
			per=persondao.getPerson((String)session.get("tourid"));
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		return "success";	
	}

	public List getPer() {
		return per;
	}

	public void setPer(List per) {
		this.per = per;
	}

	public List<Double> getList() {
		return list;
	}

	public void setList(List<Double> list) {
		this.list = list;
	}

	public int getPerperson() {
		return perperson;
	}

	public void setPerperson(int perperson) {
		this.perperson = perperson;
	}

	public int getPerchild() {
		return perchild;
	}

	public void setPerchild(int perchild) {
		this.perchild = perchild;
	}

	
}
