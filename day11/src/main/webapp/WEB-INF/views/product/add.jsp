<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<h3>상품 등록</h3>
<form method="POST" enctype="multipart/form-data">
	<p><input type="text" name="productName" placeholder="상품 이름" required autofocus></p>
	<p><input type="number" name="price" placeholder="가격" required></p>
	<p><input type="number" name="productQuantity" placeholder="재고 수량" required></p>
	<p><input type="file" name="upload" required></p>
	<p><input type="submit" value="상품 등록"></p>
</form>

</body>
</html>