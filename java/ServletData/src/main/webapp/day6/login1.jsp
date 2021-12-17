<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
if(session.getAttribute("memberId")!=null)
	response.sendRedirect("loginok.jsp");

%>

<form action="Lo" method="post">
id: <input type = "text" name="mId"><br>
pw: <input type ="text" name ="mPw"><br>
<input type ="submit" value = "login">


</form>
</body>
</html>