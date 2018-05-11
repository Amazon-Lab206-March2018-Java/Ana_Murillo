<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
	<div id="wrapper">
		<form id="form" action="/code" method="POST">
			The code: <input type="text" name="code"><br>
			<input type="submit" value="Try Code">
		</form>
		<p id="error"><c:out value="${ errors }"/></p>
		</div>
</body>
</html>