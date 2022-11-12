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
<form:form action="/updateProject/${thisProject.id}" method="post" modelAttribute="project">
    <p>
        <form:label path="title"> Project Title:</form:label>
        <form:errors path="title"/>
        <form:input path="title" value="${thisProject.title}"/>
    </p>
    <p>
        <form:label path="description"> Project Description:</form:label>
        <form:errors path="description"/>
        <form:input type="textarea" path="description" value="${thisProject.description}"/>
    </p>
    <p>
        <form:label path="dueDate">Due Date : </form:label>
        <form:errors path="dueDate"/>
        <form:input type="date" path="dueDate" value="${thisProject.dueDate}"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>  

</body>
</html>