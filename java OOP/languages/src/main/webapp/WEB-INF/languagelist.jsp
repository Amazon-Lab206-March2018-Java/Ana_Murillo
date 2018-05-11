<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
		<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
			<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
			<html>

			<head>
				<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
				<title>Insert title here</title>
			</head>

			<body>
				<table>
					<thead>
						<tr>
							<th>Name</th>
							<th>Creator</th>
							<th>Version</th>
							<th>action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${languages }" var="language" varStatus="loop">
							<tr>
								<td>
									<a href="/languages/${loop.index}">
										<c:out value="${language.name }" />
									</a>
								</td>
								<td>
									<c:out value="${language.creator }" />
								</td>
								<td>
									<c:out value="${language.currentVersion }" />
								</td>
								<td>
									<a href="/languages/edit/${loop.index}">Edit</a>
									<a href="/languages/delete/${loop.index}">Delete</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<form:form method="POST" action="languages/new" modelAttribute="language">
					<form:label path="name">Name
						<form:errors path="name" />
						<form:input path="name" /></form:label>

					<form:label path="creator">Creator
						<form:errors path="creator" />
						<form:textarea path="creator" /></form:label>

					<form:label path="currentVersion">Version
						<form:errors path="currentVersion" />
						<form:input type="number" path="currentVersion" /></form:label>

					<input type="submit" value="Submit" />
				</form:form>
			</body>

			</html>