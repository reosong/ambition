package Inheritance07.lab14;

public class InstanceofEample {

	
	
	
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			System.out.println("Child로 변환 성공");
		}else System.out.println("변환 실패 ");
	}
	

	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("child로 변환성공");
	}
	
	
	
	public static void main(String[] arg) {
		
		
		
		Parent parenta = new Child();
		method1(parenta);
		method2(parenta);
		
		Parent parentb= new Parent();
		method1(parentb);
		method2(parentb);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}