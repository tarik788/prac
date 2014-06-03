package com.webauth.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validator
 */
@WebServlet("/Validator")
public class Validator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static Map myMap;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Validator() {
		super();
		myMap = new HashMap<String, UserInfo>();
		myMap.put("user1", new UserInfo("user1", "andheri"));
		myMap.put("user2", new UserInfo("user2", "andheri"));
		myMap.put("user3", new UserInfo("user3", "andheri"));
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	PrintWriter wr =	response.getWriter();
	wr.print("<h1>Hello</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		ServletRequest req = (ServletRequest) request
				.getAttribute("javax.servlet.forward.request_uri");
       if(myMap.containsKey(userName)){
    	   if(((UserInfo)myMap.get(userName)).password.equals(password)){
    		   	response.sendRedirect("Secure/SecureHome");
    	   }
    	   else{
    		   response.sendRedirect("Error.jsp");
    	   }
       }
	}

}
