<%--
  Created by IntelliJ IDEA.
  User: Meti
  Date: 2021-08-19
  Time: 2:25 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<html>
<head>
    <title>Amortization Table</title>
</head>
<body>
<h1>Projected Table for Customer Number: ${clientNum}</h1>

<h2>${ClientName}</h2>
<div class="container2">

    <table class="table table-striped">
        <thead>
        <tr>
            <th>Year</th>
            <th>Starting Amount</th>
            <th>Interest</th>
            <th>Monthly Payment</th>
            <th>Ending Balance</th>
        </tr>
        </thead>
        <tbody>

            <tr>
                <td>0</td>
                <td>1000</td>
                <td><c:choose>
                    <c:when test="${loantype=='personal'}">
                        %6
                        <br />
                    </c:when>
                    <c:otherwise>
                        %9
                        <br />
                    </c:otherwise>
                </c:choose></td>
                <td>20000</td>
                <td>300000</td>
            </tr>

        </tbody>
    </table>
    <a type="button" class="btn btn-primary"
       href="back?id=3" >Back</a>
</div>
</body>
</html>
