package com;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/servletEx")
public class servletEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String adminId =  getServletConfig().getInitParameter("adminId");
		String adminPw =  getServletConfig().getInitParameter("adminPw");
		
		PrintWriter out = response.getWriter();
		
		out.print(adminId );
		out.print( adminPw );
		
		getServletContext().setAttribute("connectedIP", "123.0.0.0");
		
		
		
		
		}
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doGet(request, response);
	}

}
