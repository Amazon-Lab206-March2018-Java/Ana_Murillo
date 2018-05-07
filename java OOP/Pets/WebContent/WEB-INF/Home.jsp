<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Pet</title>
</head>
<body>
<form action="/Pets/Show" method="get">
	<h1>Make a Dog!</h1>
	<input type="hidden" value="2" name="Animal">
 	<label> Name <input type="text" name="Name"> </label>
   	<label> Breed <input type="text" name="Breed"> </label>
    <label> Weight <input type="text" name="Weight"> </label>
	<input type="submit">
</form>
<form action="/Pets/Show" method="get">
	<h1>Make a Cat!</h1>
	<input type="hidden" value="1" name="Animal">
 	<label> Name <input type="text" name="Name"> </label>
   	<label> Breed <input type="text" name="Breed"> </label>
    <label> Weight <input type="text" name="Weight"> </label>
	<input type="submit">
</form>
</body>
</html>