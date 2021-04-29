<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>제목 : ${go.title}</div>
<div>내용 : ${go.ctnt}</div>

<a href = "/delete?no=${param.no}">삭제</a>
<a href = "/mod?no=${param.no}">수정</a>

</body>
</html>