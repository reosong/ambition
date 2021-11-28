package Interface08.lab01;

public class InterfaceEx {

	public static void main(String[] args) {

		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	
	//인터페이스는 객체를 생성할수 없다. 
	//PhoneInterface ph = new PhoneInterface();
	
	PhoneInterface ph = new SamsungPhone();
	ph.printLogo();
	ph.sendCall();
	ph.receiveCall();
	
	SamsungPhone ss = (SamsungPhone) ph;
	
	ss.flash();
	
	
	
	
	}

}
