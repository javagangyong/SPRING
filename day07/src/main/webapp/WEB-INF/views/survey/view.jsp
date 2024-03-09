<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<h1>${dto.title }</h1>
<form method="POST">
	<div style="display: flex; justify-content: space-between; width: 980px;">
		<div>
			<img src="${cpath }/upload/${dto.img1 }" width="400px"><br>
			${dto.content1 } <input type="checkbox" name="choice" value="1">
		</div>
		<div>
			<img src="${cpath }/upload/${dto.img2 }" width="400px"><br>
			${dto.content2 } <input type="checkbox" name="choice" value="2">
		</div>
	</div>
	<input type="hidden" name="survey_idx" value="${dto.idx }"> 
	<input type="hidden" name="writer" value="${login.userid }"> 
	<input type="submit" value="제출">
</form>

</body>
</html>