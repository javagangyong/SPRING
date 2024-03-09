<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<table style="display: flex; justify-content: center;">
	<tr>
		<th style="width: 400px;">제목</th>
		<th>작성자</th>
	</tr>
	<c:forEach var="dto" items="${list }">
		<tr>
			<td><a href="${cpath }/survey/view/${dto.idx}">${dto.title }</a></td>
			<td>${dto.writer }</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>