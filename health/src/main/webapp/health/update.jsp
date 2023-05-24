<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="com.vo.HealthVO" %>
    <%@ page import="java.util.ArrayList" %>

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

 <!--  //검색에 존재하는 데이터를 전달받아서 저장하는 방법을 활용-->
 <%
 HealthVO health = (HealthVO)request.getAttribute("healths");
%>
<!-- 수정 폼 -->

<div class="container mt-3">
  <h2>건강검진 수정</h2>
  <form action="update" method = "post" class ="col-3">
    <div class="mb-3 mt-3">
      <label for="id">검진번호:</label>
      <input type="number" class="form-control" id="id"  name="id" value = <%= health.getId() %> readonly>
    </div>
    <div class="mb-3">
      <label for="hdate">검진일:</label>
      <input type="date" class="form-control" id="hdate" name="hdate" value = <%= health.getHdate() %>>
    </div>
    
    <div class="mb-3">
      <label for="hweight">몸무게:</label>
      <input type="number" class="form-control" id="hweight" name="hweight"value = <%=health.getHweight() %>>
    </div>
    
    <div class="mb-3">
      <label for="hheight">키:</label>
      <input type="number" class="form-control" id="hheight"  name="hheight" value = <%=health.getHheight() %>>
    </div>
    
    <div class="mb-3">
      <label for="hblood">혈당수치:</label>
      <input type="number" class="form-control" id="hblood" name="hblood" value = <%=health.getHblood() %>>
    </div>
    
    <div class="mb-3">
      <label for="eid">직원번호:</label>
      <input type="number" class="form-control" id="eid" name="eid" value = <%=health.getEid() %>>
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
