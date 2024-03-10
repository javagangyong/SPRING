<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>ex02.jsp</h1>
<hr>

<form method="POST">
	<p><input type="text" name="name" placeholder="이름" required autofocus></p>
	<p><input type="number" name="price" step="100" placeholder="가격" required></p>
	<p><input type="submit" value="등록"></p>
</form>

<ol>
	<c:forEach var="dto" items="${list }">
	<li>${dto.name } : ${dto.price }원</li>	
	</c:forEach>
</ol>

</body>
</html>