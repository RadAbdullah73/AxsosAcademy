<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Product Page</title>
</head>
<body>
<h1>${thisPrd.name}</h1>
<a href="/" >Home</a>
<hr>
<h2>Categories</h2>
<c:forEach var="cat" items="${thisPrd.categories}">
<h3>${cat.name}</h3>
</c:forEach>
<hr>
<h2>Add Category</h2>
<form action="/AddCat/${thisPrd.id}" method="post">
  <select name="catagory">
        <c:forEach var="Cat" items="${allCat}">
            <option value="${Cat.id}">
               ${Cat.name}
            </option>
        </c:forEach>
    </select>
      <input type="submit" value="Add"/>
<form>  

</body>
</html>