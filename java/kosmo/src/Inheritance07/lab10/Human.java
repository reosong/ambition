package Inheritance07.lab10;

public class Human extends Animal  {

	@Override 
	public void move() {
		System.out.println("사람은 달립니다. ");
		
	}
	public void readBook() {
		System.out.println(super.a);
		
		System.out.println("사람은책을 읽습니다. ");
	}
	
	
	
	
	
}
