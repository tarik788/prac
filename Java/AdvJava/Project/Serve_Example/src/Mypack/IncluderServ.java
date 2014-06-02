package Mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncluderServ
 */
@WebServlet("/Id2")
public class IncluderServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IncluderServ() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void service(HttpServletRequest request,HttpServletResponse response)
    {
    	try
    	{
    		response.setContentType("text/html");
    		PrintWriter pw=response.getWriter();
    		pw.println("<b>this is a main servlet</b><br>");
    		ServletContext context=getServletContext();
    		RequestDispatcher rd=context.getRequestDispatcher("/Id1");
    		rd.include(request,response);
    		pw.println("<b>coming back to main servlet</b>");
    		
    	}
    	catch(Exception ee)
    	{
    		System.out.println(ee);
    	}
    }
}
