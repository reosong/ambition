package com.servlet;

import java.io.*;

import javax.annotation.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/Ts")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				response.getWriter().append("Served at: ").append(request.getContextPath());
			System.out.println("doget");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doGet(request, response);
	}

	@PostConstruct
	public void fn() {
		System.out.println("@post");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("init method");
	}
	
	
	@Override
	public void destroy() {
		System.out.println("destroy");
	}
	
	
	
	
	
	
	
}
