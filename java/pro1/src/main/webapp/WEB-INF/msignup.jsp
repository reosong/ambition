<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
	String m_name;
	String m_pass;
	String[] m_hobby;
	%>
	
	<%
	m_name = request.getParameter("mname");
	m_pass = request.getParameter("mpassword");
	m_hobby = request.getParameterValues("mhobby");
	
	
	%>
	
	m_name : <%=m_name%> 
	
	
	
	
</body>
</html>