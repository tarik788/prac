<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<div id="navigation-container">
	<div id="navigation">
		<ul>
			<li><a href="#">Home</a></li>
			<li><a href="#">About</a></li>
			<li><a href="#">Services</a></li>
			<li><a href="#">Contact us</a></li>
		</ul>
	</div>
	<div id="userinfo">
		<ul>
			<li><a href="#">Welcome: <%= request.getRemoteUser() %></a></li>
			<li><a href="#">Logout</a>
		</ul>	
	</div>
</div>