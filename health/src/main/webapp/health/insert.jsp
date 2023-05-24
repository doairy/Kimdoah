<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
  <div class="container-fluid">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link active" href="#">건강검진결과</a> <!--  계속 선택한 상태(로고) -->
      </li>
      <li class="nav-item">
        <a class="nav-link" href="list">검진목록</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="insert">검진등록</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="delete">검진삭제</a>
      </li>
    </ul>
  </div>
</nav>

<!-- 등록 폼 -->

<div class="container mt-3">
  <h2>건강검진 등록</h2>
  <form action="insert" method = "post" class ="col-3">
    <div class="mb-3 mt-3">
      <label for="id">검진번호:</label>
      <input type="number" class="form-control" id="id"  name="id">
    </div>
    <div class="mb-3">
      <label for="hdate">검진일:</label>
      <input type="date" class="form-control" id="hdate" name="hdate">
    </div>
    
    <div class="mb-3">
      <label for="hweight">몸무게:</label>
      <input type="number" class="form-control" id="hweight" name="hweight">
    </div>
    
    <div class="mb-3">
      <label for="hheight">키:</label>
      <input type="number" class="form-control" id="hheight"  name="hheight">
    </div>
    
    <div class="mb-3">
      <label for="hblood">혈당수치:</label>
      <input type="number" class="form-control" id="hblood" name="hblood">
    </div>
    
    <div class="mb-3">
      <label for="eid">직원번호:</label>
      <input type="number" class="form-control" id="eid" name="eid">
    </div>
    
    <div class="form-check mb-3">
      <label class="form-check-label">
        <input class="form-check-input" type="checkbox" name="remember"> Remember me
      </label>
    </div>
    <button type="submit" class="btn btn-primary">추가</button>
  </form>
</div>

</body>
</html>
