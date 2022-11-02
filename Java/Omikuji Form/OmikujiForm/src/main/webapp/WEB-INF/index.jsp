<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
<style>
main{
border : 2px solid black ;
width : 30% ;
padding-left : 5% ;
}
</style>
</head>
<body>
<h1>Send on Omikuji</h1>
<main>
<form method="POST"  action="/login">
<p>Pick any number from 5 to 25</p>
<p><input type =number name=number></p>
<p>Enter the name of any city</p>
<p><input type=text name=city></p>
<p>Enter the name of any real person</p>
<p><input type=text name=name></p>
<p>Enter Professional endeavor or hobby</p>
<p><input type=text name=hobby></p>
<p>Enter any type of living thing</p>
<p><input type=text name=living></p>
<p>Say something nice to someone</p>
<p><input type=text name=nice></p>
<p>Send and show friend</p>
<p><input type=submit value="Send"></p>
</form>

</main>
</body>
</html>