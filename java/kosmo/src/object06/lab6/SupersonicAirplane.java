package object06.lab6;

public class SupersonicAirplane extends Airplane{

	public static final int NORMAL = 1;			//stack 영역에 저장되는 상수 
	public  static final int SUPERSONIC = 2;//stack 영역에 저장되는 상수
	
	public int flyMode = NORMAL;
	
	public void fly() {//어노테이션 override: 메소드 재정의 할 때 오류를 방지하기 위해서 사용 
						//매소드 재의의 {오버라이딩}: 부모클래스의 데이터 타입 매개변수 개수 순서 
		if(flyMode ==SUPERSONIC) {
			System.out.println("초음속 비행합니다. ");
		}else {// AirPlane 객체의 fly() 메소드 호출 
			super.fly();
		}
	}
	
	
	
	
	
}
