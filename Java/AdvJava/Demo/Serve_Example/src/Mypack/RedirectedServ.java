package Mypack;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Response redireected here", urlPatterns = { "/Rd2" })
public class RedirectedServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RedirectedServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("In RedirectedServlet");
				}
		catch(Exception ee)
		{
			System.out.println("in forwarding"+ee);
		}
	}

}
