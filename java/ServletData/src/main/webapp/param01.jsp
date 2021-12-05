<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3> action tag</h3>
<jsp:include page="param02jsp.jsp">
	<jsp:param name="name" value ="song"/>
	<jsp:param name = "pass" value = "1234"/>
	</jsp:include>
	
	







</body>
</html>