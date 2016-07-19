<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin cha Ghar</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  
    <style>
  img{
	  margin:auto;
  }
  h2.serif {
    font-family: "Times New Roman", Times, serif;
}
  h2{
   text-align: center;
   }
  
  </style>
  
</head>
<body style="background-color:light-blue;">
<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Admin Home</a>
			</div>


<center><h3>Welcome To Admin Home</h3>

 Categories<a href="getAllCategories"> Display  </a><br>
	<br> 
Suppliers<a href="getAllSuppliers"> Display  </a><br>
<br>   
Products<a href="getAllProducts"> Display  </a><br></center>
<br> 

<img class="img-responsive" img src="Resources/Images/90.jpg"  width="460" height="345"><br>
<%-- <li><a href="<c:url value="/j_spring_security_Logout"/>">Logout</a></li> --%>
</body>
</html>