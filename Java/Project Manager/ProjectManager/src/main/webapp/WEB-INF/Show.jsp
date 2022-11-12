<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<h1>Project Details</h1>
<br>
<h2>Project : ${thisProject.title}</h2>
<h2>Description : ${thisProject.description}</h2>
<h2>Due Date :  ${thisProject.dueDate} </h2>
<hr>
<a href="/home">Back to Dashboard</a>
<hr>
<c:choose>
<c:when test = "${thisProject.userLead.id == thisUser.id }">
<td><a href="/del/${thisProject.id}">Delete Project</a></td>
</c:when>
<c:otherwise>
  </c:otherwise>
 </c:choose>


</body>
</html>