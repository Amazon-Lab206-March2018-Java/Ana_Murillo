<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
		<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Product</title>
</head>
<body>
	<h1>New Product</h1>
	<form:form method="POST" action="/product/new" modelAttribute="product">
	<form:label path="name">Name
	<form:errors path="name" />
	<form:input path="name" /></form:label>

	<form:label path="description">Description
	<form:errors path="description" />
	<form:input type="textarea" path="description" /></form:label>

	<form:label path="price">Age
	<form:errors path="price" />
	<form:input type="number" path="price" step="any"/></form:label>

	<input type="submit" value="Create" />
	</form:form>
	<a href="/category/new">Create new category</a>
</body>
</html>