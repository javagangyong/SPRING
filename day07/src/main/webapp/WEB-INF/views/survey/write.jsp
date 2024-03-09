<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<div style="display: flex; justify-content: center;">
<div style="width: 500px;">
<form method="POST" enctype="multipart/form-data">
	<p><input type="text" name="title" placeholder="주제선정제목" style="width: 400px;"></p>
	<input type="hidden" name="writer" value="${login.userid }">
	<div class="sb">
		<div>
			<p><input type="file" name="upload1"></p>
			<p><input type="text" name="content1" placeholder="업로드 설명" style="width: 200px;"></p>
		</div>
		<div>
			<p><input type="file" name="upload2"></p>
			<p><input type="text" name="content2" placeholder="업로드 설명" style="width: 200px;"></p>
		</div>
	</div>
	<P><input type="submit" value="업로드"></P>
</form>
</div>
</div>

</body>
</html>