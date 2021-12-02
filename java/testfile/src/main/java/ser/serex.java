 package ser;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/serex")
public class serex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 String adminId	=getServletConfig().getInitParameter("adminId");
	 String adminPw	=getServletConfig().getInitParameter("adminPw");
	 
	 PrintWriter out = response.getWriter();
	 out.print("<p>amindId" +adminId +"</p>");
	 out.print("<p>amindPw" +adminPw +"</p>");
	 
	 String imgDir =getServletContext().getInitParameter("imgDir");
	 String testServerIP =getServletContext().getInitParameter("testServerIP")	;
	 
	 out.print("<p>imgDir" +imgDir +"</p>");
	 out.print("<p>testServerIP" +testServerIP +"</p>");
	 
	 getServletContext().setAttribute("connectedIP", testServerIP);
	 getServletContext().setAttribute("connecteduser", "song");
	 
	 
	 
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
