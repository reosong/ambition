<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "user.UserDao" %>
    <%@ page import = "java.io.PrintWriter" %>
    <% request.setCharacterEncoding("utf-8"); %>
    
    <jsp:useBean id ="user" class="user.User" scope= "page"/>
	<jsp:setProperty name = "user" property = "userID"/>
	<jsp:setProperty name ="user" property = "userPassword"/>
	    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>jsp 게시판 웹사이트 </title>
</head>
<body>
<% 

String userID = null;
if(session.getAttribute("userID") != null){
	userID = (String) session.getAttribute("userID");
}
if(userID != null){
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('이미로그인이 되어있습니다')");
	script.println("location.href ='main.jsp'");
	script.println("</script>");
	
}

UserDao userDao = new UserDao();
int result = userDao.login(user.getUserID(),user.getUserPassword());
if(result ==1){ //로그인성공 
	session.setAttribute("userID", user.getUserID());
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("location.href = 'main.jsp'");
	script.println("</script>");
	
}else if (result ==0){ //비밀번호 틀림 
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('비밀번호가 틀립니다')");
	script.println("history.back()");
	script.println("</script>");
	
}else if (result ==-1){// 아이디가 없음 
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('존재하지 않는 아이디 입니다')");
	script.println("history.back()");
	script.println("</script>");
	
}else if (result ==-2){ //??????????
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('데이터 베이스 오류 입니다 ')");
	script.println("history.back()");
	script.println("</script>");
	
}

%>






</body>
</html>