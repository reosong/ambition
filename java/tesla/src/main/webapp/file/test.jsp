<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <jsp:useBean id="data" class ="tesla.Write" scope="page"/>
    <jsp:setProperty name = "data" property ="title"/>
    <jsp:setProperty name = "data" property ="content"/>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
out.println("<script>");
out.println("alert(title+content)");
out.println("</script>");
%>
</body>
</html>