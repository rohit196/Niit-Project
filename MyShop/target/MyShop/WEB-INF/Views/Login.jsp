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
<style="background-color:White;" style="background-image: url('<c:url value="Resources/Images/70.jpg"/>')"></style>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" >WATCH SHOP</a>
    </div>
    <br>
    <br>

<%--  <div id="LoginModal" class="modal fade" role="dialog">
<div class="modal-dialog">
<div class="modal-content">
    <p><font color="red">${errorMessage}</font></p>
 --%>   
 <form:form action="perform_login" method='POST'>

		
		
		<%--   <form:form action="isValidUser" method="POST"> --%><!-- <table align="center"> -->
        <tr><td><b>Name :</td><td><input name="username" type="text" /></td></tr>
   
        <tr><td>Password :</td><td><input name="password" type="password" /></td></tr>
        
        </table>
       <center><input type="submit" class="btn btn-primary" value="Login"/>
       <input type= "reset" class="btn btn-primary" value="Clear">
       <br>
       <div class="checkbox">
      <label><input type="checkbox"> Remember me</label></div></center>
      
       
       	<!-- <div class="modal-footer">
			<button type="button" data-dismiss="modal" class="btn btn-primary">Cancel</button>
			<button type="submit" class="btn btn-primary">Login</button>
		</div>
 -->    
			<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span ></span>
							Welcome!</a></li>
					<li><a href="isValidUser"><span class="glyphicon glyphicon-user"></span>
							${name}</a></li>
				</ul>
       </form:form>
    </div>
 
</body>
</html>
<!-- j_spring_security_check -- >
<!-- j_username -->
<!-- j_password -->
<%-- "<c:url value='j_spring_security_check' />" --%>
    <%-- <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" /> --%>
			   <%--  <div>
	Login attempt unsuccessfull<br>
	${sessionScope['SPRING_SECURITY_LAST_EXCEPTION'].message}
</div> --%>