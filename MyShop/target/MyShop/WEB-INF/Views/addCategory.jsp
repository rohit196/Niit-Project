<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MyShop</title>
</head>
<body>
<%-- <div class="container">

${message}
<h4>List of available Products</h4>
<div class="table-responsive">
<form:form method="post" action="updateProducts" modelAttribute="product"> 
<table class="table table-hover table-condensed" >
 <thead>
	<tr>
	    <th>S.No</th>
		<th>Id</th>
		<th>Name</th>
		<th>Description</th>
		
	</tr>
 </thead>
 <tbody>
	<c:forEach items="${productList}" var="product" varStatus="status">
		<tr>
			<td align="center">${status.count}</td>
			
			<td >${status.count}</td> 
			
			 <td><input name="productList[${status.index}].id" readonly="readonly" value="${product.id}"/></td>
			
			<td>${product.id}</td>
			
			<td><input name="productList[${status.index}].name" readonly="readonly" value="${product.name}"/></td>
			
			<td>${product.name}</td>
			
			<td><input name="productList[${status.index}].description" readonly="readonly" value="${product.description}"/></td>
			
			<td>${product.description}</td> 
			
			<td><input name="productList[${status.index}].price" readonly="readonly" value="${product.price}"/></td>
			
			<td>${product.price}</td> 
			
			
		</tr>
	</c:forEach>
 </tbody>
</table>

</form:form>
</div>
</div> --%>





<h2>List of Products</h2>
<div>
	<table>
	<th>Id</th>
	<th>Name</th>
	<th>Description</th>
	<th>Price</th>
	<!-- <th>Quantity</th> -->
	<c:forEach items="${productList}" var="product" varStatus="status">
		<tr>
			<td><input type="text" value="${product.id}"></td>
			<td><input type="text" value="${product.name}"></td>
			<td><input type="text" value="${product.description}"></td>
			<td><input type="text" value="${product.price}"></td>
			<%-- <td><input type="text" value="${p.pQty}"></td> --%>
		</tr>
	</c:forEach>
	</table>
</div>
















<%-- <h1>Products</h1>
<form action="${addAction}" commandName="product">
		<table>
			<tr>
				<td><form:label path="id">
						<spring:message text="ID" />
					</form:label></td><!-- disabled="false" -->
				<c:choose>
					<c:when test="${!empty product.id}">
						<td><form:input path="id"  readonly="true" />
						</td>
					</c:when>

					<c:otherwise>
						<td><form:input path="id" patttern =".{6,7}" required="true" title="id should contains 6 to 7 characters" /></td>
					</c:otherwise>
				</c:choose>
			<tr>
			<form:input path="id" hidden="true"  />
				<td><form:label path="name">
						<spring:message text="Name" />
					</form:label></td>
				<td><form:input path="name" required="true" /></td>
			</tr>
			
			
			<tr>
				<td><form:label path="price">
						<spring:message text="Price" />
					</form:label></td>
				<td><form:input path="price" required="true" /></td>
			</tr>
			
			<tr>
				<td><form:label path="description">
						<spring:message text="Description" />
					</form:label></td>
				<td><form:input path="description" required="true" /></td>
			</tr>
			
			<tr>
				<td><form:label path="supplier_fk">
						<spring:message text="Supplier" />
					</form:label></td>
				<td><form:input path="supplier.name" required="true" /></td>
				 <td><form:select path="supplier_fk.name" items="${supplierList}" itemValue="name" itemLabel="name" /></td>
			</tr>
			<tr>
				<td><form:label path="category_fk">
						<spring:message text="Category" />
					</form:label></td>
				<td><form:input path="category.name" required="true" /></td>
				<td><form:select path="category_fk.type" items="${categoryList}" itemValue="type" itemLabel="type" /></td>
			</tr>
</table>
</form>
<h3>Product List</h3>
	<c:if test="${!empty productList}">
		<table class="tg">
			<tr >
			
				<th  width="80" >Product ID</th>
				<th width="120" >Product Name</th>
				<th width="200">Product Description</th>
				<th width="80" >Price</th>
				<th width="80">Product Category</th>
				<th width="80">Product Supplier</th>
				<!-- <th width="60">Edit</th>
				<th width="60">Delete</th> -->
			</tr>
			
			<c:forEach items="${productList}" var="product">
				<tr>
					<td>${product.id}</td>
					<td>${product.name}</td>
					<td>${product.description}</td>
					<td>${product.price}</td>
					<td>${product.category_fk.type}</td>
					<td>${product.supplier_fk.name}</td>
				</tr>
			</c:forEach>
		</table> --%>



</body>
</html>