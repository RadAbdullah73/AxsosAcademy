<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
<style>
th{
background-color: black ; 
color : white ; 
font-family : cursive ;  
}
td{
font-family : cursive ;
}
Table{
margin : 0 auto ;
margin-top : 10% ;
}
</style>
</head>
<body>
<Table border="1">
<tr>
<th>Name</th>
<th>Price</th>
</tr>
  <c:forEach var="fruit" items="${list}">
        <tr><td><c:out value="${fruit.name}"></c:out></td><td><c:out value="${fruit.price}"></c:out></td></tr>
    </c:forEach>
</Table>

</body>
</html>