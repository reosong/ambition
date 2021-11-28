package Inheritance07;

public class AutoCar extends Car1{

	@Override
	public void run() {
		System.out.println("차가 달립니다. ");		
	}
	public void load() {
		System.out.println("짐을 싣습니다. ");
	}

}
