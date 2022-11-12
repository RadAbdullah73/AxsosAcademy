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
<h1>Hello ${thisUser.firstName}</h1>
<a href="logout" >LogOut</a>
<br>
<div>
<h2>All Projects</h2>
<form action="new/project">
<input type=submit value="+ New Project">
</form>
</div>
<hr>
<table border="1">
<tr>
<th>Project</th>
<th>Team Lead</th>
<th>Due Date</th>
<th>Actions</th>
</tr>

<c:forEach var="project" items="${AllProjectsNotJoin}">
<tr>
<td><a href="/projects/${project.id}">${project.title}</a></td>
<td>${project.userLead.firstName }</td>
<td>${project.dueDate}</td>
<c:choose>
<c:when test = "${project.userLead.id == thisUser.id }">
<td><a href="/editPage/${project.id}">Edit</a></td>
</c:when>
<c:otherwise>
<td><a href="/JoinTeam/${project.id}">Join Team</a></td>
  </c:otherwise>
 </c:choose>

</tr>
</c:forEach>
</table>
<hr>
<h1>My projects : </h1>
<table border="1">
<tr>
<th>Project</th>
<th>Team Lead</th>
<th>Due Date</th>
<th>Actions</th>
</tr>

<c:forEach var="project" items="${AllProjectsThatAreJoin}">
<tr>
<td><a href="/projects/${project.id}">${project.title}</a></td>
<td>${project.userLead.firstName }</td>
<td>${project.dueDate}</td>
<c:choose>
<c:when test = "${project.userLead.id == thisUser.id }">
<td><a href="/editPage/${project.id}">Edit</a></td>
</c:when>
<c:otherwise>
<td><a href="/LeaveTeam/${project.id}">Leave Team</a></td>
  </c:otherwise>
 </c:choose>

</tr>
</c:forEach>
</table>


</body>
</html>