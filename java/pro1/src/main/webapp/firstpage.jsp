<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p> first page</p>

<% 
response.sendRedirect("secondpage.jsp");
%>
<!-- 
forward는 주소값이 바뀌지 않음 
sendreditect 는 주소값이 바뀜
 -->
</body>
</html>