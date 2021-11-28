package Inheritance07.abstract_temple;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("======자율주행자동차========");
		Car myCar = new AICAr();
		myCar.run();
		
		System.out.println("========일반 자동차============");
		
		Car yourCar = new ManualCar();
		yourCar.run();
		
		
		
		
		
		
		
		
		
		
		
	}

}
