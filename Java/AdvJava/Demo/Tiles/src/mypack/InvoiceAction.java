package mypack;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

public class InvoiceAction extends ActionSupport {
	
	/**
	 * 
	 */
	
	private List list;
	
	int adult;
	int child;
	double amt;
	private int totaladult;
	private int totalchild;

	private int perperson;
	private int perchild;
	
	
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

	
	

		Person p;
	public String execute()
	{
		new InvoiceAction().setAmt(new FormAction().getAmt());
		
		return "success";	
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
