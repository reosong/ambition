<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% String name = request.getParameter("name");
	String pass = request.getParameter("pass");
%>

<p> 이름은 무엇이냐 <%= name %> </p>
<p> 비밀번호는 무엇이냐 <%= pass %> </p>
</body>
</html>