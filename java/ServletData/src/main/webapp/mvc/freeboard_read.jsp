<%@ page contentType="text/html; charset=EUC-KR" %> 
<%@ page language="java" import="java.sql.*,java.util.*" %> 

<HTML>
<HEAD><TITLE>�� �б�</TITLE>

<link href="filegb.css" rel="stylesheet" type="text/css">
</HEAD>
<BODY>

<%@ include file = "dbconn_mysql.jsp" %>

<%
 String sql=null;
 //Connection con= null;
 PreparedStatement st =null;
 ResultSet rs =null;

 int id = Integer.parseInt(request.getParameter("id"));
 
 try {
  sql = "select * from freeboard where id=? ";
  st = con.prepareStatement(sql);
  st.setInt(1, id);
  rs = st.executeQuery();
 
  if (!(rs.next()))  {
   out.println("�ش� ������ �����ϴ�");
  } else {
   String em=rs.getString("email");
   if ((em != null) && (!(em.equals(""))) ) 
    em = "<A href=mailto:" +em + ">" + rs.getString("name")+"</A>";
   else
    em = rs.getString("name");
   out.println("<table width='600' cellspacing='0' cellpadding='2'>");
   out.println("<tr>");
   out.println("<td height='22'>&nbsp;</td></tr>");
   out.println("<tr align='center'>");
   out.println("<td height='1' bgcolor='#1F4F8F'></td>");
   out.println("</tr>");
   out.println("<tr align='center' bgcolor='#DFEDFF'>");
   out.println("<td class='button' bgcolor='#DFEDFF'>"); 
   out.println("<div align='left'><font size='2'>"+rs.getString("subject") + "</div> </td>");
   out.println("</tr>");
   out.println("<tr align='center' bgcolor='#FFFFFF'>");
   out.println("<td align='center' bgcolor='#F4F4F4'>"); 
   out.println("<table width='100%' border='0' cellpadding='0' cellspacing='4' height='1'>");
   out.println("<tr bgcolor='#F4F4F4'>");
   out.println("<td width='13%' height='7'></td>");
   out.println("<td width='51%' height='7'>�۾��� : "+ em +"</td>");
   out.println("<td width='25%' height='7'></td>");
   out.println("<td width='11%' height='7'></td>");
   out.println("</tr>");
   out.println("<tr bgcolor='#F4F4F4'>");
   out.println("<td width='13%'></td>");
   out.println("<td width='51%'>�ۼ��� : " + rs.getString("inputdate") + "</td>");
   out.println("<td width='25%'>��ȸ : "+(rs.getInt("readcount")+1))+"</td>");
   out.println("<td width='11%'></td>");
   out.println("</tr>");
   out.println("</table>");
   out.println("</td>");
   out.println("</tr>");
   out.println("<tr align='center'>");
   out.println("<td bgcolor='#1F4F8F' height='1'></td>");
   out.println("</tr>");
   out.println("<tr align='center'>");
   out.println("<td style='padding:10 0 0 0'>");
   out.println("<div align='left'><br>");
   out.println("<font size='3' color='#333333'><PRE>"+rs.getString("content") + "</PRE></div>");
   out.println("<br>");
   out.println("</td>");
   out.println("</tr>");
   out.println("<tr align='center'>");
   out.println("<td class='button' height='1'></td>");
   out.println("</tr>");
   out.println("<tr align='center'>");
   out.println("<td bgcolor='#1F4F8F' height='1'></td>");
   out.println("</tr>");
   out.println("</table>");
  %>
  <table width="600" border="0" cellpadding="0" cellspacing="5">
   <tr> 
    <td align="right" width="450"><A href="freeboard_list.jsp?go=<%=request.getParameter("page") %>"> 
     <img src="image/list.jpg" border=0></a></td>
	<td width="70" align="right"><A href="freeboard_rwrite.jsp?id=<%= request.getParameter("id")%>&page=<%=request.getParameter("page")%>"> <img src="image/reply.jpg" border=0></A></td>
	<td width="70" align="right"><A href="freeboard_upd.jsp?id=<%=id%>&page=1"><img src="image/edit.jpg" border=0></A></td>
	<td width="70" align="right"><A href="freeboard_del.jsp?id=<%=id%>&page=1"><img src="image/del.jpg"  border=0></A></td>
   </tr>
  </table>
  <%    
   sql = "update freeboard set readcount= readcount + 1 where id= ?" ;
   st = con.prepareStatement(sql);
   st.setInt(1, id);
   st.executeUpdate();
  }
  rs.close();
  st.close();
  con.close();
 } catch (SQLException e) {
  out.println(e);
 } 
%>
</BODY>
</HTML>