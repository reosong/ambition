<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import ="musinsa1.Data"%>
    <%@page import ="musinsa1.DataDao" %>
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

<jsp:include page ="h.jsp"/>

<jsp:include page ="side.jsp"/>



<%
int dataCount = 0;
if(request.getParameter("dataCount") != null){
	dataCount = Integer.parseInt(request.getParameter("dataCount"));
}
if(dataCount  == 0){
	
	out.println("<script>");
	out.println("alert(dataCount)");
	out.println("location.href='costomer.jsp'");
	out.println("</script");
}

Data data = new DataDao().getData(dataCount);

%>
  
    <main>
        <h1 id="title">고객 센터</h1>
      	<form action="writeAction.jsp" method ="post">
        <div id="list">
            <table>
            <thead class="table_list">
                <tr>
                    <th class="thead_th_long">글 보기 </th>
                </tr>
            </thead>


            <tbody>
                
                
                <tr>
                    <th class="text_th"><%=data.getDataTitle() %></th>
                </tr>
                 <tr>
                    <th class="text_th">작성자 : <%= data.getDataID() %></th>
                </tr>
                <tr>
                    <th class="textarea_th"> 
                    <textarea name="dataContent"class="text_big" >
                    <%= data.getDataContent() %>
                     </textarea> </th>
                </tr>
            </tbody>
            </table>
        </div>
        <div>
           <input type="submit" value="제출" id="button_gray">
        </div>

    </form>

    </main>