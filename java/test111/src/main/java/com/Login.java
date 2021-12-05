package com;

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("-----------------------------");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("m_name");
		String password = request.getParameter("m_password");
		String passwordok = request.getParameter("m_passwordok");
		String email = request.getParameter("m_email");
	
		
		System.out.println(name);
		System.out.println(password);
		System.out.println(passwordok);
		System.out.println(email);
	
		 String url ="jdbc:oracle:thin:@localhost:1521:xe";
         String id ="system";
         String pw ="oracle";
         String driver = "oracle.jdbc.OracleDriver";
         
         Connection con = null;
         Statement stmt = null;
         PreparedStatement pstmt = null;
         
         
         try {
        	 Class.forName(driver);
        	 con = DriverManager.getConnection(url,id, pw);
        	 stmt = con.createStatement();
        	 
        	 String query = "insert into youngsinsa_member(id,pw,email)"
        	 		+ "values(?,?,?)";
        	 pstmt = con.prepareStatement(query);
        	 pstmt.setString(1, name);
        	 pstmt.setString(2, password);
        	 pstmt.setString(3, email);
        	 
        	 
        	 int result = pstmt.executeUpdate();
        	 if(result ==1) {
        		 out.print("insert ok");
        	 }else {
        		 out.print("insert no");
        	 }
         
         
         
         }catch(Exception e) {
        	 e.printStackTrace();
         }finally {
        	 try {
        		pstmt.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
        	 
         }
		
		
		
		
		
		
		
		response.sendRedirect("http://ambition.dothome.co.kr");
		
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				doGet(request, response);
	}

}
