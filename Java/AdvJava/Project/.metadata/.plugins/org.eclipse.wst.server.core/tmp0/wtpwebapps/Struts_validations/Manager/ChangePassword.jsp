<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<div id="content">

	<form action="ChangePassword.action" method="post">
		<table>
			<tr>
				<td><s:password name="oldPassword" label="OldPassword"></s:password></td>
			</tr>
			<tr>
				
				<td><s:password name="newPassword" label="NewPassword"></s:password></td>
			</tr>
			<tr>
				
				<td><s:password name="retypedPassword" label="RetypePassword"></s:password></td>
			</tr>
			<tr>
				<td colspan="2" class="center"><input type='submit' id='btnSubmit'
					value='Save' /></td>
			</tr>
			<tr>
				<td colspan="2"><label class="message center"><s:property value="message" /></label></td>
			</tr>
		</table>
	</form>
</div>