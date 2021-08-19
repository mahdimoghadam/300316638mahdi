<%--
  Created by IntelliJ IDEA.
  User: Meti
  Date: 2021-08-19
  Time: 1:31 p.m.
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
    <h1>Add an entry</h1>
    <form action="adding" method="POST">
        <fieldset class="form-group">
            <label> Client Number :</label>
            <input name="cNum" type="text" class="form-control" required />

        </fieldset>


        <fieldset class="form-group">
            <label> Client Name :</label>
            <input name="cName" type="text" class="form-control" required />


        </fieldset>

        <fieldset class="form-group">
            <label> Loan Amount :</label>
            <input name="lAmount" type="text" class="form-control" required />


        </fieldset>

        <fieldset class="form-group">
            <label> Years :</label>
            <input name="years" type="text" class="form-control" required />


        </fieldset>

        <fieldset class="form-group">
            <label> Loan Type :</label>
            <input name="lType" type="text" class="form-control" required />


        </fieldset>
        <input class="btn btn-success" type="submit" value="Submit" />
    </form>

</div>

</body>
</html>
