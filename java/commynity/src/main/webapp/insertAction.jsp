<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="community.User" %>
    <%@ page import ="community.UserDao" %>
    
    <jsp:useBean id = "insert" class ="community.User"/>
     
    <jsp:setProperty property="userid" name="insert"/>
     <jsp:setProperty property="password" name="insert"/>
     
      <jsp:setProperty property="password2" name="insert"/>
       <jsp:setProperty property="username" name="insert"/>
        <jsp:setProperty property="email" name="insert"/>
         <jsp:setProperty property="zipcode1" name="insert"/>
         
          <jsp:setProperty property="zipcode2" name="insert"/>
           <jsp:setProperty property="address1" name="insert"/>
            <jsp:setProperty property="address2" name="insert"/>
             <jsp:setProperty property="phone1" name="insert"/>
              <jsp:setProperty property="phone2" name="insert"/>
     <jsp:setProperty property="phone3" name="insert"/>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<% 
if(insert.getUserid() == null){
	System.out.println("아이디를 입력해주세여 ");	
}else if(insert.getPassword() == null){
	System.out.println("비밀번호를 입력해주세여 ");	
}else if(insert.getPassword2() == null){
	System.out.println("비밀번호확인을  입력해주세여 ");	
}else if(insert.getUsername() == null){
	System.out.println("이름  입력해주세여 ");	
}else if(insert.getEmail() == null){
	System.out.println("이메일  입력해주세여 ");	
}else if(insert.getZipcode1() == null){
	System.out.println("우편번호 입력해주세여 ");	
}else if(insert.getZipcode2() == null){
	System.out.println("우편번호 입력해주세여 ");	
}else if(insert.getAddress1() == null){
	System.out.println("주소 입력해주세여 ");	
}else if(insert.getAddress2() == null){
	System.out.println("나머지 주소  입력해주세여 ");	
}else if(insert.getPhone1() == null){
	System.out.println("핸드폰 입력해주세여 ");	
}else if(insert.getPhone2() == null){
	System.out.println("핸드폰  입력해주세여 ");	
}else if(insert.getPhone3() == null){
	System.out.println("핸드폰  입력해주세여 ");	
}else{
	
	UserDao userDao = new UserDao();
	
	insert.setUserid("userid");
	insert.setPassword("password");
	insert.setUsername("username");
	insert.setEmail("email");
	insert.setZipcode1("zipcode");
	insert.setZipcode2("zipcode2");
	insert.setAddress1("address1");
	insert.setAddress2("address2");
	insert.setPhone1("phone1");
	insert.setPhone2("phone2");
	insert.setPhone3("Phone3");
	
	int result = userDao.insertDB(insert); 
	if(result == 1){
		out.println("<script>");
		out.println("alert('성공')");
		out.println("</script>");
		
	}else{
		out.println("<script>");
		out.println("alert('실패')");
		out.println("</script>");
	}
	
	
	
	
	
	
	
	
	
	
	
}




%>







</body>
</html>