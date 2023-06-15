<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../resources/css/member/login.css">
<%@ include file="../include/shop_header.jsp" %>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<body>
<%@ include file="../include/shop_menu.jsp" %>


<section id = "container">
	<aside>
		<%@ include file ="include/aside.jsp" %>
	</aside>
</section> 

<style>
   body { font-family:'맑은 고딕', verdana; padding:0; margin:0; }
   ul { padding:0; margin:0; list-style:none;  }

   div#root { width:90%; margin:0 auto; }
   
   header#header { font-size:60px; padding:20px 0; }
   header#header h1 a { color:#000; font-weight:bold; }
   
   nav#nav { padding:10px; text-align:right; }
   nav#nav ul li { display:inline-block; margin-left:10px; }

     section#container { padding:20px 0; border-top:2px solid #eee; border-bottom:2px solid #eee; }
   section#container::after { content:""; display:block; clear:both; }
   aside { float:left; width:200px; }
   div#container_box { float:right; width:calc(100% - 200px - 20px); }
   
   aside ul li { text-align:center; margin-bottom:10px; }
   aside ul li a { display:block; width:100%; padding:10px 0;}
   aside ul li a:hover { background:#eee; }
   
   footer#footer { background:#f9f9f9; padding:20px; }
   footer#footer ul li { display:inline-block; margin-right:10px; }
</style>

</head>
</body>