<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="j_security_check" method="post">
<label>Username:</label><input type="text" name="j_username" /></br>
<label>Password:</label><input type="password" name="j_password" /></br>
<input type="submit" id="btnSubmit" value="Login" />
</form>
</body>
</html>