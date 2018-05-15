<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Info</title>
	</head>

	<body>
		 <h1>${ninja[0].dojo.name} Ninjas</h1>
		<table border="1">
			<thead>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ninja }" var="ninja">
					<tr>
						<td>
							<c:out value="${ninja.firstName }" />
						</td>
						<td>
							<c:out value="${ninja.lastName }" />
						</td>
						<td>
							<c:out value="${ninja.age }" />
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="/ninja/new">Create new ninja</a>
		<a href="/dojo/new">Create new dojo</a>
	</body>

	</html>