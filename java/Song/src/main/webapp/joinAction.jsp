<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "user.UserDao" %>
    <%@ page import = "java.io.PrintWriter" %>
    <% request.setCharacterEncoding("utf-8"); %>
    
    <jsp:useBean id ="user" class="user.User" scope= "page"/>
	<jsp:setProperty name = "user" property = "userID"/>
	<jsp:setProperty name ="user" property = "userPassword"/>
	<jsp:setProperty name = "user" property = "userName"/>
	<jsp:setProperty name = "user" property = "userGender"/>
	<jsp:setProperty name = "user" property = "userEmail"/>
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
 

if(user.getUserID() == null || user.getUserPassword() == null || user.getUserName() == null || 
user.getUserGender() == null || user.getUserEmail()== null){
	PrintWriter script = response.getWriter();
	script.println("<script>");
	script.println("alert('입력이 안되었습니다 ')");
	script.println("history.back()");
	script.println("</script>");
	
}else{
	UserDao userDao = new UserDao();
	int result = userDao.join(user);
	if(result == -1){
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('이미 존재하는 아이디입니다 ')");
		script.println("history.back()");
		script.println("</script>");
		
	}else {
		PrintWriter script = response.getWriter();
		session.setAttribute("userID", user.getUserID());
		script.println("<script>");
		script.println("location.href = 'main.jsp'");
		script.println("</script>");
		
	}
	
}


%>






</body>
</html>