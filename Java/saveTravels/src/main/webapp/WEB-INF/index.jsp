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
<h1>Save Travels</h1>
<table border="1">
<tr>
<th>Expense</th>
<th>Vendor</th>
<th>Amount</th>
</tr>
<c:forEach var="travel" items="${all}">
<tr>
        <td><p><c:out value="${travel.expenseName}"></c:out></p></td>
        <td><p><c:out value="${travel.vendor}"></c:out></p></td>
        <td><p><c:out value="${travel.amount}"></c:out></p></td>
</tr>
        </c:forEach>


</table>

<form:form action="/travels" method="post" modelAttribute="travel">
    <p>
        <form:label path="expenseName">ExpenseName</form:label>
        <form:errors path="expenseName"/>
        <form:input path="expenseName"/>
    </p>
    <p>
        <form:label path="vendor">Vendor</form:label>
        <form:errors path="vendor"/>
        <form:textarea path="vendor"/>
    </p>
    <p>
        <form:label path="amount">Amount</form:label>
        <form:errors path="amount"/>
        <form:input type="number" path="amount"/>
    </p>
    <p>
       <form:label path="description">Description</form:label>
        <form:errors path="description"/>
        <form:textarea path="description"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>    



</body>
</html>