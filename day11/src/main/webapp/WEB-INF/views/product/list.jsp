<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<div>
	<a href="${cpath }/product/add">상품 등록</a>
</div>

<div id="productList">
	<c:forEach var="dto" items="${list }">
		<a href="${cpath }/product/list/${dto.idx}">
			<div id="productBox">
				<div>
					<div><img src="${cpath }/upload/${dto.img}" height="200"></div>
					${dto.productName }<br>
					가격 : ${dto.price }<br>
					수량 : ${dto.productQuantity }
				</div>
			</div>
		</a>
	</c:forEach>
</div>

</body>
</html>