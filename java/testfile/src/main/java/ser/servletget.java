package ser;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/servletget")
public class servletget extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 String connectedIP =(String) getServletContext().getAttribute("connectedIP");
	 String connecteduser =(String) getServletContext().getAttribute("connecteduser");
	
	PrintWriter out = response.getWriter();
	out.print("<p>connectedIP :" + connectedIP);
	out.print("<p>connecteduser :" + connecteduser);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
