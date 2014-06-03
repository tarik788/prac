<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <style >
    	.icon
		{
			border:1px solid red;
			margin-left:30px;
			margin-top:40px;
			width:15%;
			height:100px;
			float:left;
			text-align:center;
			cursor:pointer;
			font-size:20px;
		}
    </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body background="bg.jsp">
    <form>
    <s:iterator id="ref" value="alist">
    <a href="infotour.action?val=<s:property value ="subCategoryId"/>">
    <div class="icon">
   <!--  <img width="100px" height="100px"  src="<s:property value ="imgPath"/>"/>  -->
    <s:property value ="productDesc"/>
    <s:property value ="cost"/>
    </div>
    </a>
    </s:iterator>
       </form>
    </body>
</html>