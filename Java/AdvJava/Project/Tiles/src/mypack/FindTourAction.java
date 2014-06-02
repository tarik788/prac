package mypack;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class FindTourAction 
{
	@Autowired
	private TourDAO tourdao;
	private Date sdate,edate;
	private String cost1,cost2;
	private String duration1,duration2;
	public String getCost1() {
		return cost1;
	}
	
	public void setCost1(String cost1) {
		this.cost1 = cost1;
	}
	
	public String getCost2() {
		return cost2;
	}

	public void setCost2(String cost2) {
		this.cost2 = cost2;
	}



	public String getDuration1() {
		return duration1;
	}



	public void setDuration1(String duration1) {
		this.duration1 = duration1;
	}



	public String getDuration2() {
		return duration2;
	}



	public void setDuration2(String duration2) {
		this.duration2 = duration2;
	}

	//private HttpServletRequest request;
	
	private String search;
	
	public String getSearch() {
		return search;
	}



	public void setSearch(String search) {
		System.out.println(search);
		this.search = search;
	}
	
	@SuppressWarnings("rawtypes")
	private List tnames;
	/**
	 * @return the tnames
	 */
	@SuppressWarnings("rawtypes")
	public List getTnames() {
		return tnames;
	}
	
	
	/**
	 * @return the tname
	 */
	

	/**
	 * @return the sdate
	 */
	public Date getSdate() {
		return sdate;
	}

	/**
	 * @param sdate the sdate to set
	 */
	public void setSdate(Date sdate)
	{
		this.sdate = sdate;
	}

	/**
	 * @return the edate
	 */
	public Date getEdate() {
		return edate;
	}

	/**
	 * @param edate the edate to set
	 */
	public void setEdate(Date edate) 
	{
		this.edate = edate;
	}
		
	public String execute()
	{
		
		if(search.equals("2"))
		{
			tnames = tourdao.getcost(cost1, cost2);
			
		}
		else if(search.equals("1"))
		{
			tnames=tourdao.get(sdate, edate);
			
		}
		else if(search.equals("3"))
		{
		tnames = tourdao.getduration(duration1, duration2);
	
		}
	return "success";
		
		
		
	}




	
}
