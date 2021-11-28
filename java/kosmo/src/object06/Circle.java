package object06;

public class Circle {       //클래스 내부에는 필드(맴버 변수), 메소드, 생성자,

	
	int radius;       //정수형 변수(필드) [기본타입의 자료형:8]
				// 원의 반지름 
	
	String name;      // 문자열 변수(필드) [참조 자료형(객체형 자료형) :대문자로 시작]
	 			//원의 이름 
	
	public Circle() {}  //기본 생성자 : 클래스 이름과 동일한 이름을 가진 메소드(함수) 
						// -인풋 매개변수와 실행부가 없은 생성자를 기본 생성자라한다.
						// -기본 생성자는 생략이 가능 
						// -생성자는 리턴을 돌려주지 않는다.
						//           -생성자 이름 앞에는 void(리턴이 없는 경우)
						//           -자료형이 명시(리턴이 있는경우 )
	
	public double getArea() {           //메소드(함수) 
		return 3.14 * radius * radius;
	}
	
	
	public static void main(String[] args) {
		Circle pizza ;              //객체형 자료형식 , pizza : 참조변수 
		pizza = new Circle();		//new : 생성자 호출, 메모리의 힙 영역에 객체생성 
		
		pizza.radius =10;           //pizza.radius : 피자 객체의 맴버 변수에 접근 
		pizza.name = "자바 피자 ";
		
		double area = pizza.getArea();
		
		System.out.println(pizza.name + "의 면적은 " +area);
		
		Circle donut = new Circle();
		donut.radius =2;
		donut.name = "자바 도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);

		
		
		
		
	}

}
