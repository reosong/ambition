package Inheritance07.abstract_temple;

public abstract class Car {
	
	public abstract void drive();
	
	

	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다. ");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
		
	}
	
	
	final public void run() {//템플릿 메소드 : 하위 클래스에서 오버라이드 할수 없다. 
		startCar();
		drive();
		stop();
		turnOff();
	}
	
	

}
