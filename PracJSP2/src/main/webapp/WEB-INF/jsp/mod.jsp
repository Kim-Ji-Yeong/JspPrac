<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="all">
	
		
		<form action="/mod?no=" method="post">
			<div id = "TITLE">
				제목 : <input type="text" name="title" value = "abcd">
			</div>
			<div>
				<p>-------------- 내용 --------------</p>
				<textarea name="ctnt" rows="20" cols="30">abcd</textarea>
			</div>
			<div id="btn">
				<input type="submit" value="등록" class="left"> <input
					type="reset" value="초기화" class="right">
			</div>
		</form>
		<a href="/list"><button>돌아가기</button></a>
	</div>
</body>
</html>