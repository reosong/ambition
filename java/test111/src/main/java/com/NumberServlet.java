package com;

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/num")
public class NumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter out = response.getWriter();
	
	String count = request.getParameter("m_count");
	String name = request.getParameter("m_name");
	
	
	String driver = "oracle.jdbx.OracleDriver";
	String url ="jdbc:oracle:thin:@localhost:1521:xe";
    String id ="system";
    String pw ="oracle";
	
	Connection con = null;
	Statement stmt = null;
	ResultSet res = null;
	
	
	
	try {
		Class.forName(driver);
		con = DriverManager.getConnection(url,id,pw);
		
		String query = "insert into number values('"+count+","+name+")";
		
		stmt = con.prepareStatement(query);
		
		
		
		
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
		res.close();
		stmt.close();
		con.close();
	}catch(Exception e2) {
		e2.printStackTrace();
	}
	}
	
	
	
	
	
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
