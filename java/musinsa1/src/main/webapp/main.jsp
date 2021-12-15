<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import ="java.io.PrintWriter" %>
    
<script type="text/javascript"> 
    var mobileKeyWords = new Array('iPhone', 'iPod', 'BlackBerry', 'Android', 'Windows CE', 'LG', 'MOT', 'SAMSUNG', 'SonyEricsson'); 
    for (var word in mobileKeyWords){ if (navigator.userAgent.match(mobileKeyWords[word]) != null)
    { location.href = "http://ambition.dothome.co.kr/hhhh/mmusinsa.html"; break; } } </script>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name ="viewport" content ="width=device-width", initial-scale = "1">
    <title>영신사 스토어 </title>
    
    
    
    
<style>
a:link{text-decoration: none;color: black;}
a:visited{text-decoration: none;color: black;}
a:active{text-decoration: none;color: black;}
a:hover{text-decoration: none;color: black;}
    
</style>
<script src="./toto.js"></script>

<link rel="stylesheet" href="css/musinsa.css">



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







    
<!-- 메인-->
    <main>

        <!--섹션 1-->
        <section id="section_1" class="isection_1" >
            <h1 style="padding-top: 10px;"> &nbsp; 랭킹</h1>
            <div class="hidden_text">
            <aside id="section_aside" class="hidden_text">
                <h3><b>상품</b></h3>
                <ul>
                    <li>전체</li>
                    <li>아우터</li>
                    <li>원피스</li>
                    <li>가방</li>
                    <li>신발</li>
                    <li>모자</li>
                    <li>양말</li>
                    <li>안경</li>
                    <li>악세서리</li>
                    <li>디지털테크</li>
                    <li>책/음악</li>
                </ul>
                <ul>
                    <li>상의</li>
                    <li>바지</li>
                    <li>스커트</li>
                    <li>스니커즈</li>
                    <li>시계</li>
                    <li>스포츠</li>
                    <li>속옷</li>
                    <li>주얼리</li>
                    <li>뷰티</li>
                    <li>반려동물</li>
                </ul>


            </aside>
            </div>

            <!--섹션1의 섹션 1시작 -->
            <section id="section1_1 msection1_1">
                <ul style="display: inline-block;" class="msection1_1_ul">
                    <li>
                        <ul class="msection1_1_ul">
                        <li>
                            <a href="hhhh/bluejean.html">
                            <img src="images/mu8.jpeg" class="image_size_nomal">
                            </a>
                        </li>
                        <li class="text_center"><b>생 로 랑</b></li>
                        <li class="text_center">멋쟁이 청바지</li?>
                        <li class="text_center">259,000원</li>
                        </ul>
                        <ul class="msection1_1_ul">
                            <li>
                                <a href="hhhh/kakhi.html">
                                <img src="images/mu4.jpg" class="image_size_nomal">
                                </a>
                            </li>
                            <li class="text_center"><b>라퍼지 스토어</b></li>
                            <li class="text_center">군인핏 야상</li>
                            <li class="text_center">99,000원</li>
                        </ul>

                    </li>
                </ul>
                <ul style="display: inline-block;" class="msection1_1_ul">
                    <li>
                        <ul class="msection1_1_ul">
                        <li><a href="./hhhh/product2.html">
                            <img src="images/suare.jpeg" class="image_size_nomal">
                            </a>
                        </li>
                        <li class="text_center"><b>수 아 레</b></li>
                        <li class="text_center">니트</li?>
                        <li class="text_center">39,000원</li>
                        </ul>
                        <ul class="msection1_1_ul">
                            <li><a href="./hhhh/product3.html">
                                <img src="images/mu3.jpg" class="image_size_nomal">
                            </a></li>
                            <li class="text_center"><b>제로</b></li>
                            <li class="text_center">개편해 츄리닝</li>
                            <li class="text_center">39,900원</li>
                        </ul>

                    </li>
                </ul>
                
                <ul style="display: inline-block; list-style: none;" class="msection1_1_ul_2">
                    <div class="msection1_1_ul_hi">
                    <li>
                        <ul class="msection1_1_ul">
                        <li><a href="./hhhh/product4.html">
                            <img src="images/brown.jpeg" class="image_size_nomal">
                            </a>
                        </li>
                        <li class="text_center"><b>브라운 브레쓰</b></li>
                        <li class="text_center">완멋 후드티</li?>
                        <li class="text_center">39,900원</li>
                        </ul>
                        <ul class="msection1_1_ul">
                            <li><a href="./hhhh/product5.html">
                                <img src="images/mu7.jpeg" class="image_size_nomal">
                            </a></li>
                            <li class="text_center"><b>무신사 스탠다드</b></li>
                            <li class="text_center">바지</li>
                            <li class="text_center">20000원</li>
                        </ul>

                    </li>
                </div>
                </ul>
                </div>
               

            </section>



            



       
        <div class="clear"></div>



    </section>









    <!--섹션 2-->

    <section class="section_2">
        <aside id="section_aside">
            <h3><b>스타일</b></h3>
            <ul>
                <li>브랜드 스냅</li>
                <li>코디숍</li>
                <li>스페셜</li>
                
            </ul>
          


        </aside>

        <!--섹션2의 섹션 1시작 -->
        <section id="section1_1">
            
            <ul style="display: inline-block;">
                <li>
                    <ul>
                    <li><a href="./hhhh/style001.html">
                        <img src="images/style001_small.jpeg" class= "image_size_long">
                    </a></li>
                    <li class="text_center"><b>코디</b></li>
                    <li class="text_center">오야니</li>
                    <li class="text_center">김혜린</li>
                    <li class="text_center">21.11.19 </li>
                    </ul>
                   

                </li>
            </ul>
            <ul style="display: inline-block;">
                <li>
                    <ul>
                    <li><a href="./hhhh/style002.html">
                        <img src="images/style002_small.jpeg" class="image_size_long">
                    </a></li>
                    <li class="text_center"><b>코디</b></li>
                    <li class="text_center">미드나잇 무브</li>
                    <li class="text_center">휘영</li>
                    <li class="text_center">21.11.22</li>
                    </ul>
                   

                </li>
            </ul>
            <ul style="display: inline-block;">
                <li>
                    <ul>
                    <li><a href="./hhhh/style003.html">
                        <img src="images/style003_samll.jpeg" class="image_size_long">
                    </a></li>
                    <li class="text_center"><b>코디</b></li>
                    <li class="text_center">어널로이드</li>
                    <li class="text_center">허재경</li>
                    <li class="text_center">21.11.20</li>
                    </ul>
                  

                </li>
            </ul>
            <ul style="display: inline-block;">
                <li>
                    <ul>
                    <li> <a href="./hhhh/style004.html">
                        <img src="images/style004_small.jpeg" class="image_size_long">
                    </a></li>
                    <li class="text_center"><b>코디</b></li>
                    <li class="text_center">로르인</li>
                    <li class="text_center">김경은</li>
                    <li class="text_center">21.11.20</li>
                    </ul>
                  

                </li>
            </ul>
           
           

        </section>



        



   
    <div class="clear"></div>



</section>


<!--섹션 3-->
<section class="section_3">
    <aside id="section_aside">
        <h3><b>스페셜</b></h3>
        <ul>
            <li>쇼 케이스</li>
            <li>스페셜이슈</li>
            <li>단독 상품</li>
            
        </ul>
      


    </aside>

    <section id="section1_1">
            
        <ul style="display: inline-block; float: left; margin-top: 10px;">
            <li>
                <ul>
                <li><img src="images/lmc.jpeg" class= "image_size_big"></li>
                <li class="text_left" >엘엠씨</li>
                <li class="text_left" ><b>엘엠씨 X 스카페이스</b></li>
                <li class="text_left" 
                style="font-size: 10px; color: lightgray; ">
                    엘엠씨와 80년대 범죄 누아르 영화를 대표하는 스카페이스와의 만남</li>
                <li class="text_left" style="color: rgb(7, 115, 204); ">경품 10명증정 </li>
                </ul>
               

            </li>
        </ul>
      
            
            <ul style="display: inline-block; float: left; margin-top: 10px; margin-left: 20px;">
                <li>
                    <ul>
                        <li><img src="images/samsung.jpeg" class="image_size_big"></li>
                        <li class="text_left" >삼성전자</li>
                        <li class="text_left" ><b>삼성전자 X 우영미 에디션</b></li>
                        <li class="text_left" 
                        style="font-size: 10px; color: lightgray; ">
                            디자이너 우영미가 직접 참여한 WOOYOUNGMI 에디션</li>
                        <li class="text_left" style="color: rgb(7, 115, 204); "> 적립금 5명 증정 </li>
                        </ul>
                   

                </li>
            </ul>





</section>









    </main>

<div id="clear"></div>




</body>
</html>