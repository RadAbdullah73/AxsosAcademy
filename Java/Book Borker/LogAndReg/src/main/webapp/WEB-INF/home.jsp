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
<h1>Welcome ${thisUser.userName}</h1>
<h2>Book from everyon's shelves</h2>
<h3><a href="/books/new">Add to my shelf!</a></h3>
<table border="1">
<tr>
<th>ID</th>
<th>Title</th>
<th>Author Name</th>
<th>Posted By</th>
</tr>

<c:forEach var="book" items="${AllBooks}">
<tr>
<td>${book.id}</td>
<td><a href="/books/${book.id}">${book.title}</a></td>
<td>${book.author}</td>
<td>${book.user.userName}</td>
</tr>
</c:forEach>

</table>
<a href="logout" >LogOut</a>
<a href="BookMarket">Go to Market</a>

</body>
</html>