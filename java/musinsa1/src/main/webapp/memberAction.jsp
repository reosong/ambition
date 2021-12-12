<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.io.PrintWriter" %>
	<%@ page import = "musinsa1.UserDao" %>
	
<jsp:useBean id ="member" class ="musinsa1.User" scope ="page"/>
<jsp:setProperty name ="member" property ="userID"/>
<jsp:setProperty name ="member" property ="userPassword"/>
<jsp:setProperty name ="member" property ="userPasswordok"/>
<jsp:setProperty name ="member" property ="userEmail"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<% 
//UserDao userDao = new UserDao();
//userDao.pirnt(member);

if(member.getUserID() == null || member.getUserPassword() == null ||
member.getUserPasswordok() == null || member.getUserEmail() == null){

	
	out.println("<script>");

	out.println("alert('입력이 안된 부분이 있습니다. ')");
	out.println("history.back()");
	out.println("</script>");


}else{
	
	if(member.getUserPassword().equals(member.getUserPasswordok())){
	
		UserDao userDao = new UserDao();
		if(userDao.idCheck(member) != 0){
			
		

	int result = userDao.join(member);
		if(result == 0){
			out.println("<script>");
			out.println("('회원가입이 완료 되었습니다.')");
			out.println("location.href ='main.jsp'");
			out.println("</script>");
		}else{
			out.println("<script>");
			out.println("('무언가 잘못 되었습니다. ')");
			out.println("location.href ='main.jsp'");
			out.println("</script>");
			
		}
		}else{
			out.println("<script>");
			out.println("alert('해당 아이디가 이미 있습니다')");
			out.println("history.back()");
			out.println("</script>");
		}
	}else{
		out.println("<script>");
		out.println("alert('비밀번호를 확인해주세요')");
		out.println("history.back()");
		out.println("</script>");
	}
}

%>
</body>
</html>