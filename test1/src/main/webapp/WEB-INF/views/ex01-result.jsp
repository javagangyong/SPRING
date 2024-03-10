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
	.blue {
		color: blue;
	}
	.red {
		color: red;
	}
</style>
<body>

<h3 class="${color }">${exp }</h3>

<p>
	<a href="${cpath }/ex01"><button>다시</button></a>
	<a href="${cpath }"><button>홈으로</button></a>
</p>

</body>
</html>