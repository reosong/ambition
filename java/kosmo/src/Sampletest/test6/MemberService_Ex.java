package Sampletest.test6;

public class MemberService_Ex {

	public static void main(String[] args) {
		MemberService service= new MemberService();
		
		boolean result = service.login("hong","12345");
		if(result) {
			System.out.println("로그인 완료 ");
			service.logout("hong");
		} else {
			System.out.println("틀림 ");
		}
		
		
		
		
		
		
		
	}

}
