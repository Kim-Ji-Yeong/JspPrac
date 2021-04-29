<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <form action = "/write" method = "post">
   <p> 제목 : <input type = "text" name = "title"></p>
   <p> 내용 :<textarea name = "ctnt"></textarea></p>
    <input type ="submit" value = "보내기">
    <p><a href = "/list">돌아가기</a></p>
    </form>

</body>
</html>