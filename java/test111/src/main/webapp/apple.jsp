<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="com.ReoDao" %>
     <%@ page import = "java.io.PrintWriter" %>
    
    <jsp:useBean id="bbb" class="com.Reo" scope ="page"/>
    <jsp:setProperty name ="bbb" property ="name"/>
    <jsp:setProperty name ="bbb" property ="color"/>
    <jsp:setProperty name ="bbb" property ="age"/>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<%
PrintWriter script = response.getWriter();

ReoDao ReoDao = new ReoDao(bbb.getName(),bbb.getColor(),bbb.getAge());
script.println("<script>");
script.println("location.href ='abc.jsp'");
script.println("</script>");
%>
</body>
</html>