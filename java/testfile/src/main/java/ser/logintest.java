package ser;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;



@WebServlet("/loginCon")
public class logintest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	
	String mid = request.getParameter("mid");
	String mpass = request.getParameter("mpass");
	
	out.print("mid : "+ mid);
	out.print("mpassword :"+mpass);
	
	Cookie[] cookies = request.getCookies();
	Cookie cookie = null;
	for(Cookie c : cookies) {
		System.out.println(c.getName()+ c.getValue());
		if(c.getName().equals("memberId")) {
			cookie = c;
		}
	}
	if(cookie == null ) {
		System.out.println("cookie is null");
		cookie = new Cookie("memberId",mid);
	}
	response.addCookie(cookie);
	cookie.setMaxAge(60*60);
	
	response.sendRedirect("loginok.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
