<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
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
<h3> ADD CATEGORY</h3>
<c:url var="addAction" value="/category/add"></c:url>

<form:form action="${addAction}" commandName= "category">
<table>
<tr>
<td><form:label path="id">
<spring:message text="id" />
</form:label></td>
<c:choose>
<c:when test="${!empty category.id}">
<td><form:input path="id" disabled="true" readonly="true" /></td>
</c:when>
<c:otherwise>
<td><form:input path="id" type="number" pattern=".{3,4}" required="true" title="id should be in between 6 to 7 characters"></form:input>
</td>
</c:otherwise>
</c:choose>
<tr>
<form:input path="id" hidden="true" />
<td>

<form:label path="type">
<spring:message text="Type" />
</form:label>
</td>

<td><form:input path="type" required="true" /></td>
</tr>
<tr>
<td> <form:label path="description">
<spring:message text="Description" />
</form:label></td>
<td><form:input path="description" required="true"/></td>
</tr>
<tr>
<td colspan="2"><c:if test="${!empty category.type}">
<input type="submit" value ="<spring:message text="Edit CategoryList" />" />
</c:if>
<c:if test="${empty category.type }">
<input type="submit" value="<spring:message text="Add CategoryList" /> "/>
</c:if></td>
</tr>

 </table>
</form:form>
<br>

<h3>CATEGORY LIST</h3>
<c:if test="${!empty categoryList}">
<table class="tg">
<tr>
<th width="80">Category ID </th>
<th width="120">Category Type </th>
<th width="120">Category Description </th>
<th width="60">Edit </th>
<th width="60">Delete </th>
</tr>
<c:forEach items="${categoryList}" var="category">
<tr>
<td>${category.id}</td>
<td>${category.type}</td>
<td>${category.description}</td>
<td><a href="<c:url value='category/edit/${category.id}' />">EDIT</a></td>
<td><a href="<c:url value='category/remove/${category.id}' />">DELETE</a></td>
</tr>
</c:forEach>
</c:if>
</table>
</body>
</html>