<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="bg.jpg">
	<table border="1" align="center">
		<tr>
			<td align="center"><s:property value="adult" /></td>
			<td align="center">*</td>
			<td align="center"><s:property value="Perperson" />
			<td align="center">=</td>
			<td><s:property value="totaladult" /></td>
		</tr>
		<tr>
			<td align="center"><s:property value="child" />
			<td align="center">*</td>
			<td align="center"><s:property value="Perchild" /></td>
			<td align="center">=</td>
			<td><s:property value="totalchild" /></td>
		<tr>
			<td align="center">TOTAL COST</td>
			<td align="center">=</td>

			<td colspan="3" align="center"><s:property value="amt" /></td>

		</tr>
	</table>


	<table border="1" align="center">
		<tr>
			<td colspan="2">
				<center>
					<b>INVOICE</b>
				</center>
			</td>
		</tr>

		<tr>
			<td>Customer id:</td>
			<td><s:property value="cust.customerId" /></td>
		</tr>


		<tr>
			<td>customer name:</td>
			<td><s:property value="cust.firstName" /></td>
		</tr>

		<tr>
			<td>email address:</td>
			<td><s:property value="cust.email" /></td>
		</tr>

		<tr>
			<td>total amount:</td>
			<td><%=session.getAttribute("totalamt")%></td>
		</tr>
		Passenger Names:
		<s:iterator id="ref" value="per">
			<s:property value="passengerName" />
		</s:iterator>
	</table>

</body>
</html>