package Interface_08.lab04;

public interface Clac {
	double PI = 3.14;
	int ERROR = -9999999;
	
	int add (int num1,int num2);
	int substract (int num1, int num2);
	int times (int num1, int num2);
	int divide (int num1, int num2);
	
	
	//인터페이스에서 구현코드가 있는 메소드 
	//defualt 메소드 상속 0 객체화 시켜서 호출 
	//static 메소드: stack 영역 저장 객체 생성없이 사용
	//private 메소드 클래스 내부에서망 사용 상속 ㄴㄴ 
	//private static 메소드: 클래스 내부에서만 사용, 상속 ㄴㄴ stack 공간에서만 사용
	
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다. ");
	}
	static int total (int[] arr) {		//static 메소드 : 객체 생성없이 사용할수 있는 메소드
		int total =0;
		
		for(int a : arr) {
			total+= a;
		}
		myStaticMethod();
		return total; 
	}
	private void myMethod() {		//java 9.0부터 지원 
		System.out.println("프라이빗 메소드입니다. ");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메소드 입니다. ");
	}
}
