<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>All Ninjas</title>
</head>
<body>
<table border="1">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Age</th>
</tr>

<c:forEach var="CurrentNinjas" items="${ThisDojo.ninjas}">
<tr>
<td>${CurrentNinjas.firstName}</td>
<td>${CurrentNinjas.lastName}</td>
<td>${CurrentNinjas.age}</td>
</tr>
</c:forEach>

</table>

</body>
</html>