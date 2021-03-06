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
 </style>
  </head>
<body>
<nav class="navbar navbar-inverse">
<div class="container-fluid">
<div class="navbar-header">
<a class="navbar-brand" href="#"></a>
</div>                                          
 <table width="100%">
 <tr>
 <c:if test="${!empty user && user.admin==0}">
 <td align="right"><a href="myCart">My Cart</a>(${cartSize})</td>
 </c:if>
 </tr>
 </table> 

<ul class="nav navbar-nav">
<li class="active"><a href="#" > Home </a></li>
<li><a href="products1.jsp"> Products </a></li>
<li><a href="#"> Shops </a></li>
<li><a href="#"> Contact Us </a></li>
<li><a href="aboutus.html"> About Us</a></li>
</ul>


<ul class="navbar-nav navbar-right">
<li><a href="Signup"><span class="glyphicon glyphicon-user "> Sign up </span></a></li><br>
<li><a href="Login"><span class="glyphicon glyphicon-log-in "> Login </span></a></li>
</ul>


</div>
</nav>      
   <!-- <div class="container-fluid" style="width:40%;"> -->
   <div class="col-md-12 col-sm-12 panel">
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
rohit
	<%-- <ul id="menu">
	<c:forEach items="${categoryList}" var="category">
	<li><a href = ${category.name}>${category.name}</a>
	<ul>
	<c:forEach items="${category.products}" var="product">
	<li><a href="<c:url value='product/get/${product.id}' />">${product.name}</a></li>
	</c:forEach>
	</ul></li>
	</c:forEach>
 --%>
 
 
  <div class="mainmenu-area">
        
        <div class="container">
            
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">Home</a></li>
                        <c:forEach items="${categoryList}" var="category">
                        <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">${category.id}
                        <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                        <c:forEach items="${productList}" var="p">
                        <c:if test="${category.id eq p.category_id}">
                        
                        <li><a href="<c:url value='product/get/${p.id}'/>">${p.name}</a></li>
                      
                        </c:if>
                        </c:forEach>
                        </ul></li></c:forEach>
                        <li><a href="#">Contact</a></li>
                    </ul>
                </div>  
            
            </div>
            
  <div>
		<c:if test="${!empty selectedProduct.name}">
			<table>
				<tr>
					<th align="left" width="80">Product ID</th>
					<th align="left" width="120">Product Name</th>
					<th align="left" width="200">Product Description</th>
					<th align="left" width="80">Price</th>
					<th align="left" width="200">Product Category</th>
					<th align="left" width="200">Product Supplier</th>
					
				</tr>
				<tr>
					<td align="left" >${selectedProduct.id}</td>
					<td align="left" >${selectedProduct.name}</td>
					<td align="left" >${selectedProduct.description}</td>
					<td align="left" >${selectedProduct.price}</td>
					<td align="left" >${selectedProduct.category.name}</td>
					<td align="left" >${selectedProduct.supplier.name}</td>
				</tr>
			</table>
		</c:if>
	</div>
	
	

            
            
       
 

<c:if test="${SPRING_SECURITY_LAST_EXCEPTION != null}">
<div>
	Login attempt unsuccessful<br>
	${sessionScope['SPRING_SECURITY_LAST_EXCEPTION'].message}
</div>
</c:if>

</body>
</html>