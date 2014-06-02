package Mypack;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Rd1")
public class RedirectingServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RedirectingServ() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("in redirecting");
			
response.sendRedirect("Rd2");
//response.sendRedirect("http://param:8080");
		}
		catch(Exception ee)
		{
			System.out.println("in forwarding"+ee);
		}
	}
}
