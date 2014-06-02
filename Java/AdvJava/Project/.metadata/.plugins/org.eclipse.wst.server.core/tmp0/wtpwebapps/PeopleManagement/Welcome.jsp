<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to "People Management"</title>
<style type='text/css'>
.body {
	margin: 0;
	padding: 0;
}

#content-container {
	width: 100%;
	float: left;
}

#content {
	margin: 0 auto;
	width: 900px;
}

#center {
	width: 450px;
	margin: 0 auto;
}

#tblCenter {
	margin-left:100px;
}
</style>
</head>
<body>
	<div id="content-container">
		<div id="content">
			<div id="center">
				<h1>Welcome to PeopleManagement</h1>
				<form action="j_security_check" method="post">
					<table id="tblCenter">
						<tr>
							<th colspan="2">Login</th>
						</tr>
						<tr>
							<td>User Name:</td>
							<td><input type='text' name="j_username" /></td>
						</tr>
						<tr>
							<td>User Password:</td>
							<td><input type='password' name="j_password" /></td>
						</tr>
						<tr>
							<td style='text-align: center' colspan="2"><input
								type='submit' name="btnSubmit" /></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
</body>
</html>