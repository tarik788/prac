package mypack;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HttpServletBean;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.Validations;
//import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;
@Validations
public class TourAction extends ActionSupport implements ServletRequestAware
{
	private List alist;
	@Autowired
	private PackageDAO packagedao;
	@Autowired
	private TourinfoDAO tourinfodao;
	private HttpServletRequest request;
	public void setServletRequest(HttpServletRequest hsr)
    {
        request=hsr;
    }
    

	public List getAlist() 
	{	
		System.out.println(request.getParameter("flag"));
		if (request.getParameter("flag").equals("true")) 
		{
			System.out.println(request.getParameter("flag"));
		alist = tourinfodao.getTours(request.getParameter("val"));
		}
		else
		{
			alist = packagedao.getSubPackages(request.getParameter("val"));
		}
		return alist;
	}

	public void setAlist(ArrayList alist) {
		this.alist = alist;
	}

	public String execute()
	{
		if(request.getParameter("flag").equals("true"))
		return "success";
		else 
		return "other";
	}
}
