package Interface08.lab01;

public interface PhoneInterface {

	int TIMEOUT = 10000;	//상수 
	void sendCall();		//추상메소드 	
	void receiveCall();		//추상메소드 
	default void printLogo() {		//default 메소드 :하위 클래스에 상속되어 적용 
		System.out.println("로고를 출력합니다. ");
	}
	
	
	
	
	
	
	
}
