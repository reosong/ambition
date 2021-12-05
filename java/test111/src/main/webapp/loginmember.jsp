<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원가입</title>
    <style>
        body{
            text-align: center;
            background-color: lightgray;
        }
    #div_login{
        margin-left: 30%;
        width: 500px;
      
        height: 1000px;
        background-color: white;
    }
    #div_login2{
        padding-top: 30px;
        padding-bottom: 20px;
        font-size: 30px;
         border-bottom: 1px solid lightgray;
    }
    #div_member{
        height: 40px;
        margin-top: 30px;
        font-size: 20px;
        border-bottom: 1px solid lightgray;
    }
    #div_id{
        width: 500px;
        height: 60px;
        
        text-align: center;
        margin-top: 20px;
    }
    #div_password{
        width: 500px;
        height: 170px;
        
        text-align: center;
        margin-top: 20px;
    }
    #input_id{
        width: 400px;
        height: 50px;
        text-align: center;
        
    }
    #input_password{
        width: 400px;
        height: 50px;
        text-align: center;
        margin-top: 10px;

    }
    .ul_left{
    list-style: none;
    text-align: left;
    }
  
    .li_margin{
        margin-top: 10px;
    }
    #input_email{
        width: 400px;
        height: 50px;
        text-align: center;
        margin-top: 10px;
    }
   

    #input_submit{
        width: 400px;
        height: 50px;
        text-align: center;
        margin-top: 10px;

    }
        a:link{text-decoration: none;color: black;}
        a:visited{text-decoration: none;color: black;}
        a:active{text-decoration: none;color: black;}
        a:hover{text-decoration: none;color: black;}
           
    </style>

</head>


<body>
    <form action="Login" method="post">
    <div id="div_login">
        
        <div id= "div_login2" > <a href="../index.html"> <b>MUSINSA</b> </a> </div>
       
    
        
        <div id="div_id"> 
            <ul class="ul_left">
                <li >아이디</li>
                <li class="li_margin"><input type="text" name="m_name" id="input_id" placeholder="아이디를 입력하세요(5자~11자) "></li>
            </ul>
        </div>
        <br>
        <div id="div_password"> 
            <ul class="ul_left">
                <li> 비밀번호</li>
                <li class="li_margin"><input type="password" name="m_password" id="input_password" placeholder="비밀번호(숫자 영문 특수문자 조합 최소 8자 이상) "></li>
                <li><input type="password" name= "m_passwordok" id="input_password" placeholder="비밀번호 확인 "></li>
            </ul>
        </div>
        <div>
            <ul class="ul_left">
                <li>이메일</li>
                <li><input type="text" name="m_email" placeholder="이메일" id="input_email"></li>
            </ul>
        </div>
        <div>
            <ul class="ul_left">
                <li> <input type="checkbox" name="m_check1"> 개인정보 수집 이용동의(필수) </li>
                <li> <input type="checkbox" name="m_check2"> 무신사, 무신사스토어 이용약관(필수) </li>
                <li> <input type="checkbox" name="m_check3"> 마케팅 활용 및 광고성 정보 수신동의 </li>
                <li> <input type="checkbox" name="m_check4"> 만 14세 미만 가입 제한  </li>
            </ul>
        </div>
      
        <div>
            <input type="submit" id="input_submit" value="회원 가입">
        </div>





    </div>
    </form>
    
</body>
</html>