<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<form method="POST">
	<input type="text" name="userid" placeholder="ID" required autofocus>
	<input type="password" name="userpw" placeholder="PW" required>
	<input type="submit" value="로그인">
	<a href="${cpath }/member/join">회원가입</a>
</form>

</body>
</html>