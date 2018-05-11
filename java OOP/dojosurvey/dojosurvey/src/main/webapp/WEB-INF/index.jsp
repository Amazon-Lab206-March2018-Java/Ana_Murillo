<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
	<div id="wrapper">
	<form id="form" action="/submit" method="POST">
		Your Name: <input type="text" name="name"><br>
		Dojo Location: <select name="location">
			  	<option value="Arizona">Arizona</option>
			  	<option value="Costa Rica">Costa Rica</option>
			  	<option value="Seattle">Seattle</option>
				</select><br>
		Favorite Language: <select name="language">
			  	<option value="Java">Java</option>
			  	<option value="Python">Python</option>
			  	<option value="Javascript">Javascript</option>
				</select><br>
		Comment (optional): <textarea name="comment" rows="20" cols="30"></textarea><br>
		<input type="submit" value="Submit">
	</form>
	</div>
</body>
</html>