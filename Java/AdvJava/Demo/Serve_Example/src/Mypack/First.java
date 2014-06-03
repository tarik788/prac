package Mypack;

import java.io.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;

@WebServlet(urlPatterns={"/First"})
public class First extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession s=req.getSession();
		PrintWriter out=res.getWriter();
		
		s.setAttribute("gender","male");
out.println("<html><body>");
out.println("<a href=\"" +res.encodeURL("Second")+ "\">click me for second</a>");
out.println("</body></html>");
		

	}
}