<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
		<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Show</title>
</head>
<body>
	<h1>Create new show</h1>
	<form:form method="POST" action="/shows/new" modelAttribute="show">
	<form:label path="showName">Name
	<form:errors path="showName" />
	<form:input path="showName" /></form:label>
	
	<form:label path="network">Network
	<form:errors path="network" />
	<form:input path="network" /></form:label>

	<input type="submit" value="Create" />
	</form:form>
	<a href="/shows">Dashboard</a>
</body>
</html>