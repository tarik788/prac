package Mypack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForwardingServe
 */
@WebServlet("/FD1")
public class ForwardingServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForwardingServe() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			ServletContext sc=getServletContext();
			RequestDispatcher rd=sc.getRequestDispatcher("/FD2");
			rd.forward(request,response);
		}
		catch(Exception ee)
		{
			System.out.println("in forwarding"+ee);
		}
	}

}
