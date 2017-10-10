<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp Page</title>
</head>
<body>

	<h1>SignUp Form</h1>
	
		<form:form method="POST" commandName="user">
		<table>
			<tr>
				<td>Enter your name:</td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssStyle="color: RED;"/></td>
			</tr>
			<tr>
				<td>Enter your lastname:</td>
				<td><form:input path="lastname" /></td>
				<td><form:errors path="lastname" cssStyle="color: RED;" /></td>
			</tr>
			<tr>
				<td>Enter your password:</td>
				<td><form:input path="password" /></td>
				<td><form:errors path="password" cssStyle="color: RED;" /></td>
			</tr>
			<tr>
				<td>Enter your zip:</td>
				<td><form:input path="zip" /></td>
				<td><form:errors path="zip" cssStyle="color: RED;" /></td>
			</tr>
			<tr>
				<td>Enter your email:</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssStyle="color: RED;" /></td>
			</tr>
			<tr>
				<td>Enter your age:</td>
				<td><form:input path="age" /></td>
				<td><form:errors path="age" cssStyle="color: RED;" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Submit"></td>
			</tr>
			<tr>
		</table>
	</form:form>


</body>
</html>