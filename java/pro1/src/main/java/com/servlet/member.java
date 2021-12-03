package com.servlet;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/mSignUp")
public class member extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("doget");
		System.out.println("------------------------");
		
		String name = request.getParameter("m_name");
		String password = request.getParameter("m_password");
		String email = request.getParameter("m_email");
		String[] hobby = request.getParameterValues("m_hobby");
		
		System.out.println(name);
		System.out.println(password);
		System.out.println(email);
		System.out.println(Arrays.toString(hobby));
		
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements()) {
			String namet = (String) names.nextElement();
			System.out.println(namet);
		}
	
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dopost");
		
				doGet(request, response);
	}

}
