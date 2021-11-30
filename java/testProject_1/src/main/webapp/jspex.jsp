<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "header.jsp" %>

<%! 
int num =10;
String str = "jsp";


public void jspMethod(){
	
}

%>
	<% if (num>0){ %> <p> num>0</p>
	<%}else{%><p>num<=0</p>
	<%}%>
	
	
	
	
<!-- -->
num is <%= num %>

<%-- --%>
</body>
</html>