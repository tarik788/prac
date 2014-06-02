<%@page import="mypack.FormAction"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib  prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%> 
<html>
<head>
<sj:head jquerytheme="lightness"/>
<title>Add</title>
<script type="text/javascript">
	function addRow(tableID) 
	{
		var table = document.getElementById(tableID);

		var rowCount = table.rows.length;
		var row = table.insertRow(rowCount);
		var counts=rowCount-1;

		var cell1 = row.insertCell(0);
		var name= document.createElement("input");
		name.type = "text";
		name.name="cust.person["+counts+"].passengerName";
		cell1.appendChild(name);

		var cell2 = row.insertCell(1);
		var gender = document.createElement("input");
		gender.type = "text";
		gender.name="cust.person["+counts+"].gender";
		cell2.appendChild(gender);

		var cell3 = row.insertCell(2);
		var age = document.createElement("input");
		age.type = "text";
		age.name="cust.person["+counts+"].age";
		cell3.appendChild(age);
	}
</script>
</head>
<body background="bg.jpg">
	<s:form action="submit" theme="simple">

  Name:  <s:textfield name="cust.firstName" label="First Name"/>
  <br><br>
  Middle Name:<s:textfield name="cust.middleName" label="Middle Name"/>
  <br><br>
  Last Name:  <s:textfield name="cust.lastName" label="Last Name"/>
  <br><br>
  Flat No: <s:textfield name="cust.flatNumber" label="Flat Number"/>
  <br><br>
  Building Name:  <s:textfield name="cust.building" label="Building"/>
  <br><br>
  Street: <s:textfield name="cust.street" label="Street"/>
  <br><br>
  City:  <s:textfield name="cust.area" label="Area"/>
  <br><br>
  State:  <s:textfield name="cust.state" label="State"/>
  <br><br>
  PinCode:  <s:textfield name="cust.pin" label="Pin"/>
  <br><br>
  Contact No:  <s:textfield name="cust.contactNo" label="Contact No"/>
  <br><br>
  E-Mail ID: <s:textfield name="cust.email" label="Email"/>
  
  
  <br><br>
  
    Pax Details :
    <TABLE id="paxdetailsTable" width="350px" border="1">
    	<TR>
		
		<TD>Name</TD>
		<TD>Gender</TD>
		<TD>Age</TD>
	</TR>
	
	<TR>
	<TD><s:textfield name="cust.person[0].passengerName"/></TD>
    <TD><s:textfield name="cust.person[0].gender"/></TD>
	<TD><s:textfield name="cust.person[0].age"/></TD>
	</TR>
    </TABLE><br>
<INPUT type="button" value="Add Pax" onclick="addRow('paxdetailsTable')" />
<br><br>
<s:submit action="pay"></s:submit>
</s:form>

<br/>
<br/>
<!-- 
<s:iterator id="ref" value="list">
    <s:property value ="ref"/><br/>
    </s:iterator>
     
     -->
</body>
</HTML>