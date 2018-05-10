<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>
	<form id="form" action="/">
		<h1>Submitted info</h1>
		<p>Name: <c:out value="${name }"/></p>
		<p>Location: <c:out value="${location }"/></p>
		<p>Favorite Language: <c:out value="${language }"/></p>
		<p>Comment: <c:out value="${comm }"/></p>
		<input type="submit" value="Go Back">
	</form>
</body>
</html>