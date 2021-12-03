package com.servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


//@WebServlet("/se")
public class servletEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public servletEx() {
        super();
            }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				response.getWriter().append("Served at: ").append(request.getContextPath());
				PrintWriter out = response.getWriter();
				
				out.print("<p> hello servlet</p>");
				
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doGet(request, response);
	}

}
