<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Categories Page</title>
</head>
<body>
<h1>${thisCat.name}</h1>
<a href="/" >Home</a>
<hr>
<h2>Products</h2>
<c:forEach var="prd" items="${thisCat.products}">
<h3>${prd.name}</h3>
</c:forEach>
<hr>
<h2>Add Product</h2>
<form action="/AddPrd/${thisCat.id}" method="post">
  <select name="product">
        <c:forEach var="prd" items="${allProd}">
            <option value="${prd.id}" >
                ${prd.name}
            <option>
        </c:forEach>
    <select>
      <input type="submit" value="Add"/>
<form>  

</body>
</html>