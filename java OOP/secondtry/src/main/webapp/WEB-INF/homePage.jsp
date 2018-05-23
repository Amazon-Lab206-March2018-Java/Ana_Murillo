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
    <h2>TV Shows</h2>
    <table border=1>
    <thead>
		<tr>
			<th>Show</th>
			<th>Network</th>
			<th>Avg Rating</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${show }" var="show">
		<c:set var="avg" value="${0}" />
			<tr>
				<td>
					<a href="/shows/${show.id}">
			<c:out value="${show.showName }" />
				</a>
			</td>
			<td>
				<c:out value="${show.network }" />
			</td>
			<td>
				<c:forEach var="rating" items="${show.userrates}">
				<c:set var="avg" value="${avg + rating.rating}" />
				</c:forEach>
				<c:if test="${avg == 0}">0</c:if>
				<c:if test="${avg != 0}">
				${avg / show.userrates.size()}
				</c:if>
			</td>
			</tr>
		</c:forEach>
	</tbody>
    
    </table>
    <a href="/shows/new">Add Show</a>

    <form id="logoutForm" method="POST" action="/logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Logout!" />
    </form>
</body>
</html>