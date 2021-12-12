<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.io.PrintWriter" %>
	<%@ page import = "musinsa1.UserDao" %>
	
<jsp:useBean id ="member" class ="musinsa1.User" scope ="page"/>
<jsp:setProperty name ="member" property ="userID"/>
<jsp:setProperty name ="member" property ="userPassword"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%


String userID = null;
if(session.getAttribute("userID") != null){
	userID = (String) session.getAttribute("userID");
}
if(userID != null){
	out.println("<script>");
	out.println("alert('이미로그인이 되어있습니다')");
	out.println("location.href ='main.jsp'");
	out.println("</script>");
	
}


if(member.getUserID() != null && member.getUserPassword() != null ){
	
	UserDao userDao = new UserDao();
	int result = userDao.login(member.getUserID(), member.getUserPassword());
	if(result == 1){
		session.setAttribute("userID", member.getUserID());
		out.println("<script>");
		out.println("alert('로그인에 성공했습니디')");
		out.println("location.href ='main.jsp'");
		out.println("</script>");
		
	}else{
		
		out.println("<script>");
		out.println("alert('다시 입력해주세요')");
		out.println("location.href ='login.jsp'");
		out.println("history.back()");
		out.println("</script>");
	}
	
	
	
}else{
	
	out.println("<script>");
	out.println("alert('빈칸을 채워주세요')");
	out.println("location.href ='login.jsp'");
	out.println("history.back()");
	out.println("</script>");
}


%>



</body>
</html>