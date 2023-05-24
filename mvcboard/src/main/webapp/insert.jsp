<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action ="BoardInsert" method = "post">
<!-- name은 vo에 있는 변수명과 동일하게 -->
<!--  번호 : <input type ="number" name ="no"><br>-->
제목 :<input type ="text" name ="subject"><br>
내용 :<input type ="text" name ="note"><br>
<input type ="submit" value="등록">
</form>

</body>
</html>