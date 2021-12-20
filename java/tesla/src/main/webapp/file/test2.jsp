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
	String  a =  request.getParameter("nic_text"); 
	out.println("<script>");
	out.println("alert(a))");
	
	out.println("</script>");
System.out.println(a);
	%>


</body>
</html>