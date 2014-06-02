package mypack;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;
@Validations
public class ListAction extends ActionSupport
{
	private List list;
	@Autowired
	private PackageDAO packagedao;

	public List getList() 
	{
		list = packagedao.getPackages();
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public String execute()
	{
		return "success";
	}
}
