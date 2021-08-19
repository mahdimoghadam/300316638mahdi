<%--
  Created by IntelliJ IDEA.
  User: Meti
  Date: 2021-08-19
  Time: 2:02 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <h1>Edit an entry</h1>
    <form method="POST">
        <fieldset class="form-group">
            <label> Client Number :</label>
            <input name="clientN" type="text" class="form-control" required value="${num}" />

        </fieldset>


        <fieldset class="form-group">
            <label> Client Name :</label>
            <input name="clientName" type="text" class="form-control" required value="${Name}" />

        </fieldset>
        <fieldset class="form-group">
            <label> Loan Amount :</label>
            <input name="Lamount" type="text" class="form-control" required value="${amount}" />

        </fieldset>
        <fieldset class="form-group">
            <label> Years :</label>
            <input name="years" type="text" class="form-control" required value="${year}" />

        </fieldset>
        <fieldset class="form-group">
            <label> Loan Type :</label>
            <input name="loanT" type="text" class="form-control" required value="${type}" />

        </fieldset>
        <input class="btn btn-success" type="submit" value="Submit" />
    </form>
</body>
</html>
