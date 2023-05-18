<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
request.setCharacterEncoding("UTF-8"); //JSP로 사용
int score = Integer.parseInt(request.getParameter("score"));
String name = request.getParameter("name");
String result ="";

if (score>90) {
	result ="A";
} else if (score>=80) {
	result ="B";
}else if (score>=70) {
	result = "C";
}else if (score>=60){
	result = "D";
} else {
	result = "F";
}

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=name %>님의 학점은 <%=result %>입니다.



</body>
</html>