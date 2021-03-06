package youngsinsa.member;

import java.io.*;

public class MemberJoin implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("MemberJoin");
		
		//out객체에서 사용할타입
		response.setContentType("text/html;chaeset=utf-8");
		
		//out객체 생성
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		
		MemberDAO manager = MemberDAO.getInstance();
		
		int result = manager.idCheck(id);
		
		
		if(result !=0) {
			out.println("<script>");
			out.println("alert('동일한 아이디가 있습니다.);");
			out.println("history.go(-1)");
			out.println("<script>");
			out.close();
			
		}else {
			MemberDTO member = new MemberDTO();
			member.setId(id);
			member.setPassword(request.getParameter("password"));
			member.setEmail(request.getParameter("email"));
			manager.memberJoin(member);
		}
		
		ActionForward forward = new ActionForward();
		
		forward.setRedirect(true);
		forward.setPath("./LoginForm.do");
		
		return forward;
		
		
	}
	
	
	
	 

}
