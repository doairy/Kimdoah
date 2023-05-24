<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.vo.HealthVO" %>
<%@ page import = "java.util.ArrayList" %>    
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
<!-- 받아온 값을 저장 -->
<%
ArrayList<HealthVO> healths = (ArrayList <HealthVO>)request.getAttribute("healths");
%>

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
<div class="container mt-3">
  <h2>건강검진 목록</h2>            
  <table class="table table-bordered">
    <thead>
      <tr><!-- 1줄(칸을 채우기) -->
        <th>검진번호</th>
        <th>검진일</th>
        <th>몸무게</th>
        <th>키</th>
        <th>혈당수치</th>
        <th>직원번호</th>
      </tr>
    </thead>
    <tbody>
    <%
    for(HealthVO health:healths) {
    %>
      <tr> <!-- 실질적인 작업 -->
      	<!-- 번호를 클릭하면 수정으로 -->
        <td><a href ="update?id=<%=health.getId() %>"><%=health.getId() %></a></td>
        <td><%=health.getHdate() %></td>
        <td><%=health.getHweight()%></td>
        <td><%=health.getHheight() %></td>
        <td><%=health.getHblood() %></td>
        <td><%=health.getEid() %></td>
        
        
      </tr>
    <%
    }
    %>
    </tbody>
  </table>
</div>


</body>
</html>
