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
<a href="/" >Home</a>
<hr>
<div>
<form:form action="/createProducte" method="post" modelAttribute="prod">
    <p>
        <form:label path="name">Name : </form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="description">Description : </form:label>
        <form:errors path="description"/>
        <form:input path="description"/>
    </p>
    <p>
        <form:label path="price">Price : </form:label>
        <form:errors path="price"/>
        <form:input path="price"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>  
</div>

</body>
</html>