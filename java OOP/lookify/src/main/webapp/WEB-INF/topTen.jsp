<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		<html>

		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<title>Top Ten</title>
		</head>

		<body>
			<h3>Top Ten Songs:</h3>
			<Table border=1>
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
								<c:out value="${song.rating }" />
							</td>
							<td>
								<a href="/Songs/${song.id}">
									<c:out value="${song.title }" />
								</a>
							</td>
							<td>
								<c:out value="${song.artist }" />
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</body>

		</html>