package Sampletest.test6;

public class MemberServiceEx {

	
	
	
	
	public boolean login( String name, String password){
		
		if(name.equals("hong") && password.equals("12345") ){
			return true;
		} else return false;
		
	}
	public void logout() {
		System.out.println("로그아웃 되었습니다. ");
	}
	
	
	
	
	
	
	
}
