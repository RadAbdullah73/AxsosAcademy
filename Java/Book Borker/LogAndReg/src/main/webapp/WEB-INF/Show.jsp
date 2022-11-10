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
<h1>${thisBook.title}</h1>
<a href="/home">Back to the Shelves! </a> <br>

<c:choose>
<c:when test = "${thisBook.user.id == thisUser.id}">
<a href="/delete/${thisBook.id}">Delete this book </a>
<p>${thisUser.userName} read ${thisBook.title} by ${thisBook.author}</p>
<p>-----------------------------------------------------------------------</p>
<p>Here are ${thisUser.userName} thoughts :</p>
<p>${thisBook.myThoughts}</p>
<a href="/editPage/${thisBook.id}">Edit This Book</a>
 </c:when>
 <c:otherwise>
<p></p>
 </c:otherwise>
</c:choose>




      



</body>
</html>