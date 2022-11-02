<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Ninja Gold Game</title>
<style>
        main {
            display: flex;
            margin-top: 6%;
            margin-left: 5%;
        }

        .squares {
            height: 40%;
            width: 20%;
            border: 2px solid black;
            margin-right: 30px;
        }

        .squ {
            width: 130%;
            border: 2px solid black;
            margin-right: 20px;
        }

        .btn {
            background-color: blueviolet;
            color: white ;
            font-weight: bold;
            box-shadow: 4px 4px 4px 4px black;
            margin-left: 33%;
            font-family: cursive;
        }

        .first_p {
            margin-left: 5%;
            margin-top: 3%;
            font-family: cursive;
            color: red;
            font-size: 20px;
        }

        h2 {
            margin-top: 3%;
            margin-left: 4.8%;
            font-family: cursive;
            
        }

        h1 {
            margin-left: 33%;
            font-family: cursive;
        }

        .earns {
            font-family: cursive;
            color: red;
            margin-left: 20%;
        }

        .zero {
            border: 2px solid black;
            width: 100px;
            height: 20px;
            margin-left: 5%;
            color: green;
            font-family: cursive;
        }
        .textarea{
            height: 150px;
            width: 84.2%;
            overflow: auto;
            margin-left: 65px;
            border: 2px solid black;
        }

        .red {
            font-size: 18px;
            color: red;
            font-family: cursive;
        }

        .green {
            font-size: 18px;
            color: green;
            font-family: cursive;
        }
    </style>
</head>

<body>
    <p class="first_p">Your Gold:
    <div class="zero" name="MyGold">${gold}</div>
    </p>
    <main>
        <div class="squares">
            <h1>Farm</h1>
            <p class="earns">(earns 10-20 gold)</p>
            <form action="/increasegolds" method="post">
                <p><input class="btn" type="submit" , name="Farm" , value="Find_Gold"></p>
                <input type="hidden" name="which_form" value="Farm">
            </form>
        </div>
        <div class="squares">
            <h1>Cave</h1>
            <p class="earns">(earns 10-20 gold)</p>
            <form action="/increasegolds" method="post">
                <p><input class="btn" type="submit" , name="Cave" , value="Find_Gold"></p>
                <input type="hidden" name="which_form" value="Cave">
            </form>
        </div>
        <div class="squares">
            <h1>House</h1>
            <p class="earns">(earns 10-20 gold)</p>
            <form action="/increasegolds" method="post">
                <p><input class="btn" type="submit" , name="House" , value="Find_Gold"></p>
                <input type="hidden" name="which_form" value="House">
            </form>
        </div>
   
        <form action="/increasegolds" , method="POST">
            <div class="squ">
                <h1>Quest</h1>
                <p class="earns">(earns/takes 0-50 gold)</p>
                <p><input class="btn" type="submit" , name="FindGold" , value="Find_Gold"></p>
                <input type="hidden" name="which_form" value="Quest">
            </div>
        </form>
    </main>
     <footer>
        <h2>Activites :</h2>
        <div class="textarea" >
          <c:forEach var="Activity" items="${Act}">
          <c:choose>
          <c:when test="${Activity.contains('lose')}">
            <p class="red">
            <c:out value="${Activity}"></c:out></p>
            </c:when>
            <c:otherwise>
            <p class="green">
            <c:out value="${Activity}"></c:out></p>
            </c:otherwise>
            </c:choose>
            </c:forEach>
        </div>
    </footer>
</body>

</html>