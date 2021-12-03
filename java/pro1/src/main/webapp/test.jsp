<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<!--
         선언태그: 자바의 멤버변수 또는 메서드를 선언 
-->

<%! 

int num =10;
String str ="jsp";
public void jspMethod(){
	}

%>



<!--  스크립트릿 태그  -->
<!--
   jsp 페이지에 java코드를 넣기 위한태그
 
 -->
 <%
 if(num>0){

 }
 %>
<%
if(num>0){
%>
<p> num>0</p>
<%
}else{
%>
<p>num <=0</p>
<%} %>

<!-- 표현식 태그  -->
num is <%= num %>


<%@ 지시어 서버에서 jsp 페이지를 퍼리하는 방법에 대한 정의  %>
<%@page  language ="java" contentType =" text/html; charset=utf-8%" pageEncoding ="euc-kr">
<%@include  file = "header.jsp"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix ="c" %>




</body>
</html>