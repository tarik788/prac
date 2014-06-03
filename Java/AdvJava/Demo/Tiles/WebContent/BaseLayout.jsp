<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body background="bg.jpg">
<table cellpadding="2" cellspacing="2" align="center" height="100%" width="100%">
    <tr>
        <td height="20%"  colspan="3"><tiles:insertAttribute name="header" />
        </td>
    </tr>
    <tr>
    	<td width="10%" height="auto"><tiles:insertAttribute name="lhs" /></td>
    	<td width="80%" height="auto"><tiles:insertAttribute name="body" /></td>
        <td width="10%" height="auto"><tiles:insertAttribute name="rhs" /></td>
    </tr>
    <tr>
        <td height="20%" colspan="3"><tiles:insertAttribute name="footer" />
        </td>
    </tr>
</table>
</body>
</html>

