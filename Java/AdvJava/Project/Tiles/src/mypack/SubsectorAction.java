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
public class SubsectorAction extends ActionSupport implements ServletRequestAware
{
	private List alist;
	@Autowired
	private PackageDAO packagedao;
	private HttpServletRequest request;
	public void setServletRequest(HttpServletRequest hsr)
    {
        request=hsr;
    }
    

	public List getAlist() 
	{	
		alist = packagedao.getSubPackages(request.getParameter("val"));
		return alist;
	}

	public void setAlist(ArrayList alist) {
		this.alist = alist;
	}

	public String execute()
	{
		/*ArrayList ref = packagedao.getPackages();
		if(ref.isEmpty())
		{
			err = "Fail";
		}
		else
		{
			setList(ref);
		}*/
		return "success";
	}
}
