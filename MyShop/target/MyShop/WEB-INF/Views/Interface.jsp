<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
   
 </style>
  </head>
<body>
<nav class="navbar navbar-inverse">
<div class="container-fluid">
<div class="navbar-header">
<a class="navbar-brand" href="#"></a>
</div>                                          
 <%-- <table width="100%">
 <tr>
 <c:if test="${!empty user && user.admin==0}">
 <td align="right"><a href="myCart">My Cart</a>(${cartSize})</td>
 </c:if>
 </tr>
 </table> --%> 

<ul class="nav navbar-nav">
<li class="active"><a href="#" > Home </a></li>
<li><a href="productDisplay.jsp"> Products </a></li>
<li><a href="Shops.jsp"> Shops </a></li>
<li><a href="#"> Contact Us </a></li>
<li><a href="aboutus.html"> About Us</a></li>
</ul>

<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">

				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a><input style="font-color: black;" type="text"
							placeholder="Search"></a></li>
					<li><a href="#"><span class="glyphicon glyphicon-search"></span>
							Search</a></li>
					<li><a href="#"><span
							class="glyphicon glyphicon-shopping-cart"></span> CART</a></li>
				</ul>
			</div>

<ul class="nav navbar-nav">
      <%-- <c:forEach items="${sessionScope.categotyList}" var="category">
        <li><a href="user/product/${category.cId}">${category.cName}</a></li>
      </c:forEach>
      </ul> --%>

<ul class="navbar-nav navbar-right">
<li><a href="Signup"><span class="glyphicon glyphicon-user "> Sign up </span></a></li><br>
<li><a href="Login"><span class="glyphicon glyphicon-log-in "> Login </span></a></li><br>
 <%-- <sec:authorize access="isAuthenticated()">
      	<li><a href="#"><span class="glyphicon glyphicon-user"></span>
	      	<c:if test="${(sessionScope.loggedUserId != null) || (sessionScope.loggedUserId != '')}">
	      		${sessionScope.loggedUser.fName}
	      	</c:if>
      	</a></li>
        <li><a href="displayCart"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
        <li><a href="logout">Logout</a></li>
      </sec:authorize>
 --%></ul>


</div>
</nav>      
   <!-- <div class="container-fluid" style="width:40%;"> -->
   <!-- <div class="col-md-12 col-sm-12 panel">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel" >
    Indicators
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    Wrapper for slides
    <div class="carousel-inner" role="listbox" >
      <div class="item active">
        <img src="Resources/Images/20.jpg" alt="Mens Watch"  width="900" height="250">
      </div>
     <div class="item">
        <img src="Resources/Images/30.png" alt="Mens Watch" width="900" height="300">
      </div>
    
      <div class="item">
        <img src="Resources/Images/40.jpg" alt="Women's Watch" width="900" height="300">
      </div>

      <div class="item">
        <img src="Resources/Images/50.jpg" alt="Watch"  width="900" height="300">
      </div>
    </div>
 -->
   <!--  <!-- Left and right controls -->
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
 -->
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
							<img
								src="Resources/Images/upperimage1.jpg"
								alt="Image">
							
						</div>

						<div class="item">
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
						






	<ul id="menu">
	<c:forEach items="${categoryList}" var="category">
	<li><a href = ${category.type}>${category.type}</a>
	<ul>
	<c:forEach items="${category.product}" var="product">
	<li><a href="<c:url value='product/get/${product.id}' />">${product.name}</a></li>
	</c:forEach>
	</ul></li>
	</c:forEach>

<%-- 
<c:if test="${SPRING_SECURITY_LAST_EXCEPTION != null}">
<div>
	Login attempt unseccesSfull<br>
	${sessionScope['SPRING_SECURITY_LAST_EXCEPTION'].message}
</div>
</c:if> --%>


</body>
</html>