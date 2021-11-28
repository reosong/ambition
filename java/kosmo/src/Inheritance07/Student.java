package Inheritance07;

public class Student extends Person {

	public void set() {
		age =30;			//default 
		name = "홍길동 ";		//pubilc 
		height = 175;		// protected
//		weight = 99;		// private 접근  제한자임으로 오류 setter를 사용 
		
		setWeight (99);		//setter 통해서 값 할당 
		
	}
	
	
	
	
	
	
}
