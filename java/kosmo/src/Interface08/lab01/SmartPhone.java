package Interface08.lab01;

public class SmartPhone extends PDA implements MobliePhoneInterface,MP3Interface{
	//다중상속을허용하지 않는다(자식은 하나의 부모클래스만 가짐)
	//인터페이스는 다중상속을 허용한다. 
	
	@Override
	public void sendCall() {
	System.out.println("따르릉 따르릉 ");		
	}

	@Override
	public void receiveCall() {
	System.out.println("전화왔워");		
	}

	@Override
	public void play() {
		System.out.println("음악을 연주합니다. ");		
	}

	@Override
	public void stop() {
		System.out.println("음악을 중단합니다. ");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자를 보냅니다");
		
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자를 보냅니다. ");		
	}
	
	public void schedule() {
		System.out.println("일정 관리 합니다. ");
		
	}
	
	

}
