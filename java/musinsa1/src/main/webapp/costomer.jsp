<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="musinsa1.DataDao"%>
    <%@ page import ="musinsa1.Data"%>
    <%@ page import ="java.sql.*" %>
    <%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>영신사 스토어 </title>
    <style>
        a:link{text-decoration: none;color: black;}
        a:visited{text-decoration: none;color: black;}
        a:active{text-decoration: none;color: black;}
        a:hover{text-decoration: none;color: black;}
            
        </style>
<link rel="stylesheet" href="css/product.css">
<link rel="stylesheet" href="css/costomer.css">
</head>
<body>

<%
String userID = null;
if(session.getAttribute("userID")!= null){
	userID = (String) session.getAttribute("userID");
}

%>

<jsp:include page ="h.jsp"/>

<jsp:include page ="side.jsp"/>



	<!-- 메인 -->
    <main>
        <h1 id="title">고객 센터</h1>
      
        <div id="list">
            <table>
            <thead class="table_list">
                <tr>
                    <th class="thead_th"> 번호 </th>
                    <th class="thead_th_big"> 글 제목 </th>
                    <th class="thead_th"> 작성자 </th>
                    <th class="thead_th"> 작성일 </th>
                </tr>
            </thead>


            <tbody>
		     <%
		     DataDao dataDao = new DataDao();
		     ArrayList<Data> list = dataDao.show();
		     for(int i =0; i<list.size();i++){
		    	 
		     %>
                <tr>
                    <th class="tbody_th"> <%= list.get(i).getDataCount() %></th>
                    <th class="tbody_th_big">
                    <form name="member" action="showContent.jsp"><%= list.get(i).getDataTitle() %> </form> 
                    </th>
                    <th class="tbody_th"> <%= list.get(i).getDataID() %> </th>
                    <th class="tbody_th"> <%= list.get(i).getDataDate() %>  </th>
                </tr>
		
			<%} %>
            </tbody>


            </table>
        </div>
        <div>
            <a href="write.jsp"><button id="button_gray">글쓰기</button></a>
        </div>



    </main>