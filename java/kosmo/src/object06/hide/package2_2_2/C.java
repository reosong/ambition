package object06.hide.package2_2_2;

import object06.hide.package1_1_1.A;

public class C {
	
	
	
	public C() {
		A a =new A();
		a.field1 =1;
		a.field2 =1;		// 디폴트 필드 접근 불가 
		a.field3 =1;		//프라이빗 필드 접근 불가 
		
		
		a.method1();
		a.method2();		//디폴트 메소드 접근 불가 
		a.method3();		// 프라이빗 메소드 접근 불가 
		
	}

}
