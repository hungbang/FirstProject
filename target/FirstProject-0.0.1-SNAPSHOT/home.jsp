<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Management</title>
</head>
<body>
	<c:if test="${sessionScope.user eq null }">
		<a href="login.jsp">Sign in</a>
	</c:if>
	<c:if test="${sessionScope.user ne null }">
		<p>${name } </p><a href="LoginServlet?signout=true"> Sign Out</a>
		<ul class="menu">
		<li><a href="CommonServlet?goto=add">Add New</a></li>
		<li><a href="CommonServlet?goto=cart">Shopping Cart</a></li>
	</ul>
	</c:if>
	
</body>
</html>