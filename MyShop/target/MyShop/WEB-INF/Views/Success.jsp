<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping cart</title>
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
 /* ADD FUNCTION */
  .navbar {
      margin-bottom: 50px;
      border-radius: 0;
    }
    
    /* Remove the jumbotron's default bottom margin */
     .jumbotron {
      margin-bottom: 0;
     
    }
   
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
    
    /* filet */
    .filter{
    	
    }
    
    .cartButton{
    	display: block; margin-left: auto; margin-right: auto
    }
    
    .btn-hover {
  font-weight: normal;
  color: #333333;
  cursor: pointer;
  background-color: inherit;
  border-color: transparent;
} 
 
   
 </style>
  </head>
<body>
<nav class="navbar navbar-inverse">
<div class="container-fluid">
<div class="navbar-header">
<a class="navbar-brand" href="#"></a>
</div>                                          
  

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
      <c:forEach items="${sessionScope.categotyList}" var="category">
        <li><a href="user/product/${category.cat_id}">${category.type}</a></li>
      </c:forEach>
      </ul>

<ul class="navbar-nav navbar-right">
<sec:authorize access="isAuthenticated()">
      	<li><a href="#"><span class="glyphicon glyphicon-user"></span>
	      	<c:if test="${(sessionScope.loggedUserId != null) || (sessionScope.loggedUserId != '')}">
	      		${sessionScope.loggedUser.fname}
	      	</c:if>
      	</a></li><br>
        <li><a href="displayCart"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li><br>
        <li><a href="logout">Logout</a></li><br>
      </sec:authorize>
</ul>
</div>
</nav>
<!-- ---------------------------------------------------------------------------------------------------------------------------------------------------- -->

<div class="container">
<div class="col-sm-3">
	<div class="panel panel-primary filter">
		<div class="panel-body">BODY</div>
	</div>
</div>
<div class="col-sm-9">
<c:set var="size" scope="page" value="${fn:length(productList)}"></c:set>
<c:forEach begin="0" step="3" end="${size}" varStatus="count" var="product">
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-info">
		<div class="panel-heading">Watch</div>
        <div class="panel-footer"><a href="user/addToCart/${productList[count.index].id}/${productList[count.index].category_fk.cat_id}" class="btn btn-sm btn-hover btn-info cartButton">Add to Cart</a>
        </div>
        <!-- <img src="http://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"> -->
      </div>
    </div>
    <c:if test="${count.index+1 <=  (size-1)}">
    <div class="col-sm-4">
      <div class="panel panel-danger">
 		<div class="panel-heading">Watch 2</div>
        <div class="panel-footer"><a href="user/addToCart/${productList[count.index+1].id}/${productList[count.index+1].category_fk.cat_id}" class="btn btn-sm btn-hover btn-info cartButton"></a></div>Add to Cart</a>
        </div>
      </div>
    </c:if>
    <c:if test="${count.index+2 <=  (size-1)}">
    <div class="col-sm-4">
      <div class="panel panel-success">
      <div class="panel-heading">Watch3</div>
        <div class="panel-footer"><a href="user/addToCart/${productList[count.index+2].id}/${productList[count.index+2].category_fk.cat_id}" class="btn btn-sm btn-hover btn-info cartButton">Add to Cart</a></div>
      </div>
    </div>
    </c:if>
  </div>
</c:forEach>
</div><br>
<br><br>
</div>







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
<footer class="container-fluid text-center">
  <p>Online Store Copyright</p>
</footer>
<%-- 
<c:if test="${SPRING_SECURITY_LAST_EXCEPTION != null}">
<div>
	Login attempt unseccesSfull<br>
	${sessionScope['SPRING_SECURITY_LAST_EXCEPTION'].message}
</div>
</c:if> --%>



</body>
</html>