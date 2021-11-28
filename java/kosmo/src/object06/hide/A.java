package object06.hide;


import object06.hide.p.B;		//객체의 전체 이름 : 패키지 명, 객체명 
public class A {
	
	public void a () {
		
		B b= new B();
						//<< 다른 패키지에 존재하는 클래스 : B,C 같은 클래스 안 
		//b.p=10;		//private 접근 제한자는 접근 할수 없음
		//b.m =20; 		//default 접근 제한자는 접근 가능 
		//b.k = 30;		//protected 접근 제한자 접근 가능, 만약 상속관계에 있다면 접근가능 
		b.n =40 ;		//public 접근 가능 
		
		
	}
	
}
