<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div id="navigation-container">
	<div id="navigation">
		<ul>
			<li><a href="Home.action">Home</a></li>
			<li><a href="Employee.action">Employee</a></li>
			<li><a href="Leave.action">Leave</a></li>
			<li><a href="Payroll.action">Payroll</a></li>
			<li><a href="Password.action">Change Password</a></li>
		</ul>
		<div id="userinfo">
			<ul>
				<li><a href="#">Welcome: <%=request.getRemoteUser()%></a></li>
				<li><a href="../Logout.jsp">Logout</a>
			</ul>
		</div>
	</div>

</div>