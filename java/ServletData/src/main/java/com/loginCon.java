package com;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/loginCon")
public class loginCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter out =response.getWriter();
	
	String mId =request.getParameter("mID");
	String mPw = request.getParameter("mPW");
	
	out.print("<p> mid : " + mId + "</p>");
	out.print("<p> mpw : " + mPw + "</p>");
	
	
	Cookie[] cookies = request.getCookies();
	Cookie cookie = null;
	
	
	for(Cookie c : cookies) {
		System.out.println(c.getName());
		System.out.println(c.getValue());
		
		if(c.getName().equals("memberId")) {
			cookie = c;
		}
		
	}
	if(cookie== null) {
		System.out.println("cookie is null");
		cookie = new Cookie("memberId",mId);
	}
	response.addCookie(cookie);
	cookie.setMaxAge(60*60);
	
	response.sendRedirect("loginok.jsp");
	 
	
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
