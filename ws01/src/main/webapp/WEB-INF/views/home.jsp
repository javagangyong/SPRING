<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home.jsp</title>
<script src="https://cdn.jsdelivr.net/sockjs/1/sockjs.min.js"></script>
<style>
	#notepad {
		box-sizing: border-box;
		width: 700px;
		height: 400px;
		padding: 10px;
		margin: 10px 0;
		border: 2px solid black;
		font-size: 17px;
		overflow-y: auto;
	}
	form > p {
		box-sizing: border-box;
		width: 700px;
		display: flex;
		justify-content: space-between;
	}
	input[name="input"] {
		padding: 5px;
		font-size: 20px;
		flex: 5;
		margin-right: 5px;
	}
	input[type="submit"] {
		flex: 1;
	}
</style>
</head>
<body>

<h1>websocket을 이용한 메모장 (sockJS)</h1>
<hr>

<div id="notepad"></div>

<form>
	<p>
		<input type="text" name="input" placeholder="글을 입력하세요">
		<input type="submit">
	</p>
</form>

<script>
	// 변수 선언
	const cpath = '${cpath}'
	const form = document.forms[0]
	const ws = new SockJS(cpath + '/chat')	// 이 주소로 웹소켓을 오픈할려고 시도
	const notepad = document.getElementById('notepad')
	
	// 함수 정의
	function messageHandler(event) {
		notepad.innerHTML += '<p>' + event.data + '</p>'
		notepad.scroll({
			top: notepad.scrollHeight,
			behavior: 'smooth',
		})
	}
	
	function submitHandler(event) {
		event.preventDefault()
		const input = event.target.querySelector('input[name="input"]')
		
		ws.send(input.value)	// value를 전달한다 send
		input.value = ''
		input.focus()
	}
	
	// 이벤트 연결
	ws.onmessage = messageHandler
	ws.onopen = function(msg) {}
	ws.onclose = function(msg) {}
	ws.onerror = function(msg) {}
	form.onsubmit = submitHandler
	
</script>

</body>
</html>




















