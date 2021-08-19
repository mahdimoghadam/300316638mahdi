<%--
  Created by IntelliJ IDEA.
  User: Meti
  Date: 2021-08-19
  Time: 12:47 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


<html>
<head>
    <title>My Page</title>
    <style>
        h1 {
            text-align: center;
            background-color: cyan;
        }
    </style>
    <script>
        function myFunction() {
            document.getElementById("mes").innerHTML="";
        }
    </script>
</head>
<body>
    <h1>Loan Records</h1>

    <h2 id="mes">${errorMessage}</h2>
    <div class="container2">

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Client Number</th>
                <th>Client Name</th>
                <th>Loan Amount</th>
                <th>Years</th>
                <th>Loan Type</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach items="${loans}" var="loan">



                <tr>
                    <td>${loan.clientno}</td>
                    <td>${loan.clientname}</td>
                    <td>${loan.loanamount}</td>
                    <td>${loan.years}</td>
                    <td>${loan.loantype}</td>

                    <td>    <a type="button" class="btn btn-primary"
                               href="update?id=${loan.clientno}" >Edit</a> </td>



                    <td>    <a type="button" class="btn btn-primary"
                               href="delete?id=${loan.clientno}" >Delete</a> </td>

                    <td>
                            <a type="button" class="btn btn-primary" onmouseout="myFunction()"
                               href="amor?id=${loan.clientno}">Amortization table</a>
                    </td>



                </tr>


            </c:forEach>
            </tbody>
        </table>
        <a type="button" class="btn btn-primary"
           href="addLoan?id=300316638" >Add</a>
    </div>

</body>
</html>
