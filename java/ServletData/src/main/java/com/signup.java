package com;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	request.setCharacterEncoding("utf-8");
	
	response.setContentType("text/html; charset =utf-8");
	
	PrintWriter out = response.getWriter();
	
	String name = request.getParameter("m_name");
	String nickname = request.getParameter("m_nickname");
	
	
	out.print("<p> name :" +name+"</p>");
	out.print("<p> nickname :" +nickname+"</p>");
	
	
	
	
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
