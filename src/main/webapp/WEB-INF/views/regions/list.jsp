<%@page import="com.winter.app.regions.RegionDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%--     <%
    List<RegionDTO> ar =(List<RegionDTO>)request.getAttribute("list");
    %> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<c:import url="../temps/bootStrap_css.jsp"></c:import>
</head>
<!-- header.jsp 불러올꺼임 -->
<c:import url="../temps/header.jsp"></c:import>
<body>
	<h1>Regions List</h1>
	<table class="table table-hover">
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
			</tr>
		</thead>

		<c:forEach items="${requestScope.list}" var="dto">
			<tr>
				<td>${pageScope.dto.region_id}</td>
				<td><a href="./detail?region_id=${dto.region_id}">${pageScope.dto.region_name}</a></td>
			</tr>
		</c:forEach>




		<tbody>
		</tbody>
	</table>
	<a href="./add" class="btn btn-outline-info">Add</a>
	
	
<c:import url="../temps/bootStrap_js.jsp"></c:import>


</body>
</html>