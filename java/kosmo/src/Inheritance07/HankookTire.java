package Inheritance07;

import Inheritance07.cafe.Tire;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+ "타이어 수명 ");
			return true;
		}
		else {
			System.out.println("펑크 ");
			return false;
			
		}
	}
		
	
	
	

	

}
