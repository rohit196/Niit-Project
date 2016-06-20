<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Watch Shop</title>
</head>

 <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" >
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

 <style>
  .Watch-inner > .item > img,
  .Watch-inner > .item > a > img {
      
      width: 70%;
      margin: auto;
  }
  
  .carousel-inner > .item > img{
  	height: 80%;
  	width: 80%;
  	border: 1px solid;
  }
  </style>
<body>
<nav class="navbar nav-default">
<div class="container-fluid">
<div class="navbar-header">
<a class="navbar-brand" href="#"></a>
</div>                                          
  

<ul class="nav navbar-nav">
<li class="active"><a href="#" > Home </a></li>
<li><a href="products.html"> Products </a></li>
<li><a href="#"> Shops </a></li>
<li><a href="#"> Contact Us </a></li>
<li><a href="aboutus.html"> About Us</a></li>
</ul>
<ul class="navbar-nav navbar-right">
<li><a href="SignUp.html"><span class="glyphicon glyphicon-user "></span> Sign up </a></li>
<li><a href="Login"><span class="glyphicon glyphicon-log-in "></span> Login </a></li>
</ul>


</div>
</nav>      
   <div class="container-fluid" style="width:40%;">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel" >
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox" style="width:80%;">
      <div class="item active">
        <img src="Images/1.jpg" alt="Mens Watch">
      </div>
     <!-- <div class="item">
        <img src="2.jpg" alt="Mens Watch" width="800" height="345">
      </div>
    
      <div class="item">
        <img src="3.jpg" alt="Women's Watch" width="460" height="345">
      </div> -->

      <div class="item">
        <img src="Images/4.jpg" alt="Watch">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

</body>
</html>