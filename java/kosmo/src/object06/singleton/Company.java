package object06.singleton;

public class Company {	//싱글톤 :클래스에서 단하나의 객체만 생성하도록 구현한 디자인 패턴 
	
	private static Company instance = new Company ();
			//객체 생성을 stack 영역에 저장.
			//싱글톤 객체는 private static 으로 클래스 내부에서 선언, 생성 
	
	private Company() {} 		//기본 생성자를 private 로 선언한다.
								//외부 클래스에서 생성자를 호출 못하도록 설정 
	
	public static Company getinstance() {// 외부에서 객체를 생성할때 , 메소드를 호출해서 
		if(instance ==null ) {			//객체가 생성되도록 설정 
			instance = new Company();	//메소드는 static 키가 설정이 되어 있어야
										//외부에서 객체 생성없이 클래스이름으로 호출 
			
		}
		return instance;
	}
	
	
	
}
