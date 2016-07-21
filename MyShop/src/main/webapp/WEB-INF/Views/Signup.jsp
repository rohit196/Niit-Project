<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up</title>

<style>
body{
background-image: url(Resources/Images/101.jpg);

}


</style>

</head>
<body>
<body style="background-color:orange;">
<!-- <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" >Wheel Spin</a>
    </div>
 --><!-- 
</nav> -->

<div class="container" style="margin: 10px;">
      <div class="row"><h2>Create Account</h2>
  </div>
 
  <form:form role="form" method="POST" action="Signup">
    <!-- <div class="form-group">
      <label for="fname" class="col-md-2">
        First Name:
      </label>
      <div class="col-md-9"> -->
      First Name<input type="text" name="fname"  placeholder="Enter First Name">
      <!-- </div> -->
 <!-- id="fname" -->
 <!-- class="form-control" -->
    </div>
 
    <!-- <div class="form-group"> -->
     <!--  <label for="sname" class="col-md-2">
        Last Name:
      </label>
 -->      
 <!-- <div class="col-md-9"> -->
        <input type="text"  name="sname"  placeholder="Enter Last Name">
     <!--  </div> -->
 <!-- id="sname" -->
 <!-- class="form-control" -->
    </div>
 
    <div class="form-group">
      <label for="email" class="col-md-2">
        Email address:
      </label>
      <div class="col-md-9">
        <input type="email" class="form-control" name="email"  placeholder="Enter email address">
        <p class="help-block">
          Example: yourname@domain.com
        </p>
      </div>
 <!-- id="email" -->
 
    </div>
 
    <div class="form-group">
      <label for="password" class="col-md-2">
        Password:
      </label>
      <div class="col-md-9">
        <input type="password" class="form-control" name="password"  placeholder="Enter Password">
        
       </div>
   </div>
 <!-- id="password" -->
    
 
    <div class="form-group">
      <label for="country" class="col-md-2">
        Country:
      </label>
      <div class="col-md-9">
        <select name="country" id="country" class="form-control">
          <option>--Please Select--</option>
          <option>India</option>
          <option>United States</option>
          <option>Canada</option>
          <option>United Kingdom</option>
          <option>Others</option>
        </select>
      </div>
 
  </div>
 
    
 
    <div class="checkbox">
      <div class="col-md-2">
      </div>
      <div class="col-md-8">
        <label>
          <input type="checkbox">Terms and Conditions</label>
      </div>
 
 
    </div>
 
    <div class="row">
      <div class="col-md-2">
      </div>
      <div class="col-md-8">
        <button type="submit" class="btn btn-info">
          Register
        </button>
      </div>
    </div>
  </form:form>
  </div>



</body>
</html>