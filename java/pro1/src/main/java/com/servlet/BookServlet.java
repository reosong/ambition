package com.servlet;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import com.Dto.*;
import com.dao.*;

@WebServlet("/Bs")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out =response.getWriter();
		/*
		String diver = "oracle.jdbx.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
        String id ="system";
        String pw ="oracle";
        
        Connection con = null;
        Statement stmt = null;
        ResultSet res = null;
        */
		
		BookDao bookDao = new BookDao();
		ArrayList<BookDto> list = bookDao.select();
		
		for(int i = 0 ;i< list.size();i++) {
			BookDto dto = list.get(i);
			String name = dto.getName();
			String password = dto.getPassword();
			String email = dto.getEmail();
			
			out.println(name + password +email);
			
		}
        
       
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
