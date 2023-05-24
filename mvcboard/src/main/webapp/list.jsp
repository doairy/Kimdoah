<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "com.vo.BoardVO" %> <!-- 검색, 수정 -->
 <%@ page import = "java.util.ArrayList" %> <!-- 검색 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//불러온 자료를 사용하기 위해서 저장
//EL을 사용하면 이부분은 생략
//BoardList.java에서 setAttribute로 선언된 이름과 동일하게 
ArrayList<BoardVO> boards = (ArrayList <BoardVO>)request.getAttribute("boards");
%>
<h1>목록</h1>
<table border="1">
	<tr>
		<td>번호</td>
		<td>제목</td>
		<td>내용</td>
		<td>작업</td>
	</tr>
<%
//jstl을 사용하면 이부분이 표현식이 바뀐다.
//BoardVO-com.vo 선언된 이름, board-개인작업을 위한 이름, boards는 위에 선언된 이름
for(BoardVO board:boards) {
%>
	<tr>
	
		<td><%=board.getNo() %></td>
		<td><%=board.getSubject() %></td>
		<td><%=board.getNote() %></td>
		<!-- a태그에서 전달할 값을 수동으로 작성 -->
		<td><a href="BoardUpdate?no=<%=board.getNo() %>">수정</a> &nbsp;<a href="BoardDelete?no=<%=board.getNo() %>">삭제</a></td><!-- &nbsp; 스페이스 1칸 -->
		 
	</tr>
	<%
	}
	%>
</table>
<a href="BoardInsert">새로 등록</a>
</body>
</html>