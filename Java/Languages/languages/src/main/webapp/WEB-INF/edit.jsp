<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Edit here</title>
</head>
<body>
<form:form action="/updateLang/${thisLan.id}" method="post" modelAttribute="language">
<input type="hidden" name="_method" value="put">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name" value="${thisLan.name}"/>
    </p>
    <p>
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:input path="creator" value="${thisLan.creator}"/>
    </p>
    <p>
        <form:label path="version">version</form:label>
        <form:errors path="version"/>
        <form:input type="text" path="version" value="${thisLan.version}"/>
    </p>  
    <input type="submit" value="Submit"/>
</form:form>  
<a href = "/delete/${thisLan.id}">Delete</a>
<a href = "/languages">DashBoard</a>

</body>
</html>