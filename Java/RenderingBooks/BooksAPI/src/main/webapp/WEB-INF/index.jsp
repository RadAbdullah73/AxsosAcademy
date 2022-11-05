<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<h1>All Books</h1>
<table border="1">
    <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Language</th>
            <th>Number of Pages</th>
        </tr>
    </thead>
    <tr>
     <c:forEach var="book" items="${books}">
        <td><p><c:out value="${book.id}"></c:out></p></td>
        <td><p><a href="books/${book.id}" ><c:out value="${book.title}"></c:out></a></p></td>
        <td><p><c:out value="${book.language}"></c:out></p></td>
          <td><p><c:out value="${book.numberOfPages}"></c:out></p></td>
    </c:forEach>
    </tr>
</table>
</body>
</html>