<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div.box {
		width: 400px;
		height: 600px;
		margin: 0 auto;
		border: 1px solid black;
	}
	div.boxlist {
		width: 70px;
		padding: 10px;
		margin: 10px auto;
	}
</style>
</head>
<body>

<div class="box">
	<h1>현재 접속중인 사람~</h1>
	<c:forEach var="user" items="${userlist }">
		<div class="boxlist">
			<a href="${cpath }/chat/room?roomId=${user}">${user}</a>
		</div>
	</c:forEach>
</div>

</body>
</html>