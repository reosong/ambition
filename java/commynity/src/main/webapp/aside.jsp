<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>클래식기타 커뮤니티</title>
<link rel="stylesheet" type="text/css" href="css/common.css">
<link rel="stylesheet" type="text/css" href="css/header.css">
<link rel="stylesheet" type="text/css" href="css/footer.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>

<aside>

<form action= "asideAction.jsp" method ="post" scope ="page">
  <article id="login_box">
    <img id="login_title" src="img/ttl_login.png">
    <div id="input_button">
    <ul id="login_input">
      <li><input type="text"></li>
      <li><input type="password"></li>
    </ul>
    <input type="submit" id="login_btn" src="img/btn_login.gif" value="로그인">
    </div> 
    <div class="clear"></div>
    <div id="join_search">
     <a href="insert.jsp"> <img src="img/btn_join.gif"></a>
     <a href=""> <img src="img/btn_search.gif"></a>
    </div>
  </article>
  <article id="guestbook">
    <div id="guestbook_title">
      <img src="img/ttl_memo.gif">
    </div>
    <ul>
      <li>안녕하세요!</li>
      <li>안녕하세요!</li>
      <li>안녕하세요!</li>
      <li>안녕하세요!</li>
    </ul>
  </article>
  </form>
</aside>

</body>
</html>