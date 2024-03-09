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
	header, section {
		width: 980px;
		margin: auto;
	}
	table {
		border: 1px solid black;
		border-collapse: collapse;
	}
	tr, td {
		padding: 10px;
		border: 1px solid black;
	}
	li, ul {
 		text-decoration: none;
	}
</style>
</head>
<body>

	<header>
		<h1><a href="${cpath }">day03</a></h1>
		
		<nav>
			<ul style="display: flex; justify-content: space-around; padding: 0; list-style: none;">
				<li><a href="${cpath }/member/list">회원 목록</a></li>
				<li><a href="${cpath }/member/login">로그인</a></li>
			</ul>
		</nav>
	</header>

</body>
</html>