package object06.hide.p;

public class C {
	

	public void c () {
		B b= new B();
					//<< 같은 패키지에 존재하는 클래스 : B,C 같은 클래스 안 
		//b.p=10;		//private 접근 제한자는 접근 할수 없음
		b.m =20; 	//default 접근 제한자는 접근 가능 
		b.k = 30;	//protected 접근 제한자 접근 가능
		b.n =40 ;	// public 접근 가능 
		
		
	}
}
