<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Watch Shop</title>


 <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" >
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

 
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 100%;
      margin: auto;
  }
  
 /*  .carousel-inner > .item > img{
  	height: 85%;
  	width: 85%;
  	border: 1px solid;
  }
 */
 #wrap{
background-image: -ms-linear-gradient(top, #FFFFFF 0%, #D3D8E8 100%);
/* Mozilla Firefox */ 
background-image: -moz-linear-gradient(top, #FFFFFF 0%, #D3D8E8 100%);
/* Opera */ 
background-image: -o-linear-gradient(top, #FFFFFF 0%, #D3D8E8 100%);
/* Webkit (Safari/Chrome 10) */ 
background-image: -webkit-gradient(linear, left top, left bottom, color-stop(0, #FFFFFF), color-stop(1, #D3D8E8));
/* Webkit (Chrome 11+) */ 
background-image: -webkit-linear-gradient(top, #FFFFFF 0%, #D3D8E8 100%);
/* W3C Markup, IE10 Release Preview */ 
background-image: linear-gradient(to bottom, #FFFFFF 0%, #D3D8E8 100%);
background-repeat: no-repeat;
background-attachment: fixed;
}
 footer {
	background-color: #f2f2f2; 
}

.carousel-inner img {
	width: 100%; /* Set width to 100% */
	min-height: 200px;
}

/* Hide the carousel text when the screen is less than 600 pixels wide */
@media ( max-width : 600px) {
	.carousel-caption {
		display: none;
	}
}

@import
	url(http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css)
	;

.col-item {
	border: 1px solid #E1E1E1;
	border-radius: 5px;
	background: #FFF;
}

.col-item .photo img {
	margin: 0 auto;
	width: 100%; 
}

.col-item .info {
	padding: 10px;
	border-radius: 0 0 5px 5px;
	margin-top: 1px;
}

.col-item:hover .info {
	background-color: #F5F5DC;
}

.col-item .price {
	/*width: 50%;*/
	float: left;
	margin-top: 5px;
}

.col-item .price h5 {
	line-height: 20px;
	margin: 0;
}

.price-text-color {
	color: #219FD1;
}

.col-item .info .rating {
	color: #777;
}

.col-item .rating {
	/*width: 50%;*/
	float: left;
	font-size: 17px;
	text-align: right;
	line-height: 52px;
	margin-bottom: 10px;
	height: 52px;
}

.col-item .separator {
	border-top: 1px solid #E1E1E1;
}

.clear-left {
	clear: left;
}

.col-item .separator p {
	line-height: 20px;
	margin-bottom: 0;
	margin-top: 10px;
	text-align: center;
}

.col-item .separator p i {
	margin-right: 5px;
}

.col-item .btn-add {
	width: 50%;
	float: left;
}

.col-item .btn-add {
	border-right: 1px solid #E1E1E1;
}

.col-item .btn-details {
	width: 50%;
	float: left;
	padding-left: 10px;
}

.controls {
	margin-top: 20px;
}

[data-slide="prev"] {
	margin-right: 10px;
}
footer {
    position: bottom;
    height: 50px;
    bottom: 0;
    width: 100%;
}

   
 </style>
  </head>
<body id="wrap" bgcolor="#000000">
<nav class="navbar navbar-inverse">
<div class="container-fluid">
<div class="navbar-header">
<a class="navbar-brand" href="#"></a>
</div>                                          
 
<ul class="nav navbar-nav">
<li class="active"><a href="#" > Home </a></li>

<li><a href="#"> Category</a></li>
<
<li><a href="Shops"> Shops </a></li>
<li><a href="#"> Contact Us </a></li>
<li><a href="aboutus.html"> About Us</a></li>
</ul>


<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">

				</ul>
				<ul class="nav navbar-nav navbar-right">
					<!-- <li><a><input style="font-color: black;" type="text"
							placeholder="Search"></a></li>
					<li><a href="#"><span class="glyphicon glyphicon-search"></span>
							Search</a></li> -->
					<li><a href="#"><span
							class="glyphicon glyphicon-shopping-cart"></span> CART</a></li>
				</ul>
			</div>

<!-- ------------------------------------------------------------------------------------------------------------------- -->
<!-- <div class="content">
<fieldset>
<legend>Nav Menu</legend>

</fieldset>
</div> -->





<ul class="navbar-nav navbar-right">
<!-- <sec:authorize access="isAnonymous()"><li><a href="#" data-toggle="modal" data-target="#SignupModal"> Signup</a></li></sec:authorize> -->
<!-- <li><a  href="Signup"><span class="glyphicon glyphicon-user "> Sign up </span></a></li><br> -->
<a href="memberShip.obj" style="margin:50;" >Sign Up</a><br><br>
<li><a href="Login"><span class="glyphicon glyphicon-log-in "> Login </span></a></li><br>
  
</ul>


</div>
</nav>      

<%-- <div id="SignupModal" class="modal fade" role="dialog">
<div class="modal-dialog">
<div class="modal-content">
	<form:form method="post" action="Signup">
		<div class="modal-header">
		<b>Sign Up</b>
			<button type="button" class="close" data-dismiss="modal">&times;</button>
		</div>
		<!-- placeholder="First name" --><!-- required -->
		<div class="modal-body">
		<table class="headerTable">
		<!-- <tr><td>ID:</td><td><input type="number" name="id" placeholder="Enter ID" size="10" required></td></tr> -->
			<tr><td>First Name:</td><td><input type="text" name="fname"  size="30" ><form:errors path="fname" /></td></tr>
			<tr><td>Last Name:</td><td><input type="text" name="sname" placeholder="Last name" size="30" ><form:errors path="sname" /></td></tr>
			<tr><td>Email:</td><td><input type="email" name="email" placeholder="Email" size="30" ><form:errors path="email" /></td></tr>
			<tr><td>Password:</td><td><input type="password" name="password" placeholder="Password" size="30" ><form:errors path="password" /> </td></tr>			
		</table>
		</div>
		<div class="modal-footer">
			<button type="button" data-dismiss="modal" class="btn btn-primary"> Cancel </button>
			<button type="submit" class="btn btn-primary">Sign up</button>
		</div>
	</form:form>
</div>
</div>
</div><!-- modal -->
 --%>




 <div class="container"> 
		<div class="row">
			<div class="col-sm-12">
				<div id="myCarouse0" class="carousel slide" data-ride="carouse0">
					<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#myCarouse0" data-slide-to="0" class="active"></li>
						<li data-target="#myCarouse0" data-slide-to="1"></li>
						<li data-target="#myCarouse0" data-slide-to="2"></li>
						<li data-target="#myCarouse0" data-slide-to="3"></li>
						<li data-target="#myCarouse0" data-slide-to="4"></li>
					</ol> 
 
 <div class="carousel-inner" role="listbox">

						<div class="item active">
							<img src="Resources/Images/upperimage1.jpg"
								alt="Image">
							
						</div>

						<div class="item ">
							<img
								src="Resources/Images/upperimage2.jpg"
								alt="Image">  
							
						</div> 

						<div class="item">
							<img
								src="Resources/Images/upperimage3.jpg"
								alt="Image">
							
						</div>
							<div class="item">
							<img
								src="Resources/Images/upperimage4.jpg"
								alt="Image">
							
						</div>
</div>
</div>
</div>
</div>
</div> 
 <div class="container">
		<div class="row">
			<div class="col-sm-8">
				<div id="myCarousel" class="carousel slide" data-ride="carousel">
					<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						<li data-target="#myCarousel" data-slide-to="1"></li>
						<li data-target="#myCarousel" data-slide-to="2"></li>
						<li data-target="#myCarousel" data-slide-to="3"></li>
						<li data-target="#myCarousel" data-slide-to="4"></li>
						<li data-target="#myCarousel" data-slide-to="5"></li>
					</ol>
 
 <div class="carousel-inner" role="listbox">

						<div class="item active">
							<img
								src="Resources/Images/smart1.jpg"
								alt="Image">
							<div class="carousel-caption">
								<h3>SmartWatch</h3>
								<p>Pre-Order Now</p>
							</div>
						</div>

						<div class="item">
							<img
								src="Resources/Images/smart2.jpg"
								alt="Image">
							<div class="carousel-caption">
								<h3>Watch</h3>
								<p>Pre-Order Now</p>
							</div>
						</div>

						<div class="item">
							<img
								src="Resources/Images/smart3.jpg"
								alt="Image">
							<div class="carousel-caption">
								<h3>Watch</h3>
								<p>Pre-Order Now</p>
							</div>
						</div>

						<div class="item">
							<img
								src="Resources/Images/smart4.png"
								alt="Image">
							<div class="carousel-caption">
								<h3>Watch</h3>
								<p>Pre-Order Now</p>
							</div>
						</div>

						<div class="item">
							<img
								src="Resources/Images/smart5.jpg"
								alt="Image">
							<div class="carousel-caption">
								<h3>Battle Field 1</h3>
								<p>Pre-Order Now</p>
							</div>
						</div>
					</div>
<a class="left carousel-control" href="#myCarousel" role="button"
						data-slide="prev"> <span
						class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						<span class="sr-only">Previous</span>
					</a> <a class="right carousel-control" href="#myCarousel" role="button"
						data-slide="next"> <span
						class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						<span class="sr-only">Next</span>
					</a>
				</div>
			</div>
			
			
<div class="col-sm-4">
				<div id="myCarousel2" class="carousel slide" data-ride="carousel">
					<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#myCarousel2" data-slide-to="0" class="active"></li>
						<li data-target="#myCarousel2" data-slide-to="1"></li>
						<li data-target="#myCarousel2" data-slide-to="2"></li>
						<li data-target="#myCarousel2" data-slide-to="3"></li>
						<li data-target="#myCarousel2" data-slide-to="4"></li>
					</ol>
<div class="carousel-inner" role="listbox">

						<div class="item active">
							<img
								src="Resources/Images/watch1.jpg"
								alt="Image">
							<div class="carousel-caption">
								<h3>SmartWatch</h3>
								<p>Buy Now</p>
							</div>
						</div>

						<div class="item">
							<img
								src="Resources/Images/watch2.jpg"
								alt="Image">
							<div class="carousel-caption">
								<h3>SmartWatch2</h3>
								<p>Buy Now</p>
							</div>
						</div>

						<div class="item">
							<img
								src="Resources/Images/watch3.jpg"
								alt="Image">
							<div class="carousel-caption">
								<h3>Watch</h3>
								<p>Buy Now</p>
							</div>
						</div>

						<div class="item">
							<img
								src="Resources/Images/watch4.jpg"
								alt="Image">
							<div class="carousel-caption">
								<h3>Watch2</h3>
								<p>Buy Now</p>
							</div>
						</div>

						<div class="item">
							<img
								src="Resources/Images/watch5.jpg"
								alt="Image">
							<div class="carousel-caption">
								<h3>Womens watch</h3>
								<p>Buy Now</p>
							</div>
						</div>

					</div>

					<!-- Left and right controls -->
					<a class="left carousel-control" href="#myCarousel2" role="button"
						data-slide="prev"> <span
						class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						<span class="sr-only">Previous</span>
					</a> <a class="right carousel-control" href="#myCarousel2"
						role="button" data-slide="next"> <span
						class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						<span class="sr-only">Next</span>
					</a>
				</div>
			</div>
		</div>
		<hr>
	</div>
			
			
			
			
			
 
 
 
 

 
<div class="carousel-inner">
					<div class="item active">
						<div class="row">
							<div class="col-sm-2">
								<div class="col-item">
									<div class="photo">
										<img
											src="Resources/Images/image1.jpg"
											class="img-responsive" alt="a" />
									</div>
									<div class="info">
										<div class="row">
											<div class="price col-md-12">
												<h6>Google</h6>
											</div>
										</div>
										<div class="row">
											<div class="price col-md-4">
											   <h5 class="price-text-color">$199.99</h5>
											</div>
											       
											<div class="price col-md-8">
											        <i class="price-text-color fa fa-star"></i><i
													class="price-text-color fa fa-star"> </i><i
													class="price-text-color fa fa-star"></i>
													<i class="price-text-color fa fa-star"> </i><i
													class=" fa fa-star"></i>
											</div>
										</div>
										<div class="separator clear-left">
											<p class="btn-add ">
												<i class="fa fa-shopping-cart"></i><a
													href="http://www.jquery2dotnet.com" class="hidden-sm">Add
													to cart</a>
											</p>
											<p class="btn-details">
												<i class="fa fa-list"></i><a
													href="http://www.jquery2dotnet.com" class="hidden-sm">More
													details</a>
											</p>
										</div>
										<div class="clearfix"></div>
									</div>
								</div>
							</div>
							<div class="col-sm-2">
								<div class="col-item">
									<div class="photo">
										<img
											src="Resources/Images/image2.jpg"
											class="img-responsive" alt="a" />
									</div>
									<div class="info">
										<div class="row">
											<div class="price col-md-12">
												<h6>Google2</h6>
											</div>
										</div>
										<div class="row">
											<div class="price col-md-4">
											   <h5 class="price-text-color">$199.99</h5>
											</div>
											       
											<div class="price col-md-8">
											        <i class="price-text-color fa fa-star"></i><i
													class="price-text-color fa fa-star"> </i><i
													class="price-text-color fa fa-star"></i>
													<i class="price-text-color fa fa-star"> </i><i
													class=" fa fa-star"></i>
											</div>
										</div>
										<div class="separator clear-left">
											<p class="btn-add">
												<i class="fa fa-shopping-cart"></i><a
													href="http://www.jquery2dotnet.com" class="hidden-sm">Add
													to cart</a>
											</p>
											<p class="btn-details">
												<i class="fa fa-list"></i><a
													href="http://www.jquery2dotnet.com" class="hidden-sm">More
													details</a>
											</p>
										</div>
										<div class="clearfix"></div>
									</div>
								</div>
							</div>
							<div class="col-sm-2">
								<div class="col-item">
									<div class="photo">
										<img
											src="Resources/Images/image3.jpg"
											class="img-responsive" alt="a" />
									</div>
									<div class="info">
										<div class="row">
											<div class="price col-md-12">
												<h6>Google3</h6>
											</div>
										</div>
										<div class="row">
											<div class="price col-md-4">
											   <h5 class="price-text-color">$199.99</h5>
											</div>
											       
											<div class="price col-md-8">
											        <i class="price-text-color fa fa-star"></i><i
													class="price-text-color fa fa-star"> </i><i
													class="price-text-color fa fa-star"></i>
													<i class="price-text-color fa fa-star"> </i><i
													class=" fa fa-star"></i>
											</div>
										</div>
										<div class="separator clear-left">
											<p class="btn-add">
												<i class="fa fa-shopping-cart"></i><a
													href="http://www.jquery2dotnet.com" class="hidden-sm">Add
													to cart</a>
											</p>
											<p class="btn-details">
												<i class="fa fa-list"></i><a
													href="http://www.jquery2dotnet.com" class="hidden-sm">More
													details</a>
											</p>
										</div>
										<div class="clearfix"></div>
									</div>
								</div>
							</div>
							<div class="col-sm-2">
								<div class="col-item">
									<div class="photo">
										<img
											src="Resources/Images/image4.jpg"
											class="img-responsive" alt="a" />
									</div>
									<div class="info">
										<div class="row">
											<div class="price col-md-12">
												<h6>google4</h6>
											</div>
										</div>
										<div class="row">
											<div class="price col-md-4">
											   <h5 class="price-text-color">$199.99</h5>
											</div>
											       
											<div class="price col-md-8">
											        <i class="price-text-color fa fa-star"></i><i
													class="price-text-color fa fa-star"> </i><i
													class="price-text-color fa fa-star"></i>
													<i class="price-text-color fa fa-star"> </i><i
													class=" fa fa-star"></i>
											</div>
										</div>
										<div class="separator clear-left">
											<p class="btn-add">
												<i class="fa fa-shopping-cart"></i><a
													href="http://www.jquery2dotnet.com" class="hidden-sm">Add
													to cart</a>
											</p>
											<p class="btn-details">
												<i class="fa fa-list"></i><a
													href="http://www.jquery2dotnet.com" class="hidden-sm">More
													details</a>
											</p>
										</div>
										<div class="clearfix"></div>
									</div>
								</div>
							</div>
				
				
				<div class="col-sm-2">
								<div class="col-item">
									<div class="photo">
										<img
											src="Resources/Images/image5.jpg"
											class="img-responsive" alt="a" />
									</div>
									<div class="info">
										<div class="row">
											<div class="price col-md-12">
												<h6>Women</h6>
											</div>
										</div>
										<div class="row">
											<div class="price col-md-4">
											   <h5 class="price-text-color">$199.99</h5>
											</div>
											       
											<div class="price col-md-8">
											        <i class="price-text-color fa fa-star"></i><i
													class="price-text-color fa fa-star"> </i><i
													class="price-text-color fa fa-star"></i>
													<i class="price-text-color fa fa-star"> </i><i
													class=" fa fa-star"></i>
											</div>
										</div>
										<div class="separator clear-left">
											<p class="btn-add">
												<i class="fa fa-shopping-cart"></i><a
													href="http://www.jquery2dotnet.com" class="hidden-sm">Add
													to cart</a>
											</p>
											<p class="btn-details">
												<i class="fa fa-list"></i><a
													href="http://www.jquery2dotnet.com" class="hidden-sm">More
													details</a>
											</p>
										</div>
										<div class="clearfix"></div>
									</div>
								</div>
							</div>
							<div class="col-sm-2">
								<div class="col-item">
									<div class="photo">
										<img
											src="Resources/Images/image6.jpg"
											class="img-responsive" alt="a" />
									</div>
									<div class="info">
										<div class="row">
											<div class="price col-md-12">
												<h6>Women</h6>
											</div>
										</div>
										<div class="row">
											<div class="price col-md-4">
											   <h5 class="price-text-color">$99.99</h5>
											</div>
											       
											<div class="price col-md-8">
											        <i class="price-text-color fa fa-star"></i><i
													class="price-text-color fa fa-star"> </i><i
													class="price-text-color fa fa-star"></i>
													<i class="price-text-color fa fa-star"> </i><i
													class=" fa fa-star"></i>
											</div>
										</div>
										<div class="separator clear-left">
											<p class="btn-add">
												<i class="fa fa-shopping-cart"></i><a
													href="http://www.jquery2dotnet.com" class="hidden-sm">Add
													to cart</a>
											</p>
											<p class="btn-details">
												<i class="fa fa-list"></i><a
													href="http://www.jquery2dotnet.com" class="hidden-sm">More
													details</a>
											</p>
										</div>
										<div class="clearfix"></div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="item">
						<div class="row">
							<div class="col-sm-2">
								<div class="col-item">
									<div class="photo">
										<img
											src="Resources/Images/image7.jpg"
											class="img-responsive" alt="a" />
									</div>
									<div class="info">
										<div class="row">
											<div class="price col-md-12">
												<h6>women</h6>
											</div>
										</div>
										<div class="row">
											<div class="price col-md-4">
											   <h5 class="price-text-color">$199.99</h5>
											</div>
											       
											<div class="price col-md-8">
											        <i class="price-text-color fa fa-star"></i><i
													class="price-text-color fa fa-star"> </i><i
													class="price-text-color fa fa-star"></i>
													<i class="price-text-color fa fa-star"> </i><i
													class=" fa fa-star"></i>
											</div>
										</div>
										<div class="separator clear-left">
											<p class="btn-add">
												<i class="fa fa-shopping-cart"></i><a
													href="http://www.jquery2dotnet.com" class="hidden-sm">Add
													to cart</a>
											</p>
											<p class="btn-details">
												<i class="fa fa-list"></i><a
													href="http://www.jquery2dotnet.com" class="hidden-sm">More
													details</a>
											</p>
										</div>
										<div class="clearfix"></div>
									</div>
								</div>
							</div>
							<div class="col-sm-2">
								<div class="col-item">
									<div class="photo">
										<img
											src="Resources/Images/image8.jpg"
											class="img-responsive" alt="a" />
									</div>
									<div class="info">
										<div class="row">
											<div class="price col-md-12">
												<h6>women</h6>
											</div>
										</div>
										<div class="row">
											<div class="price col-md-4">
											   <h5 class="price-text-color">$199.99</h5>
											</div>
											       
											<div class="price col-md-8">
											        <i class="price-text-color fa fa-star"></i><i
													class="price-text-color fa fa-star"> </i><i
													class="price-text-color fa fa-star"></i>
													<i class="price-text-color fa fa-star"> </i><i
													class=" fa fa-star"></i>
											</div>
										</div>
										<div class="separator clear-left">
											<p class="btn-add">
												<i class="fa fa-shopping-cart"></i><a
													href="http://www.jquery2dotnet.com" class="hidden-sm">Add
													to cart</a>
											</p>
											<p class="btn-details">
												<i class="fa fa-list"></i><a
													href="http://www.jquery2dotnet.com" class="hidden-sm">More
													details</a>
											</p>
										</div>
										<div class="clearfix"></div>
									</div>
								</div>
							</div>
</div>
</div></div>						


<footer>

<nav class="navbar navbar-inverse navbar-bottom">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#myNavbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span> <span class="icon-bar"></span>
					</button>
					
				</div>
				<div class="collapse navbar-collapse" id="myNavbar">
					<ul class="nav navbar-nav">
						<li><a href="#">WatchShop.com</a></li>
						<li><a href="#">About Us</a></li>
						<li><a href="#">Contact Us</a></li>
						<li><a href="#">Delivery and Payment</a></li>
						<li><a href="#">FAQs</a></li>
						<li><a href="#">Privacy Policy</a></li>
						<li><a href="#">Return Policy</a></li>
						

					</ul>

					<ul class="nav navbar-nav navbar-right">
						<li><a>Follow Us:</a></li>
						<li><a title="Join us on Facebook" href="#"><span
								class="fa fa-facebook-square" style="font-size: 24px;"></span></a></li>
						<li><a title="Join us on Twitter" href="#"><span
								class="fa fa-twitter-square" style="font-size: 24px;"></span></a></li>
						<li><a title="Join Google+ to follow Xperience" href="#"><span
								class="fa fa-google-plus-square" style="font-size: 24px;"></span></a></li>
						<li><a title="Visit our YouTube channel" href="#"><span
								class="fa fa-youtube-square" style="font-size: 24px;"></span></a></li>
					</ul>

				</div>
					<p style="text-align:center;">Copyright © 2016 Watchshop.com</p> 
			</div>
		</nav>
	
	
	
	</footer>



	<ul id="menu">
	<c:forEach items="${categoryList}" var="category">
	<li><a href = ${category.type}>${category.type}</a>
	<ul>
	<c:forEach items="${category.product}" var="product">
	<li><a href="<c:url value='product/get/${product.id}' />">${product.name}</a></li>
	</c:forEach>
	</ul></li>
	</c:forEach>




</body>
</html>
 <%-- <sec:authorize access="isAuthenticated()">
      	<li><a href="#"><span class="glyphicon glyphicon-user"></span>
	      	<c:if test="${(sessionScope.loggedUserId != null) || (sessionScope.loggedUserId != '')}">
	      		${sessionScope.loggedUser.fName}
	      	</c:if>
      	</a></li>
        <li><a href="displayCart"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
        <li><a href="logout">Logout</a></li>
      </sec:authorize>
 --%>