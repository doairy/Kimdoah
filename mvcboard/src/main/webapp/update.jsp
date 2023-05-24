<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "com.vo.BoardVO" %>

    <!-- list부분 복사 --> 
    
    <%
   BoardVO boards = (BoardVO)request.getAttribute("boards");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//list에 부분 복사
%>
<form action ="BoardUpdate" method = "post">
<!-- name은 vo에 있는 변수명과 동일하게 -->

<input type ="hidden" name ="no" value=<%=boards.getNo() %>><br> <!-- update처리를 위해서 저장 -->
제목 :<input type ="text" name ="subject" value=<%=boards.getSubject() %>><br>
내용 :<input type ="text" name ="note" value=<%=boards.getNote() %>><br>
<input type ="submit" value="수정">
<input type ="reset" value="새로고침">
</form>

</body>
</html>