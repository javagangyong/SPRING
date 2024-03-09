<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>ex02 - ajax 문자열</h1>
<hr>

<p>
	${n1 } + ${n2 } =
	<input type="number" name="user" min="0" max="1000" placeholder="정답 입력">
	<button id="btn">확인</button>
</p>
<h3 id="result"></h3>

<script>
	const btn = document.getElementById('btn')
	
	const clickHandler = function() {
		const user = document.querySelector('input[name="user"]').value
		const url = '${cpath}/ex02Ajax?user=' + user
				
		fetch(url) //지정된 주소로 요청을 합니다
			.then(resp => {		// 요청을 날려서 응답이 돌아오면 text로
				console.log('resp :', resp)		// resp가 어떻게 생겼는지 궁금해서 콘솔창에 띄워보는 것
				return resp.text()
			}) 
			.then(text => {
				const result = document.getElementById('result')
				result.innerText = text
			})
	}
	btn.onclick = clickHandler
	
</script>
	



</body>
</html>