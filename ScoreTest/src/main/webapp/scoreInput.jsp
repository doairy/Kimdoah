<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<form action="score" method = "post">
<div class="container mt-3">
<h2> 학생이름 : </h2><br><br>
<input type="text" name="name" placeholder="이름을 입력하세요." text-center><br>
<h2>시험점수 : </h2><br><br>
<input type="text" name="score" placeholder = "시험점수를 입력하세요."><br>


	<button type="submit" class="btn btn-success">학점 계산하기</button>
</div>


</form>

</body>
</html>