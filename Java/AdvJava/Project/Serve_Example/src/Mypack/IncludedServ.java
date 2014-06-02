package Mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncludedServ
 */
@WebServlet("/Id1")
public class IncludedServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IncludedServ() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void service(HttpServletRequest request,HttpServletResponse response)
    {
    	try
    	{
    		response.setContentType("text/html");
    		PrintWriter pw=response.getWriter();
    		pw.println("<i><u>inside included  servlet</i></u><br>");
    	}
    	catch(Exception ee)
    	{
    		System.out.println(ee);
    	}
    }

}
