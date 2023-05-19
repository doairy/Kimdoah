<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %> <!-- 컬렉션 추가 -->
<%@ page import ="com.vo.member" %>
<!DOCTYPE html PUBLIC-"-//W3C DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/Tr/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container mt-3">
  <h2>회원조회</h2>
  <!-- 원하는 모양을 확인할 수 있을정도로 임의로 작성 -->
  <!-- 디자인은 계속적으로 확인(모양)-파일명으로 확인 -->
  <!-- 페이지연결 a태그, 버튼 -->
  <a href="insert"> 등록 </a> <!-- insert doGet으로 이동 -->
  <table class="table table-bordered">
    <thead><!-- head에 th개수만큼 body에 td개수를 맞춘다. -->
      <tr>
        <th>회원번호</th>
        <th>회원이름</th>
        <th>이메일</th>
        <th>수정작업</th>
        <th>삭제작업</th>
      </tr>
    </thead>
    <tbody><!-- 1개만 제외하고 모두 삭제 -->
    <!-- 컬렉션으로 보내온 데이터를 받기 id 사용자명, scope 범위
    class 사용할 라이브러리, type 사용할 vo-->
<%
//controller에서 members로 setAttribute로 전달한 값을 저장
//		저장할 사용자 변수			캐스트연산(가져온값을 변환)		setAttribute("members")
ArrayList <member> members = 
(ArrayList <member>)request.getAttribute("members");
%>

<%
//for each문 members에 저장된 내용을 : mem에 하나씩 읽어서 처리
for(member mem:members){
%>
<tr>
      <td><%=mem.getMon() %> </td>
      <td><%=mem.getMname() %></td>
      <td><%=mem.getEmail() %></td>
      <!-- 수정, 삭제는 작업할 번호(기본키)를 수동으로 request -->
      <td><a href="update?mon=<%=mem.getMon()%>">수정</a></td>
      <td><a href="delete?mon=<%=mem.getMon()%>">삭제</a></td>
 </tr>
 <%
 } 
 %>

       
     
    </tbody>
  </table>
</div>
</body>
</html>