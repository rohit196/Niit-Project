<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Categories</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<h4>List Available in categories</h4>
<form action="post" action="updateCategories" modelAttribute="category"></form>
<table width="50%">
<div class="table-responsive">
<table class="table table-striped">  
<tr>
	<th>S.no</th>
	<th>Id</th>
	<th>Name</th>
	<th>Description</th>
</tr>
<c:forEach items="${categoryList}" var="category" varStatus="status">

<tr>
<td align="center">${status.count}</td>
<td><input name="categoryList{${status.index}}.id" readonly="readonly" value="${category.id}"/></td>
<td><input name="categoryList{${status.index}}.name" value="${category.name}"/></td>
<td><input name="categoryList{${status.index}}.address" value="${category.description}"/></td>
</tr>

</c:forEach>
</table>
</body>
</html>