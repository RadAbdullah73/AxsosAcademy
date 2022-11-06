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
<style>
td{
width:10%
}
</style>
</head>
<body>
<table border="1">
<tr>
<th>Name</th>
<th>Creator</th>
<th>Version</th>
<th>Actions</th>
</tr>
<c:forEach var="language" items="${all}">
<tr>
        <td><p><a href ="/show/${language.id}"><c:out value="${language.name}"></c:out></a></p></td>
        <td><p><c:out value="${language.creator}"></c:out></p></td>
        <td><p><c:out value="${language.version}"></c:out></p></td>
        <td><a href="/edit/${language.id}" >Edit</a> <span>||</span>
        <form action="/delete/${language.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
	</form></td>
</tr>
        </c:forEach>


</table>

<form:form action="/createLang" method="post" modelAttribute="language">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:input path="creator"/>
    </p>
    <p>
        <form:label path="version">version</form:label>
        <form:errors path="version"/>
        <form:input type="text" path="version"/>
    </p>  
    <input type="submit" value="Submit"/>
</form:form>  

</body>
</html>