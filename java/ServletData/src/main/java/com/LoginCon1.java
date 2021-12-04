package com;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

//
@WebServlet("/Lo")
public class LoginCon1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter out = response.getWriter();
	String mId = request.getParameter("mId");
	String mPw = request.getParameter("mPw");
	
	out.print("mid :" + mId);
	out.print("mpw :" + mPw);
	
	
	HttpSession session = request.getSession();
	session.setAttribute("memberId", mId);
	
	response.sendRedirect("loginok.jsp");
	
	
	
	}
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
