package Inheritance07.Sample;

public class Car {
	public int maxSpeed;
	public String name;
	public String color;
	public int cc;
	
	
	
	
	
	
	public Car(String name, int cc) {
		this.name= name;
		this.cc = cc;
		System.out.println("차종 : "+ name + "배기량 "+ cc);
	};
	
	public void strat() {
		System.out.println("차가 달립니다. ");
	}
	public void stop() {
		System.out.println("차가 멈춥니다. ");
	}
	
	
	
	
	
	
	
	
	

}
