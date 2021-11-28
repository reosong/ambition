package youngsinsa.member;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class Cotroller extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		
		Action action = null;
		ActionForward forward = null;
		
		
		//회원가입 폼
		if (command.equals("/MemberJoinForm.do")) {
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("./member/memberJoinForm.jsp");
			
		}
		else if (command.equals("MemberJion.do")) {
			try {
				action = new MemberJoin();
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		if(forward != null) {
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			}else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
		
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		System.out.println("get");
		doProcess(request,response);
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		System.out.println("post");
		doProcess(request,response);
		
		
	}
	
	
}
