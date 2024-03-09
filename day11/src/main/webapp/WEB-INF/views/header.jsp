<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body {
		width: 980px;
		margin: 0 auto;
	}
	#productBox {
		width: 220px;
		height: 270px;
		display: flex;
		background-color: #E5E1E1;
		border: 1px solid black;
		margin: 10px;
		text-align: center;
		justify-content: center;
	}
	#productList {
		display: flex;
		flex-wrap: wrap;
	}
</style>
</head>
<body>

<h1><a href="${cpath }">CU</a></h1>
