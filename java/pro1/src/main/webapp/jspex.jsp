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
String adminId;
String adminPw;
String imgDir;
String testServletIP;
%>

<%
	adminId = config.getInitParameter("adminid");
	adminPw = config.getInitParameter("adminpw");
	
%>

<p>adminid : <%= adminId %></p>
<P> adminpw : <%= adminPw %></P>


<%
imgDir= application.getInitParameter("imgDir");
testServletIP = application.getInitParameter("testServletIP");

%>
<p> imgDir: <%= imgDir %></p>
<P> testServletIP : <%= testServletIP %></P>





</body>
</html>