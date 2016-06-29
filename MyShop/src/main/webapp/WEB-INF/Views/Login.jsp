<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Login Form </title>
</head>
<body>
    <p><font color="red">${errorMessage}</font></p>
    <form:form action="isValidUser" method="post" modelAttribute="user">
        Name : <input name="name" type="text" /> 
        <br />
        Password : <input name="password" type="password" /> 
        <br />
       Submit : <input type="submit" />
    </form:form>
</body>
</html>