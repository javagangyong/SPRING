 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>room.jsp - ${room.name }</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.6.1/sockjs.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/stomp.js/2.3.3/stomp.js"></script>
<script>
	// 자바스크립트 함수 정의
	
	function getCurrentHHmm() {
		const d = new Date()
		let h = d.getHours()
		let m = d.getMinutes()
		if(h < 10) h = '0' + h
		if(m < 10) m = '0' + m
		return h + ':' + m
	}
	
	function onReceive(chat) {
		const content = JSON.parse(chat.body)
		const from = content.from
		const text = content.text
		let str = ''
		str += '<div class="' + (from == 'service' ? 'service' : from == username ? 'right' : 'left') + '">'
		str += '<div>'
		str += '<b>' + (from != 'service' ? from + ': ' : '') + text + '</b>'
		str += '<br><sub>' + content.time + '</sub>'
		str += '</div></div>'
		messageArea.innerHTML += str
		messageArea.scrollTop = messageArea.scrollHeight
	}
	
	function onConnect() {
		// onConnect가 하는일
		// 1번째 구독 2번째 입장메세지 전달
		console.log('STOMP Connection')
		stomp.subscribe('/broker/room/' + roomId, onReceive)	// 구독할 채널, 메시지 받으면 실행할 함수
		// window.addEventListener('onrecieved', onReceive)
		// 해당주소로 구독, 메세지가 발생하면 onReceive를 실행
		stomp.send('/app/enter/' + roomId, {}, JSON.stringify({	// 서버에게 입장 메시지와 시간을 보낸다
			roomId: roomId,
			from: username,
			time: getCurrentHHmm(),
		}))
		document.querySelector('input[name="msg"]').focus()
	}
	
	function onInput() {
		const text = document.querySelector('input[name="msg"]').value
		if(text == '') {
			return
		}
		document.querySelector('input[name="msg"]').value = ''
		
		stomp.send('/app/message/' + roomId, {}, JSON.stringify ({
			roomId: roomId,
			from: username,
			text: text,
			time: getCurrentHHmm()
		}))
		document.querySelector('input[name="msg"]').focus()
	}
	
	function onDisconnect(event) {
		event.preventDefault()
		console.log(username + ' disconnect from [' + roomId + ']')
		stomp.send('/app/disconnect/' + roomId, {}, JSON.stringify ({
			roomId: roomId,
			from: username,
			time: getCurrentHHmm(),
		}))	
		location.href = this.href
	}
	
	// JSP에서 자바스크립트로 넘기는 변수
	const roomName = '${room.name}'
	const roomId = '${room.roomId}'
	const username = '${username}'
	const cpath = '${cpath}'
	
</script>
<style>
	#messageArea {
		border: 2px solid black;
		width: 700px;
		height: 250px;
		margin: 20px 0;
		word-wrap: break-word;
		overflow-y: scroll;
		scroll-behavior: smooth;
	}
	#messageArea > div > div {
		margin: 10px;
		padding: 10px 20px;
		border: 0.5px solid black;
		border-radius: 20px;
		width: fit-content;
		box-shadow: 2px 2px 2px grey;
	}
	.service {
		display: flex;
		justify-content: center;
	}
	.service > div {
		background-color: #f5f6f7
	}
	.left {
		display: flex;
		justify-content: flex-start;
	}
	.right {
		display: flex;
		justify-content: flex-end;
	}
	.right > div {
		background-color: yellow;
	}
	.service sub {
		clear: both;
		color: grey;
		display: none;
	}
	sub {
		color: grey;
	}
	.left sub {
		float: left;
	}
	.right sub {
		float: right;
	}
</style>

</head>
<body>

<h1><a href="${cpath }">room.jsp - ${room.name }</a></h1>
<hr>

<div id="messageArea"></div>
<div id="input">
	<input type="text" name="msg" id="msg" placeholder="내용을 입력하세요">
	<input type="button" value="send">
	<a id="disconnect" href="${cpath }/chat/rooms"><button>나가기</button></a>
</div>

<script>
	if(roomId == '') {
		location.href = cpath
	}
	
	const messageArea = document.getElementById('messageArea')
	const sockJS = new SockJS(cpath + '/endpoint')
	const stomp = Stomp.over(sockJS)
	
	const sendBtn = document.querySelector('input[value="send"]')
	const msgInput = document.querySelector('input[name="msg"]')
	const leaveLink = document.getElementById('disconnect')
	
	stomp.connect({}, onConnect) // onConnect 실행
	// connect 연결을 시도. 성공하면 onConnect를 실행한다
	
	leaveLink.onclick = onDisconnect
	sendBtn.onclick = onInput
	msgInput.onkeyup = function(e) {
		if(e.key == 'Enter') onInput()
	}
</script>

</body>
</html>