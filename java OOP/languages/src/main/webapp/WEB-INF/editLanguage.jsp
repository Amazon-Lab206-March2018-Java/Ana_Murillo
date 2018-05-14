<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit</title>
</head>
<body>
	<a href="/languages">Dashboard</a>
	<a href="/languages/delete/${id}">Delete</a>
	<form:form method="POST" action="/languages/edit/${id}" modelAttribute="language" >
	<form:hidden path="id"/>
	
    <form:label path="name">Name
    <form:errors path="name"/>
    <form:input path="name"/></form:label>
    
    <form:label path="creator">Creator
    <form:errors path="creator"/>
    <form:textarea path="creator"/></form:label>
    
    <form:label path="currentVersion">Version
    <form:errors path="currentVersion"/>
    <form:input type="number" path="CurrentVersion"/></form:label>
    
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>