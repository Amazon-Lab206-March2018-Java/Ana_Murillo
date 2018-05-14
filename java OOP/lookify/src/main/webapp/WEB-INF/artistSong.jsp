<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Artist Song</title>
	</head>

	<body>
		<form action="/search">
			<input type="text" name="artist">
			<input type="submit" value="New Search">
		</form>
		<a href="/Songs">Dashboard</a>

		<table border=1>
			<thead>
				<tr>
					<th>Name</th>
					<th>Rating</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${song }" var="song">
					<tr>
						<td>
							<a href="/Songs/${song.id}">
								<c:out value="${song.title }" />
							</a>
						</td>
						<td>
							<c:out value="${song.rating }" />
						</td>
						<td>
							<a href="/Songs/delete/${song.id}">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>

	</html>