<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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


    <!--영신사 스토어 헤더  -->
    <header id="header_mu">
            <div id="header_div">
            <a href="main.jsp" class="no_line" style="color: white;">
            <b>YOUNGSINSA STORE</b></a>
            <input type="text" size="23px">
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
                <a href="../hhhh/login.html" class="no_line" style="color: black;"> 
                    로그인</a> 
            </li>
            <li class="sky">바로접속 On</li>
            <li> <a href="../hhhh/menu1.html">알림</a></li>
            <li><a href="../hhhh/menu2.html"> 마이페이지</a></li>
            <li>  <a href="../hhhh/menu3.html"> 최근 본 상품</a></li>
            <li><a href="../hhhh/menu4.html"> 좋아요</a></li>
            <li><a href="../hhhh/menu5.html">장바구니</a></li>
            <li><a href="../hhhh/menu6.html"> 주문배송조회</a></li>
            <li><a href="../hhhh/menu7.html"> 고객센터 </a></li>
            <li><a href="../hhhh/menu8.html">로그아웃</a></li>
            <li class="sky"><a href="../hhhh/menu9.html"> 친구초대 EVENT</a></li>
        </ul>        
    </header>

    <div>
        <ul id="rest">
            <a href="../hhhh/login.html"><li id="rest_li" style="padding:15px 0 0 0;"> 로그인</li></a>
            <a href="../hhhh/menu5.html"><li id="rest_li" style="height: 40px;">장바 <br>구니</li></a>
            <a href="#header_2"><li id="rest_li" style="padding:15px 0 0 0;"> TOP </li></a>
        </ul>

    </div>


    <!-- 왼쪽 목차 -->
    <aside id="aside_a">
        <section>
            <ul class="navbar_menu" style="list-style: none;">
                <a href="./best.html"> 
                <li class="aside_li">인기<span class="aside_small">&nbsp; Best</span></li>
                </a>
                <a href="./top.html"> 
                <li class="aside_li">상의 <span class="aside_small">&nbsp; Top</span></li>
                </a>
                <a href="./outer.html"> 
                <li class="aside_li">아우터<span class="aside_small">&nbsp; Outer</span></li>
                </a>
                <a href="./pants.html"> 
                <li class="aside_li">바지<span class="aside_small">&nbsp; Pants</span></li>
                </a>
                <a href="./onepiece.html"> 
                <li class="aside_li">원피스<span class="aside_small">&nbsp; Onepiece</span></li>
                </a>
                <a href="./skirt.html"> 
                <li class="aside_li">스커트<span class="aside_small">&nbsp; Skirt</span></li>
                </a>
                <a href="./sneakers.html"> 
                <li class="aside_li">스니커즈<span class="aside_small">&nbsp; Sneakers</span></li>
                </a>
                <a href="./shoes.html"> 
                <li class="aside_li">신발<span class="aside_small">&nbsp; Shoes</span></li>
                </a>
                <a href="./bag.html"> 
                <li class="aside_li">가방<span class="aside_small">&nbsp; Bag</span></li>
                </a>
                <li class="aside_li">여성가방<span class="aside_small">&nbsp; Women's bag</span></li>
                <li class="aside_li">선글라스<span class="aside_small">&nbsp; Sunglass</span></li>
                <li class="aside_li">액세서리<span class="aside_small">&nbsp; Accessory</span></li>
                <li class="aside_li">시계<span class="aside_small">&nbsp; Watch</span></li>
                <li class="aside_li">주얼리<span class="aside_small">&nbsp; Jewelry</span></li>
            </ul>
        </section>


        <section id="aside_section_2">
            <ul>
                <li>이미지 삽입</li>
                <li><b>1번 배송 / 교환 / 환불관련</b></li>
                <li><b>2번 결제 / 회원관련</b></li>
                <li style="font-size: 15px; color: lightgrey;">오전 9시~오후 6시 운영</li>
            </ul>


        </section>
    </aside>
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
                    <th class="text_th">  </th>
                </tr>
                <tr>
                    <th class="textarea_th"> <textarea name="dataContent"class="text_big" > </textarea> </th>
                </tr>
            </tbody>
            </table>
        </div>
        <div>
           <input type="submit" value="제출" id="button_gray">
        </div>

    </form>

    </main>