<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if(request.isUserInRole("employee")){ %>
<h1>You have got admin role : <%= request.getRemoteUser() %></h1>
<%}else{ %>
<h1>You don't have admin access : <%= request.getRemoteUser() %></h1>
<%} %>

<h1> Welcome to protected page</h1>
</body>
</html>