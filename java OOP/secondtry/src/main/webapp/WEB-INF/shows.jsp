<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
		<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show</title>
</head>
<body>
	 <h1><c:out value="${show.showName }" /></h1>
     <p>Network: <c:out value="${show.network }" /> </p>
    
     <form:form method="POST" action="/shows/${show.id}/rating" modelAttribute="userrates">
    Leave a Rating:<input type="number" name="rating" min="1" max="5">
    <form:input path="user" value="${currentUser.id }"/>
    <form:input path="show" value="${show.id }"/>
	<input type="submit" value="Rate" />
	</form:form>
	
     	<a href="/shows/${show.id}/update">Edit</a>
     	<a href="/shows">Dashboard</a>
     	
</body>
</html>