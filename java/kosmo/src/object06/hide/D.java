package object06.hide;

import object06.hide.p.B;

public class D extends B{

	public void d() {
		
		B b= new B();
		
						//<< 다른 패키지에 존재하는 클래스 : A 
		//b.p=10;		//private 접근 제한자는 접근 할수 없음
		//b.m =20; 		//default 접근 제한자는 접근 가능 
		//????????????????b.k = 30;		//protected 접근 제한자 접근 가능, 만약 상속관계에 있다면 접근가능 
		b.n =40 ;		//public 접근 가능 

	}
}
