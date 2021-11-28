package Inheritance07.sampleTest;

import Inheritance07.AutoCar;
import Inheritance07.Bus1;

public class CarTest {

	public static void main(String[] args) {
		
		Bus1 bus =new Bus1();
		AutoCar autoCar = new AutoCar();
		
		bus.run();
		autoCar.run();
		
		bus.refuel();
		autoCar.refuel();
		
		bus.takePassenger();
		autoCar.load();
		
		


	}

}
