package Mypack;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
//import pack.*;

@WebServlet("/Bs")
public class BeanServ extends HttpServlet
{
	public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException
	{
		PrintWriter pw=response.getWriter();
		Bean1 b1=new Bean1();
		pw.println(b1.getMess());
		Bean2 b2=new Bean2();
		pw.println("<br>");
		pw.println(b2.getVal());		
		
	}
}
		

		