package com.sevlet;

import java.io.*;

import javax.annotation.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/singup")
public class testsevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	System.out.println("doget");
	String m_name = request.getParameter("m_name");
	String m_pass = request.getParameter("m_pass");
	String m_email = request.getParameter("m_email");
	
	System.out.println(m_name);
	System.out.println(m_pass);
	System.out.println(m_email);
	
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("dopost");
		doGet(request,response);
	}
	
	@PostConstruct
	public void funPc() {
		System.out.println("funPc method");
	}
	
	
	@Override
	public void init() throws ServletException {
		System.out.println("init method");
	}
	@Override
	public void destroy() {
		System.out.println("detory method");
	}
	
	@PreDestroy
	public void funPd() {
		System.out.println("@predestroy");
	}

	
}
