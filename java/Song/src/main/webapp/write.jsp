<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import ="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name ="viewport" content ="width=device-width", initial-scale = "1">
<link rel = "stylesheet" href="css/bootstrap.css">

<title>jsp 게시판 웹사이트 </title>
</head>
<body>
<%
String userID = null;
if(session.getAttribute("userID")!= null){
	userID = (String) session.getAttribute("userID");
}


%>
<nav class="navbar navbar-default"> <!-- 네비게이션 -->
		<div class="navbar-header"> 	<!-- 네비게이션 상단 부분 -->
			<!-- 네비게이션 상단 박스 영역 -->
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<!-- 이 삼줄 버튼은 화면이 좁아지면 우측에 나타난다 -->
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<!-- 상단 바에 제목이 나타나고 클릭하면 main 페이지로 이동한다 -->
			<a class="navbar-brand" href="main.jsp">JSP 게시판 웹 사이트</a>
		</div>
		<div class ="collapse navbar-collapse" id ="bs-example-navbar-collapse-1">
			<ul class ="nav navbar-nav">
				<li ><a href="main.jsp">메인</a></li>
				<li class ="active"><a href="bbs.jsp">게시판</a></li>
				
			</ul>
			<%
			if (userID == null){
				
			%>

			<ul class =" nav navbar-nav navbar-right">
				<li class ="dropdown">
					<a href="#" class ="dropdown-toggle"
					data-toggle ="dropdown" role ="button" aria-haspopup="true"
					aria-expeanded="false">접속하기 <span class="caret"></span> </a>
						<ul class ="dropdown-menu">
							<li ><a href= "login.jsp">로그인 </a></li>
							<li><a href="join.jsp">회원가입 </a> </li>
						</ul>
				</li>
			</ul>



			<% 
			}else {
			%>
			
			<ul class =" nav navbar-nav navbar-right">
				<li class ="dropdown">
					<a href="#" class ="dropdown-toggle"
					data-toggle ="dropdown" role ="button" aria-haspopup="true"
					aria-expeanded="false">회원관리  <span class="caret"></span> </a>
						<ul class ="dropdown-menu">
							<li ><a href= "logoutAction.jsp">로그아웃</a></li>
					
						</ul>
				</li>
			</ul>


			
			
			
			
			<% 
			}
			%>
			
	
		</div>


</nav>
<div class = "container">
	<div class = "row">
	<form action="writeAction.jsp" method =" post">
		<table class ="table table-striped" style =" text-align : center; border: 1px solid #dddddd">
			 <thead>
			 	<tr>
			 		<th colspan ="2" style ="background-color: #eeeeeee; text-align: center;"> 게시판 글쓰기 양식  </th>
			 		
			 	</tr>
			 </thead>
			 <tbody>
			 	<tr>
			 		
			 		<td><input type= "text" class ="form-control" placeholder ="글 제목" name ="bbsTitle" maxlength ="50"></td>
			 	</tr>
			 	<tr>
			 		<td><textarea  class ="form-control" placeholder ="글 내용" name ="bbsContent" maxlength ="2048" style="height:350px" ></textarea></td>
			 		
			 	</tr>
			 	 
			 </tbody>
			
		</table>
		 <input type ="submit" class ="btn btn-primary pull-right" value ="글쓰기">
	</form>
	</div>





</div>

<script src ="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>


</body>
</html>