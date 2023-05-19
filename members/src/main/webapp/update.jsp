<!-- tkrwp -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<!-- 수정페이지는 수정하는 데이터의 기본키값을 반드시 저장 -->
<!-- 삽입/수정 form, 삭제는 페이지 없이 구현 -->
<h3>회원 수정</h3>
<form action='update' class="col-3">
<input type="hidden" id="mon"> <!-- 숨겨진 기본키 -->
  <div class="mb-3 mt-3">
    <label for="tname" class="form-label">회원이름:</label>
    <input type="text" class="form-control" id="tname" placeholder="회원이름을 입력하세요" name="tname">
  </div>
  <div class="mb-3">
    <label for="email" class="form-label">이메일:</label>
    <input type="email" class="form-control" id="email" placeholder="이메일을 입력하세요." name="email">
  </div>
 <div class="mb-3">
    <label for="pwd" class="form-label">비밀번호:</label>
    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
  </div>
  <button type="submit" class="btn btn-primary">수정</button>
</form>
</body>
</html>