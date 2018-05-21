<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
		<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Idea</title>
</head>
<body>
	<h1>Create new idea</h1>
	<form:form method="POST" action="/ideas/new" modelAttribute="idea">
	<form:label path="ideaName">Name
	<form:errors path="ideaName" />
	<form:input path="ideaName" /></form:label>
	<form:hidden path="creator" value="${currentUser.id }"/>
	<input type="submit" value="Create" />
	</form:form>
	<a href="/ideas">Dashboard</a>
</body>
</html>