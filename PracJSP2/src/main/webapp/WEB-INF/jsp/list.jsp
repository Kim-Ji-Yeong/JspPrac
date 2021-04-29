<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/write">글쓰기로~</a>


	<table>
		<tr>
			<td>no</td>
			<td>제목</td>
		</tr>

		<c:forEach var = "item" items = "${list}" varStatus = "status"> 
		<tr>
			<td>${status.index}</td>
			<td><a href = "/detail?no=${status.index}">${item.title}</a></td>
		</tr>
		
		</c:forEach>
		
		<c:forEach var = "i" begin = "1" end ="10">
		<span>${i}</span>
		</c:forEach>
	</table>
</body>
</html>