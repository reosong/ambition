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
         �����±�: �ڹ��� ������� �Ǵ� �޼��带 ���� 
-->

<%! 

int num =10;
String str ="jsp";
public void jspMethod(){
	}

%>



<!--  ��ũ��Ʈ�� �±�  -->
<!--
   jsp �������� java�ڵ带 �ֱ� �����±�
 
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

<!-- ǥ���� �±�  -->
num is <%= num %>


<%@ ���þ� �������� jsp �������� �۸��ϴ� ����� ���� ����  %>
<%@page  language ="java" contentType =" text/html; charset=utf-8%" pageEncoding ="euc-kr">
<%@include  file = "header.jsp"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix ="c" %>




</body>
</html>