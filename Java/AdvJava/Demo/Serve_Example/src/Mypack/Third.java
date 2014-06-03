package Mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Third
 */
@WebServlet("/Third")
public class Third extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Third() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw = response.getWriter();
	pw.println("In the third Servlet");
	
	HttpSession session=request.getSession(false);
	
	pw.println(session.getAttribute("gender"));
	
	}

}
