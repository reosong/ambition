package Interface08.inter;

public interface PhoneInterface2 {
	//인터페이스에서 상수와 추상메소드 default메소드 만 올 수 있다. 
	//인터페이스 내에서는 접근 제한자가 생략되면 public 이 생략 
	//외부의 사용자들이 내부 시스템에 접근 :public 생략
	
	
	
	
	
	
	

	int timeout =10000;		//인터페이스에서 변수는 public static final  생략되어있어서 상수역활 
	void sandCall();		//인터페이스에서 메소드는 추상 메소드 : public abstract 생략 
	void recieveCall();
	default void printLogo() {		//default 생략 
		System.out.println("로고를 프린트 합니다. ");
	}
	
}
