<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	section, header, body {
		margin: 0 auto;
		width: 980px
	}
	
</style>
<body>

<header style="width: 900px; margin: auto;">
	<h1><a href="${cpath }">day05</a></h1>
	<div id="login" style="height: 40px;">
		<c:if test="${not empty login }">
		<p>
			${login.username } 님 로그인 중
			<a href="${cpath }/member/logout"><button>로그아웃</button></a>
		</p>
		</c:if>
	</div>
	<nav>
		<ul style="display: flex; padding: 0; list-style: none; justify-content: space-around;">
			<li><a href="${cpath }/member/list">회원목록</a></li>
			<li><a href="${cpath }/member/login">로그인</a></li>
			<li><a href="${cpath }/board/list">게시판</a></li>
		</ul>
	</nav>
</header>

</body>
</html>