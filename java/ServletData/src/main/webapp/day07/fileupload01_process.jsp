<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "com.oreilly.servlet.*" %>
   
   <%@page import ="com.oreilly.servlet.multipart.*" %>
   <%@ page import = "java.util.*" %>
   <%@ page import = "java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
MultipartRequest multi = new MultipartRequest(request,"/Users/song-yeongseo/Desktop",5*1024*1024,
		"utf-8",new DefaultFileRenamePolicy());
	Enumeration params = multi.getParameterNames();
	
 	while(params.hasMoreElements()){
 		String name = (String) params.nextElement();
 		String value = multi.getParameter(name);
 		out.print(name+ "= "+ value + "<br>");
 		
 	}
 	
 	out.println("0--------------------------<br>");
 	
 	out.println("요청 라미터 이름 "+ name +"<br>");
	out.println("요청 라미터 이름 "+   +"<br>");
 	
 	
 	
 	
 	
 	
 	
%>

</body>
</html>