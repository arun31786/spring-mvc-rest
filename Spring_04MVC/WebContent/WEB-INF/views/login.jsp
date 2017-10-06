<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="/Spring_04MVC/mvc/login" method="post">
		<label>Username</label>
		<input type="text" placeholder="Enter your username" name="user"/><br/>
		<label>Password</label>
		<input type="password" placeholder="Enter your password" name="pwd"/><br/>
		<input type="submit" value="Login"/>
		<input type="reset" value="Clear form"/>
	</form>	
</body>
</html>