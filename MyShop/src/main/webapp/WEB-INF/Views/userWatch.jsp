<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Watches</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  
   <style>
    /* Remove the navbar's default rounded borders and increase the bottom margin */
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

</div>
        <div class="panel-footer"><a href="user/addToCart/${productList[count.index].id}/${productList[count.index].category_fk.cat_id}" class="btn btn-sm btn-hover btn-info cartButton">Add to Cart</a></div>
        
      </div>
    </div>
    <c:if test="${count.index+1 <=  (size-1)}">
    <div class="col-sm-4">
      <div class="panel panel-danger">
 
        <div class="panel-footer"><a href="user/addToCart/${productList[count.index+1].id}/${productList[count.index+1].category_fk.cat_id}" class="btn btn-sm btn-hover btn-info cartButton"><img src="http://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"></a></div>Add to Cart</a></div>
      </div>
      </div>
    </c:if>
    <c:if test="${count.index+2 <=  (size-1)}">
    <div class="col-sm-4">
      <div class="panel panel-success">
      
        <div class="panel-footer"><a href="user/addToCart/${productList[count.index+2].id}/${productList[count.index+2].category_fk.cat_id}" class="btn btn-sm btn-hover btn-info cartButton">Add to Cart</a></div>
      </div>
    </div>
    </c:if>
  </div>
</c:forEach>
</div><br>
<br><br>

<footer class="container-fluid text-center">
  <p>Online Store Copyright</p>
</footer>

</body>
</html>