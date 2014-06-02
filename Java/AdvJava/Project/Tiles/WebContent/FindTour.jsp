<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sj:head jquerytheme="smoothness" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="bg.jpg">
	<form action="go" method="get">


		<table border="1" bordercolor="red" width="100%" height="auto">
			<tr>
				<td>Search on</td>
			</tr>
			<tr>
				<td><s:radio label="" name="search" list="#{'1':'Period'}" />

					From <sj:datepicker name="sdate" label="Enter Tour Date:"
						yearRange="1970:2014" changeMonth="true" changeYear="true"
						size="10px" /> To <sj:datepicker name="edate"
						label="Enter Tour Date:" yearRange="1970:2014" changeMonth="true"
						changeYear="true" /></td>
			</tr>

			<tr>
				<td><s:radio label="" name="search" list="#{'2':'PriceBand'}" />

					FROM<s:textfield name="cost1" label="From"></s:textfield>TO<s:textfield
						name="cost2" label="To"></s:textfield></td>
			</tr>
			<tr>
				<td><s:radio label="" name="search" list="#{'3':'Duration'}" />
					FROM<s:textfield name="duration1" label="From"></s:textfield> TO <s:textfield
						name="duration2" label="To"></s:textfield></td>
			</tr>

			<tr>
				<td><s:submit value="Find"></s:submit></td>
			</tr>
		</table>

	</form>
	<br>
	<br>
	<display:table name="tnames" pagesize="2" style="" export="true"
		sort="list" id="itemName" class="displaytag" requestURI="go.action">

		<display:setProperty name="basic.empty.showtable" value="" />
		<%-- <display:setProperty 

name="export.pdf.filename" value="OccupantDetails.pdf" /> --%>
		<display:column property="searchId" title="searchId"
			style="text-align:center;" media="all"></display:column>
		<display:column property="subCategoryId" title="subCategoryId"
			style="text-align:center;" media="all"></display:column>
		<display:column property="startDate" title="startDate"
			style="text-align:center;" media="all"></display:column>
		<display:column property="endDate" title="endDate"
			style="text-align:center;" media="all"></display:column>
		<display:column property="duration" title="duration"
			style="text-align:center;" media="all"></display:column>
		<display:column property="cost" title="cost"
			style="text-align:center;" media="all"></display:column>
		<display:column property="description" title="description"
			style="text-align:center;" media="all"></display:column>
	</display:table>

</body>
</html>