package mypack;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

public class ItineraryAction  implements SessionAware
{
	private String subCategoryId;
	@Autowired
	private ItineraryDAO itdao;
	private HttpServletRequest request;
	@SuppressWarnings("unused")
	private List iterlist;
	private Map session;
	private String tourid;
	/*public String getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}*/
	public List getIterlist() {
		return iterlist;
	}
	public void setIterlist(List iterlist) {
		this.iterlist = iterlist;
	}
	public String execute()
	{
		tourid = (String) session.get("tourid");
		System.out.println(tourid);
		iterlist=itdao.getIList(tourid);
		System.out.println(iterlist);
		return "success";
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		session = arg0;
	}
	}
	

