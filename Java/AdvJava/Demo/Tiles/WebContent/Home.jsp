<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ taglib prefix="s" uri="/struts-tags" %>
 <%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
 <%@taglib uri="http://displaytag.sf.net" prefix="display"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="bg.jpg">
<display:table name="costlist" pagesize="2" style="" export="true" sort="list" id="itemName" class="displaytag" requestURI="myaction2.action"  >  
                        
<display:setProperty name="basic.empty.showtable" value=""  />
                         <display:setProperty 

name="export.pdf.filename" value="OccupantDetails.pdf" /> 
<%-- <display:column  property="costId" title="costId" style="text-align:center;" media="all" ></display:column>
<display:column  property="subCategoryId" title="subCategoryId" style="text-align:center;" media="all" ></display:column>--%>
<display:column  property="baseCost" title="BasicCost" style="text-align:center;"  media="all" ></display:column>
<display:column  property="extraAdult" title="ExtraAdult" style="text-align:center;" media="all"  ></display:column>
<display:column  property="childWithBed" title="ChildWithBed" style="text-align:center;" media="all"  ></display:column>
<display:column  property="childWithoutBed" title="ChildWithoutBed"  style="text-align:center;" media="all" ></display:column>
<display:column  property="singlePerson" title="SinglePerson"  style="text-align:center;" media="all" ></display:column>
</display:table>

</body>
</html>