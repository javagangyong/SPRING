<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h1>home</h1>
<h3>오늘은</h3>
<fmt:formatDate value="${today }" pattern="yyyy년 MM월 dd일" /> 입니다 !<br>

<h3><a href="${cpath }/product/list">상품</a></h3>

</body>
</html>