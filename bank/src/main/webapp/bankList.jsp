<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import = "java.util.ArrayList" %>
    <%@ page import ="com.VO.bankVO" %>
    <% 
    ArrayList<bankVO> bank = (ArrayList<bankVO>)request.getAttribute("bank");
    %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>예금관리</title>
</head>
<body>

<div class="container mt-3">
  <h2>예금관리</h2>
              
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>고객번호</th>
        <th>고객명</th>
        <th>저축상품</th>
        <th>납입액</th>
        <th>가입일</th>
        <th>저축기간(월)</th>
      </tr>
    </thead>
    <tbody>
    <%for (bankVO temp:bank) {
    %><tr>
    <td><a href = "update?=banum=<%= temp.getBanum() %>"><%=temp.getBanum() %></a></td>
    <td> <%= temp.getBaname() %>
    <td> <%= temp.getBaitem() %>
    <td> <%= temp.getBamoney() %>
    <td> <%= temp.getBadate() %>
    <td> <%= temp.getBamon() %>
      <td><a href = "delete?=banum=<%= temp.getBanum() %>"><%=temp.getBanum() %></a></td>
    </tr>
    
    <%}
    %>
    
    </tbody>
  </table>
  <A href ="insert">등록</A>
</div>
</body>
</html>