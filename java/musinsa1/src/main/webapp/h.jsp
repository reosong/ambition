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
String userID = null;
if(session.getAttribute("userID")!= null){
	userID = (String) session.getAttribute("userID");
}

%>
   
 <!--영신사 스토어 헤더  -->
    <header id="header_mu">
            <div id="header_div">
            <a href="./index.html" class="no_line" style="color: white;">
            <b>YOUNGSINSA STORE</b></a>
            <input type="text" size="23px" class="hidden_text2">
            </div>
            <div id="header_div2">
                <ul>
                    <li style="color: blue;">주말특가</li>
                    <li style="color: purple;">아우터</li>
                    <li style="color: red;">#SELF_LOVE</li>
                    <li>랭킹</li>
                    <li>업데이트</li>
                    <li>코디</li>
                    <li>세일</li>
                    <li>스페셜</li>
                    <li>이벤트</li>
                    <li>브랜드</li>
                </ul>
            </div>
            <div class="clear"></div>
    </header>

    
    <div>
        <ul id="rest">
            <a href="./hhhh/login.html"><li id="rest_li" style="padding:15px 0 0 0;"> 로그인</li></a>
            <a href="./hhhh/menu5.html"><li id="rest_li" style="height: 40px;">장바 <br>구니</li></a>
            <a href="#header_2"><li id="rest_li" style="padding:15px 0 0 0;"> TOP </li></a>
        </ul>

    </div>

    <!--스탠다드 쪽 헤더 -->
    <header id="header_2">
        <ul>
            <li>스탠다드</li>
            <li>테라스샵</li>
            <li>셀렉트</li>
        </ul>

    </header>
    <!--개인정보 헤더 -->
    <header id="header_3">
        <ul>
            <li>
              <%
        if(userID != null){
        %> 
        	<a href="login.jsp" class="no_line" style="color: black;"> 
                    <%=userID %> 님</a> 
        <% 
        }else{
        %>	
        
      	 <a href="login.jsp" class="no_line" style="color: black;"> 
                    로그인</a>
         <%} %>
                
            </li>
            <li class="sky">바로접속 On</li>
            <li> <a href="./hhhh/menu1.html">알림</a></li>
            <li><a href="./hhhh/menu2.html"> 마이페이지</a></li>
            <li>  <a href="./hhhh/menu3.html"> 최근 본 상품</a></li>
            <li><a href="./hhhh/menu4.html"> 좋아요</a></li>
            <li><a href="./hhhh/menu5.html">장바구니</a></li>
            <li><a href="./hhhh/menu6.html"> 주문배송조회</a></li>
            <li><a href="costomer.jsp"> 고객센터 </a></li>
            <li><a href="logout.jsp">로그아웃</a></li>
            <li class="sky"><a href="./hhhh/menu9.html"> 친구초대 EVENT</a></li>
        </ul>        
    </header>



</body>
</html>