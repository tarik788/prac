package mypack;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

public class CostAction implements SessionAware
{

	private String subCategoryId= "1";
	@Autowired
	private CostDAO costdao;
	@SuppressWarnings("rawtypes")
	private Cost costlist;
	private Map session;
	/*public String getSubCategoryId() {
	return subCategoryId;
	}
	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}*/
	
	String tourid;
	public String execute()
	{
		tourid = (String) session.get("tourid");
		costlist = costdao.getCost(tourid);
		return "success";
		
	}


	public Cost getCostlist() {
		return costlist;
	}


	public void setCostlist(Cost costlist) {
		this.costlist = costlist;
	}


	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		session =  arg0;
	}
}
