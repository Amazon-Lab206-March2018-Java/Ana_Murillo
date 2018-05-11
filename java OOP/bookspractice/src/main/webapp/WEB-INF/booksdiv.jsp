<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Books</title>
</head>
<body>
	<div>
		<c:forEach items= "${books }" var="book">
			<div>
				<c:out value= "${book.title }"/>
				<c:out value= "${book.description }"/>
				<c:out value= "${book.language }"/>
				<c:out value= "${book.numberOfPages }"/>
			</div>
		</c:forEach>
	</div>
</body>
</html>