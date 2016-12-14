<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${msg }</h1>
	<c:forEach items="${products }" var="product">
	<br/>
		<h1>
			<c:out value="${product.name}"></c:out>
			<c:out value="${product.address}"></c:out>
		</h1>

	</c:forEach>
</body>
</html>