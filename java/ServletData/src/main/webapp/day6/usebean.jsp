<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id= "person" class = "ServletData.com.person" scope = "request"/>
	<jsp:serProperty name = "person" property = "id" value = "2021.12.03" />
	<jsp:setProperty name = "person" property = "name" value = "hong" />
	
	<p> 아이디 : <jsp:getProperty name ="person" property = "id"/>
	<p> 이름 : <jsp:getProperty name ="person" property = "name"/>
	
	
</body>
</html>