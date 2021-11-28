package Interface08.lab01;

public class SamsungPhone implements PhoneInterface {

	@Override
	public void sendCall() {		//추상메소드 구현 (오버라이딩)
	System.out.println("띠리리리리리리리리리리리리리리");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다. ");
	}

	public void flash() {
		System.out.println("야호");
	}
	
	
	
	
	
	
}
