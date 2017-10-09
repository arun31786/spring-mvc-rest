<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RegisterPage</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>

<div class="container-fluid">
	<div class="row">
		<form action="/Spring_04MVC/mvc/register2" method="post">
  <div class="form-group">
    <label for="name">Name</label>
    <input type="text" class="form-control" id="name" placeholder="Name" name="name" pattern="[a-zA-Z]+" required>
  </div>
  
  <div class="form-group">
    <label for="email">Email</label>
    <input type="email" class="form-control" id="email" placeholder="Email" name="email" required>
  </div>
  
  <div class="form-group">
    <label for="age">Age</label>
    <input type="number" min="18" max="60" class="form-control" id="age" placeholder="Age" name="age">
  </div>

<div>  
    <input type="radio" class="form-control" id="male" value="Male" name="gender">Male
    <input type="radio" class="form-control" id="male" value="Female" name="gender">Female
  </div>
  <div class="form-group">
    <label for="pwd">Password</label>
    <input type="password" class="form-control" id="pwd" placeholder="Password" name="pwd" required>
  </div>
  
  <div class="form-group">
    <label for="pwd2">Confirm Password</label>
    <input type="password" class="form-control" id="pwd2" placeholder="Confirm password" required>
  </div>
  
  
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
	</div>
</div>

</body>
</html>