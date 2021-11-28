package Interface08.inter;

public interface PhoneInterface {
//인터페이스 : 클라이언트가 회사내부의 서버 서비스를 사용할수 있는 접점
//인터페이스 내에상수, 추상메소드 ,변수는 올수 없다. 객체를 생성할 수 없다. 
	
	public static final int timeout =10000;
	public abstract void sandCall();
	public abstract void recieveCall();
	public default void printLogo() {
		System.out.println("로고를 프린트 합니다. ");
	}
	
	
	
	
	
	
	
	
	
	
}
