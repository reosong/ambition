<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import = "java.io.PrintWriter" %>
	<%@ page import = "musinsa1.DataDao" %>
	
<jsp:useBean id ="contents" class ="musinsa1.Data" scope ="page"/>
<jsp:setProperty name ="contents" property ="dataTitle"/>
<jsp:setProperty name ="contents" property ="dataContent"/>
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

if(contents.getDataTitle() == null || contents.getDataContent()==null ){
	
	out.println("<script>");
	out.println("alert('빈칸이 있습니다')");
	out.println("history.back()");
	out.println("</script>");
	
}else{
	DataDao dataDao = new DataDao();
	int result = dataDao.update(contents.getDataTitle(), contents.getDataContent(),userID );
	
	if( result == -1){
		out.println("<script>");
		out.println("alert('글쓰기에 실패 했습니다')");
		out.println("history.back()");
		out.println("</script>");
	}else{
		out.println("<script>");
		out.println("alert('성공!')");
		out.println("location.href='costomer.jsp'");
		out.println("</script>");
	}
	
}




%>





</body>
</html>