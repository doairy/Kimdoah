<!-- 회원삽입 페이지 -->
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
<!-- 삽입/수정 form, 삭제는 페이지 없이 구현 -->
<form action='insert' class="col-3">
  <div class="mb-3 mt-3">
    <label for="mname" class="form-label">회원이름:</label>
    <input type="text" class="form-control" id="mname" placeholder="회원이름을 입력하세요" name="mname">
  </div>
  <div class="mb-3">
    <label for="email" class="form-label">이메일:</label>
    <input type="email" class="form-control" id="email" placeholder="이메일을 입력하세요." name="email">
  </div>
 <div class="mb-3">
    <label for="pwd" class="form-label">비밀번호:</label>
    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
  </div>
  <button type="submit" class="btn btn-primary">등록</button>
</form>
</body>
</html>