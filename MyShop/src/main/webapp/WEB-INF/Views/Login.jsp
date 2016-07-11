<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Login Form </title>

 <meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style>
  th, td{
	  padding: 10px;
  }
  </style>

</head>
<body>
<body style="background-color:White;" style="background-image: url('<c:url value="Resources/Images/70.jpg"/>')">>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" >WATCH SHOP</a>
    </div>
    <br>
    <br>

    <p><font color="red">${errorMessage}</font></p>
    <form:form action="j_spring_security_check" method="post" >
    <table align="center">
        <td><b>Name :</b></td>
        <td><input name="j_username" type="text" /></td>
   
        <td><b>Password :</b></td>
        <td><input name="j_password" type="password" /></td>
        
        </table>
       <center><input type="submit" class="btn btn-primary" value="Login"/>
       <input type= reset class="btn btn-primary" value="Clear">
       <br>
       <div class="checkbox">
      <label><input type="checkbox"> Remember me</label></div></center>
    </div>
    </form:form>
</body>
</html>