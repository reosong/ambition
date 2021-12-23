<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body bgcolor="#FFFFFF" oncontextmenu="return false" onselectstart="return false" ondragstart="return false">
<TABLE align=center cellpadding=8 cellspacing=0 width='650' topmargin="0" leftmargin="0" rightmargin="0" marginheight="0" marginwidth="0" >
<TR>
<TD width="650">






<form name="join" method="post" action="insertAction.jsp">
<table width="650" height="536" border="1" cellspacing="0" cellpadding="0" bordercolor="#A3C2F6">
 <tr> 
  <td width="15%" align="right"><font color="#FF0000" size=1>★</font><font class="style1">아이디&nbsp;&nbsp;</font></td>
  <td width="75%">&nbsp;
   <input type="text" name="userid" size="16" maxlength="16" class="input_style1">
   <input type="button" value="중복확인" onClick="MM_openBrWindow('userid_check.jsp','userid_check','width=330,height=200')">
   <font class="style2">(영문+숫자 5~16자리) <font color="#0099FF">중복 확인 절차를 거쳐야 합니다.</font></font></td>
 </tr>
 <tr> 
  <td width="15%" align="right" ><font color="#FF0000" size=1>★</font><font class="style1">비밀번호&nbsp;&nbsp;</font></td>
  <td width="75%">&nbsp; 
   <input type="password" name="password" size="12" maxlength="12" class="input_style1">
   <font class="style1">다시한번&nbsp;&nbsp; </font>
   <input type="password" name="password2" size="12" maxlength="12" class="input_style1">
   <font class="style2">(영문+숫자 4~12자리)</font></td>
 </tr>          
 <tr> 
  <td width="15%" align="right"><font color="#FF0000" size=1>★</font><font class="style1">이름&nbsp;&nbsp;</font></td>
  <td width="75%">&nbsp;<input type="text" name="username" size="10" maxlength="10" class="input_style1"> </td>
 </tr>

 <tr > 
  <td width="15%" align="right"><font color="#FF0000" size=1>★</font><font class="style1">EMAIL&nbsp;&nbsp;</font></td>
  <td width="75%">&nbsp;<input type="text" name="email" size="20" maxlength="50" class="input_style1"></td>
 </tr>
 <tr > 
  <td width="15%" align="right"><font color="#FF0000" size=1>★</font><font class="style1">우편번호&nbsp;&nbsp;</font></td>
  <td width="75%">&nbsp; 
   <input type="text" name="zipcode1" size="3" maxlength="3" class="input_style1" > - 
   <input type="text" name="zipcode2" size="3" maxlength="3" class="input_style1" >
   <input name="button" type="button" onClick="MM_openBrWindow('zipcode_search.jsp','zipcodesearch','scrollbars=yes,width=500,height=250')" value="우편번호 검색">
   <font class="style2"><font color="#0099FF">우편번호 검색 버튼을 누르세요.</font></font></td>
 </tr>
 <tr> 
  <td width="15%" align="right"><font color="#FF0000" size=1>★</font><font class="style1">주소&nbsp;&nbsp;</font></td>
  <td width="75%">&nbsp;<input type="text" name="address1" size="50" maxlength="100" class="input_style1" ></td>
 </tr>
 <tr> 
  <td width="15%" align="right"><font color="#FF0000" size=1>★</font><font class="style1">나머지 주소&nbsp;&nbsp;</font></td>
  <td width="75%">&nbsp;
   <input type="text" name="address2" size="50" maxlength="100" class="input_style1">
   <font class="style2"><font color="#0099FF">나머지 주소를 적어 넣습니다.</font></font></td>
 </tr>
 <tr > 
  <td width="15%" align="right"><font class="style1">핸드폰&nbsp;&nbsp;</font></td>
  <td width="75%">&nbsp; 
   <select name="phone1">
    <option value="010">010</option>                
    <option value="011">011</option>
    <option value="016">016</option>
    <option value="017">017</option>
    <option value="018">018</option>
    <option value="019">019</option>
   </select> - 
   <input type="text" name="phone2" size="4" maxlength="4" class="input_style1">  - 
   <input type="text" name="phone3" size="4" maxlength="4" class="input_style1"></td>
 </tr>
</table>
<br>
<table width="614" border="0" cellspacing="0" cellpadding="0" align="center" >
 <tr>
  <td width=100% align="center"> 
   <input type="hidden" name="userid_check">
   <input type="submit" value="등   록"  onClick="doSubmit()">&nbsp;
   <input type="reset" value="다시쓰기" >&nbsp;
   <input type="button" value="취   소"  onClick="javascript:history.go(-1);">
  </td>
 </tr>
</table>
</form>
</TD></TR></TABLE>
<div align="center">

<table width="638" border="0" cellpadding="0" cellspacing="0">
 <tr> 
  <td bgcolor="#FFFFFF" width="638" nowrap><p align="center"><br>Copyright by JSP Study</p></td>
 </tr>
</table>
</div>
<p>&nbsp;</p>
</body>
</html>