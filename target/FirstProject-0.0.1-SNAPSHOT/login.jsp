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
<c:if test="${msg ne null}">
	<p style="color: red">${msg }</p>
</c:if>
<form action="LoginServlet" method="post">
		<label>User Name: </label>
		<input name="user" value="" class="nameClass"/>
		<br>
		<label>Password:   </label>
		<input name="pass" value="" class="passClass"/>
		
		<br>
		<input type="submit" value="Sign In" class="btnSubmit"/>
	</form>
</body>
</html>