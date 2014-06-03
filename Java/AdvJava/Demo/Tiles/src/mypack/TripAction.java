package mypack;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.Validations;
//import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;
@Validations
public class TripAction extends ActionSupport implements ServletRequestAware,SessionAware
{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("rawtypes")
	private Map session;
	private HttpServletRequest request;
	public void setServletRequest(HttpServletRequest hsr)
    {
        request=hsr;
    }
    
	
	private String tourid;
	
	

	@SuppressWarnings("unchecked")
	public String execute()
	{
		try
		{
		tourid=request.getParameter("val");
		session.put("tourid",tourid);
		System.out.println("tourid  = "+tourid);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "success";
	}



	@Override
	public void setSession(Map<String, Object> arg0) {
		session= arg0;
		
	}
}
