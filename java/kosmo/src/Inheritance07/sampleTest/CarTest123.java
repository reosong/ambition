package Inheritance07.sampleTest;

import java.util.ArrayList;

public class CarTest123 {

	public static void main(String[] args) {
		ArrayList<CarTest1> array = new ArrayList<CarTest1>();
		array.add(new Sonata());
		array.add(new Grandeur());
		
		
		for(CarTest1 a : array) {
			a.run();
		}
		
		
		
		
		
		
		
	}

}
