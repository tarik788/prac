<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../style/Layout.css"></link>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
	<tiles:insertAttribute name="Header" />
	<tiles:insertAttribute name="Navigation" />
	<div id="content-container">
		<div id="content-container2">
			<div id="content-container3">
				<tiles:insertAttribute name="Body" />
			</div>
		</div>
	</div>
	<tiles:insertAttribute name="Footer" />
</body>
</html>