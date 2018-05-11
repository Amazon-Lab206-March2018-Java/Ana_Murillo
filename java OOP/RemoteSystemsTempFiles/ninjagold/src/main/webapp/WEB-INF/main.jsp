<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ninja Gold</title>
</head>
<body>
<div id="wrapper">
	<p>Your Gold</p> 
	<p><c:out value = "${ gold }"/></p>
	<form action="/reset">
		<input type="submit" value="reset"/>
	</form>
	<form class = "form" action="/process_money" method="post">
        <h4>Farm</h4>
        <p>(earns 10-20 golds)</p>
        <input type="hidden" name="building" value="farm" />
        <input type="submit" value="Find Gold!"/>
    </form>
    <form class = "form" action="/process_money" method="post">
        <h4>Cave</h4>
        <p>(earns 5-10 golds)</p>
        <input type="hidden" name="building" value="cave" />
        <input type="submit" value="Find Gold!"/>
    </form>
    <form class = "form" action="/process_money" method="post">
        <h4>House</h4>
        <p>(earns 2-5 golds)</p>
        <input type="hidden" name="building" value="house" />
        <input type="submit" value="Find Gold!"/>
    </form>
    <form class = "form" action="/process_money" method="post">
        <h4>Casino</h4>
        <p>(earns/takes 0-50 golds)</p>
        <input type="hidden" name="building" value="casino" />
        <input type="submit" value="Find Gold!"/>
    </form>
    <p>Activities:</p>
    <div id="act">
        <c:forEach var ="activity" items="${Activities}">
            <p id=<c:out value = "${ activity.color }"/>><c:out value = "${ activity.message }"/></p>
        </c:forEach>
    </div>
</div>
</body>
</html>