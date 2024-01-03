<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temps/bootStrap_css.jsp"></c:import>
</head>
<body>
	<c:import url="../temps/header.jsp"></c:import>
	<section>
		<div>
			<c:if test="${not empty dto}">
				<table class="table table-dark">
					<tr>
						<td>상품ID</td>
						<td class="table-active">${dto.productNum}</td>
					</tr>
					<tr>
						<td>상품명</td>
						<td class="table-active">${dto.productName}</td>
					</tr>
					<tr>
						<td>설명</td>
						<td class="table-active">${dto.productContents}</td>
					</tr>
					<tr>
						<td>이자율</td>
						<td class="table-active">${dto.productRate}</td>
					</tr>
					<tr>
						<td>평점</td>
						<td class="table-active">${dto.productJumsu}</td>
					</tr>
				</table>
				<%-- <h3>상품명 :  ${dto.productNum}</h3>		
				<div>${dto.productName}</div>
				<div>${dto.productContents}</div>
				<div>${dto.productRate}</div>
				<div>${dto.productJumsu}</div> --%>
			</c:if>
			<c:if test="${empty dto}">
				<h3>없는 번호</h3>
			</c:if>
		</div>
	</section>
	<c:import url="../temps/bootStrap_js.jsp"></c:import>
</body>
</html>