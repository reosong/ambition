<%@ page contentType="text/html; charset=EUC-KR" %> 
<%@ page language="java" import="java.sql.*,java.util.*" %> 
<% request.setCharacterEncoding("euc-kr"); %>
<HTML>
<HEAD><TITLE>게시판(검색모드)</TITLE>
</HEAD>
<BODY>
<%@ include file = "dbconn_mysql.jsp" %>
<P>
<P align=center>
 <FONT color=#0000ff face=굴림 size=3>
 <STRONG>자유 게시판(검색모드)</STRONG>
 </FONT>
</P> 
<FORM method=post name=search action="freeboard_search.jsp">
 <TABLE border=0 width=95%>
  <TR>
   <TD align=left width=30% valign=bottom>
    [<A href="freeboard_list.jsp">자유 게시판(일반모드)</A>]</TD>
   <TD align=right width=70% valign=bottom>
    <FONT size=2 face=굴림>
     <SELECT name=stype >
<% 
 String cond = null;
 int what = 1;
 String val=null;  
 if (request.getParameter("stype") != null) {
  what = Integer.parseInt(request.getParameter("stype"));
  val= request.getParameter("sval");
  if (what==1) {
   out.println("<OPTION value=1 selected>이름");
   cond = " where name like '%"+ val+ "%'";
  } else  
   out.println("<OPTION value=1 >이름");
  if (what==2) {
   out.println("<OPTION value=2 selected>제목");
   cond = " where subject like '%"+ val+ "%'";
  } else  
   out.println("<OPTION value=2>제목");
  if (what==3) { 
   out.println("<OPTION value=3 selected>내용");
   cond = " where content  like '%"+ val+ "%'";
  } else  
   out.println("<OPTION value=3>내용");
  if (what==4) {
   out.println("<OPTION value=4 selected>이름/제목");
   cond = " where name  like '%"+ val + "%'";
   cond = cond + " or  subject  like '%"+ val+ "%'";
  } else  
   out.println("<OPTION value=4>이름/제목");
  if (what==5) {
   out.println("<OPTION value=5 selected>이름/내용");
   cond = " where name  like '%"+ val + "%'";
   cond = cond + " or  content  like '%"+ val+ "%'";
  } else  
   out.println("<OPTION value=5>이름/내용");
  if (what==6) {
   out.println("<OPTION value=6 selected>제목/내용");
   cond = " where subject  like '%"+ val + "%'";
   cond = cond + " or  content  like '%"+ val+ "%'";
  } else  
   out.println("<OPTION value=6>제목/내용");
  if (what==7) {
   out.println("<OPTION value=7 selected>이름/제목/내용");
   cond = " where name  like '%"+ val + "%'";
   cond = cond + " or  subject  like '%"+ val+ "%'";
   cond = cond + " or  content  like '%"+ val+ "%'";
  } else  
   out.println("<OPTION value=7>이름/제목/내용");
  if (val.trim().equals(""))
   cond = "";
 }
%>
     </SELECT>
	</FONT>
    <INPUT type=text name="sval" value="<%=request.getParameter("sval")%>">
    <INPUT type=submit value="검색">
   </TD>
  </TR>
 </TABLE>
</FORM>
<CENTER>
<TABLE border=0 width=600 cellpadding=4 cellspacing=0>
 <tr align="center"> 
  <td colspan="5" height="1" bgcolor="#1F4F8F"></td>
 </tr>
 <tr align="center" bgcolor="#87E8FF"> 
  <td width="42" bgcolor="#DFEDFF"><font size="2">번호</font></td>
  <td width="340" bgcolor="#DFEDFF"><font size="2">제목</font></td>
  <td width="84" bgcolor="#DFEDFF"><font size="2">등록자</font></td>
  <td width="78" bgcolor="#DFEDFF"><font size="2">날짜</font></td>
  <td width="49" bgcolor="#DFEDFF"><font size="2">조회</font></td>
 </tr>
 <tr align="center"> 
  <td colspan="5" bgcolor="#1F4F8F" height="1"></td>
 </tr>

<% 
 Vector name=new Vector();
 Vector inputdate=new Vector();
 Vector email=new Vector();
 Vector subject=new Vector();
 Vector rcount=new Vector();
 Vector keyid=new Vector();
 Vector step=new Vector();
 
 int where=1;

 int totalgroup=0;
 int maxpages=2;
 int startpage=1;
 int endpage=startpage+maxpages-1;
 int wheregroup=1;
 
 if (request.getParameter("go") != null) {
  where = Integer.parseInt(request.getParameter("go"));
  wheregroup = (where-1)/maxpages + 1;
  startpage=(wheregroup-1) * maxpages+1;  
  endpage=startpage+maxpages-1; 
 } else if (request.getParameter("gogroup") != null) {
  wheregroup = Integer.parseInt(request.getParameter("gogroup"));
  startpage=(wheregroup-1) * maxpages+1;  
  where = startpage ; 
  endpage=startpage+maxpages-1; 
 }
 int nextgroup=wheregroup+1;
 int priorgroup= wheregroup-1;
 
 int nextpage=where+1;
 int priorpage = where-1;
 int startrow=0;
 int endrow=0;
 int maxrows=5;
 int totalrows=0;
 int totalpages=0;
 
 int id=0;
 
 String em=null;
 //Connection con= null;
 Statement st =null;
 ResultSet rs =null;
 

 try {
  st = con.createStatement();
  String sql = "select * from freeboard " + cond;
  sql = sql + " order by id desc" ;
  rs = st.executeQuery(sql);
  if (!(rs.next()))  {
   out.println("해당하는 글이 없습니다");
  } else {
   do {
    keyid.addElement(new Integer(rs.getInt("id")));
    name.addElement(rs.getString("name"));
    email.addElement(rs.getString("email"));
    String idate = rs.getString("inputdate");
    idate = idate.substring(0,8);
    inputdate.addElement(idate);
    subject.addElement(rs.getString("subject"));
    rcount.addElement(new Integer(rs.getInt("readcount")));
    step.addElement(new Integer(rs.getInt("step")));
   }while(rs.next());
   totalrows = name.size();
   totalpages = (totalrows-1)/maxrows +1;
   startrow = (where-1) * maxrows;
   endrow = startrow+maxrows-1  ;
   if (endrow >= totalrows)
    endrow=totalrows-1;
   
   totalgroup = (totalpages-1)/maxpages +1;
   if (endpage > totalpages) 
    endpage=totalpages;

   for(int j=startrow;j<=endrow;j++) {
    String temp=(String)(email.elementAt(j));
    if ((temp == null) || (temp.equals("")) ) 
     em= (String)name.elementAt(j); 
    else
     em = "<A href=mailto:" + temp + ">" + name.elementAt(j) + "</A>";
    id= totalrows-j;
    if(j%2 == 0){
     out.println("<TR bgcolor='#FFFFFF' onMouseOver=\" bgColor='#DFEDFF'\" onMouseOut=\"bgColor=''\">");	
    } else {
     out.println("<TR bgcolor='#F4F4F4' onMouseOver=\" bgColor='#DFEDFF'\" onMouseOut=\"bgColor='#F4F4F4'\">");
    } 
    out.println("<TD align=center>");
    out.println(id+"</TD>");
    out.println("<TD>");
    int stepi= ((Integer)step.elementAt(j)).intValue();
    if (stepi > 0 ) {
     for(int count=0; count < stepi; count++)
      out.print("&nbsp;&nbsp;");
    }
    String clink = "<A href=freeboard_read.jsp?id=" + keyid.elementAt(j) ;
    clink = clink + "&page=" + where + ">" + subject.elementAt(j) + "</A>";
    out.println(clink + "</TD>");
    out.println("<TD align=center>");
    out.println(em+ "</TD>");
    out.println("<TD align=center>");
    out.println(inputdate.elementAt(j)+ "</TD>");
    out.println("<TD align=center>");
    out.println(rcount.elementAt(j)+ "</TD>");
    out.println("</TR>"); 

   }
   rs.close();
  }
  out.println("</TABLE>");
  st.close();
  con.close();
 } catch (java.sql.SQLException e) {
  out.println(e);
 } 
 if (wheregroup > 1) {
  out.print("[<A href=freeboard_search.jsp?gogroup=1"); 
  out.print("&stype="+ what+"&sval=" + val +">처음</A>]");
  out.print("[<A href=freeboard_search.jsp?gogroup="+priorgroup);
  out.print("&stype="+ what+"&sval=" + val +">이전</A>]");
 } else {
  out.println("[처음]") ;
  out.println("[이전]") ;
 }
 if (name.size() !=0) {
  for(int jj=startpage; jj<=endpage; jj++) {
   if (jj==where) 
    out.println("["+jj+"]") ;
   else {
   out.print("[<A href=freeboard_search.jsp?go="+jj);
   out.print("&stype="+ what+"&sval=" + val +">" + jj + "</A>]") ;
   }
  }
 }
 if (wheregroup < totalgroup) {
  out.print("[<A href=freeboard_search.jsp?gogroup="+ nextgroup);
  out.print("&stype="+ what+"&sval=" + val +">다음</A>]");
  out.print("[<A href=freeboard_search.jsp?gogroup="+totalgroup); 
  out.print("&stype="+ what+"&sval=" + val +">마지막</A>]");
 } else {
  out.println("[다음]");
  out.println("[마지막]");
 }
 out.println ("검색된 글 수 :"+totalrows);
%>
</BODY>
</HTML>