<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<h1>Expense Details</h1>
<h2>Name  : ${ShowThis.expenseName }</h2>
<h2>Description  : ${ShowThis.description }</h2>
<h2>Vendor  : ${ShowThis.vendor }</h2>
<h2>Amount Spent  : ${ShowThis.amount } </h2>

</body>
</html>