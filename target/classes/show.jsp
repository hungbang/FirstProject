<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Shopping Cart Page</title>
</head>
<body>
	<table>
		<thead>
			<th>Product Name</th>
			<th>Price</th>
		</thead>
		<c:forEach items="${sessionScope.products }" var="p">
			<tbody>
				<tr>
					<td><c:out value="${p.name }"></c:out></td>
					<td><c:out value="${p.price }"></c:out></td>
				</tr>
			</tbody>
		</c:forEach>
	</table>
</body>
</html>