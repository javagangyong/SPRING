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
<body>

<h1>ex04 - 회원 목록</h1>
<hr>

<div id="root"></div>

<script>
	function loadHandler() {
		const root = document.getElementById('root')
		const url = '${cpath}/ex04Ajax'
		
		fetch(url)
			.then(resp => resp.json())
			.then(json => {
				// 이후 코드 작성
				const arr = json
				let tag = '<table border="1" cellpadding="10" cellspacing="0">'
				for(let i = 0; i < arr.length; i++) {	// i : 0, 1, 2, 3 ...
					const dto = arr[i]
					tag += '<tr>'
					for(let key in dto) {	// key: idx, userid, userpw, username...
						if(key != 'userpw') {
							tag += '<td>' + dto[key] + '</td>'
						}
					}
					tag += '</tr>'
				}
				tag += '</table>'
				root.innerHTML = tag
			})
	}
	
	// DOM : Document Object Model, 문서의 내용을 하나하나 객체화하여, 객체의 모델관계로 해석하는 구조
	// HTML문서 내부의 태그를 '객체'로 취급하여, 여러 객체가 'Tree' 구조로 나열되어 있는 관계로 해석한다
	// 문서를 구성하는 각 요소(element) 혹은 객체(object)를 DOM이라고 부르기도 한다
	
	document.addEventListener('DOMContentLoaded', loadHandler)
// 	window.onload = loadHandler
	
</script>

</body>
</html>


