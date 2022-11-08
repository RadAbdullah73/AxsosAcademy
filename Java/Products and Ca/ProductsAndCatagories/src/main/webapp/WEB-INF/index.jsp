<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Home</title>
<style>
th,td{
width : 20%
}
main{
display : flex ; 
width : 30% ;
margin : 0 auto ; 
}
div{
padding : 3 % ;
width : 30% ;
}
.right{
margin-left : 5% ;
border-left : 2px solid black ; 
padding-left : 7% ;
}
a{
text-decoration : none ;
}
h2{
font-family : cursive ; 
color: red ;
}
</style>
</head>
<body>
<h1>Home Page</h1>
<a href="/products/new">New Product</a> <br>
<a href="/catogeries/new" >New Category</a>
<hr>

<main>
<div>
<h2>Products</h2>
<c:forEach var="prd" items="${AllProducts}">
<a href="/products/${prd.id}"><p>${prd.name}</p></a>
</c:forEach>
</div>
<div class="right">
<h2>Categories</h2>
<c:forEach var="cat" items="${AllCatog}">
<a href="/catogeries/${cat.id}"><p>${cat.name}</p></a>
</c:forEach>
</div>
</main>

</body>
</html>