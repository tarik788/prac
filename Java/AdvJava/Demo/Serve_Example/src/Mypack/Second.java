package Mypack;

import java.io.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;

@WebServlet("/Second")
public class Second extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		pw.println("i am second");
				
		HttpSession session=req.getSession(false);
		pw.println(session.getAttribute("gender"));
		if(session.isNew())
		{
			pw.println("it is new");
		}
		else
		{
			pw.println("it is not new");
		}
		pw.println("<a href= \""+res.encodeURL("Third")+"\">click Here for third</a>");
	}
}