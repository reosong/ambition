<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="css/login.css">
</head>
<body>

  <div id="div_login">
        <a href="index.jsp"><div id="div_login2"> <b>T E S L A</b> </div></a>
        <div id="div_member"> 로그인</div>
        <div id="div_id"> 
            <input type="text" id="input_id" placeholder="아이디를 입력하세요 ">
        </div>
        <div id="div_password"> 
            <input type="password" id="input_password" placeholder="비밀번호를 입력하세요 ">
        </div>
        <div id="div_login_button">
            <input type="submit" value="로 그 인"
            id="button_login">

        </div>
        <div style="margin-top: 15px;">
            <a href="member.jsp" style="text-decoration: none; color: white;"> 회원가입 </a>
        </div>
    </div>



</body>
</html>