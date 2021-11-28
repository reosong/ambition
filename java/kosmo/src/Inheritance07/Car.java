package Inheritance07;

import Inheritance07.cafe.Tire;

public class Car {

	Tire frontLeftTrie = new Tire("앞 왼쪽 ", 6);
	Tire frontRightTrie = new Tire("앞 오른쪽 ", 2);
	Tire backLeftTire = new Tire("뒤 왼쪽 ", 3);
	Tire backRightTire =new Tire("뒤 오른쪽 ", 4);
	
	
	int run() {
		System.out.println("자동차가 달립니다. ");
		if(frontLeftTrie.roll()==false) {stop(); return 1;}
		if(frontRightTrie.roll()==false ) {stop(); return 2;}
		
		}
	
	
	
	
	
	
	
	
	
	void stop() {
		System.out.println("자동차가 멈춥니다 ");
	}
	
	
}
