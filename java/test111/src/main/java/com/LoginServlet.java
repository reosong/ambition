package com;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import com.Dao.*;
import com.Dto.*;



@WebServlet("/Bs")
public class LoginServlet extends HttpServlet {
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
		
		LoginDao bookDao = new LoginDao();
		ArrayList<LoginDto> list = bookDao.select();
		
		for(int i = 0 ;i< list.size();i++) {
			LoginDto dto = list.get(i);
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

