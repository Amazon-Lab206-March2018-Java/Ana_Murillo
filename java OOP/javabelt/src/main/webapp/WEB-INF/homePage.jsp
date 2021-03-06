<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dashboard</title>
</head>
<body>
    <h1>Welcome, <c:out value="${currentUser.name}"></c:out></h1>
    <h2>Ideas</h2>
    <table border=1>
    <thead>
		<tr>
			<th>Ideas</th>
			<th>Created by</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${idea }" var="idea">
			<tr>
				<td>
					<a href="/ideas/${idea.id}">
			<c:out value="${idea.ideaName }" />
				</a>
			</td>
			<td>
				<c:out value="${idea.creator.name }" />
			</td>
			</tr>
		</c:forEach>
	</tbody>
    
    </table>
    <a href="/ideas/new">Create an idea</a>

    <form id="logoutForm" method="POST" action="/logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Logout!" />
    </form>
</body>
</html>