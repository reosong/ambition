package Inheritance07.lab10;

import object06.lab6.SupersonicAirplane;

public class AnimalTest1 {
	
	public void moveAnimal(Animal animal) {		//업캐스팅 
		animal.move();
	}//static이 있으면 클래스이름으로 메소드 바로 호출가능 
	
	public static void moveMove (Animal animal) {
		animal.move();
	}
	
			public static void main(String[] arg) {
				
				
		
			
	
			AnimalTest1 animal1 = new AnimalTest1();
			animal1.moveAnimal(new Human());
		
			Tiger tiger = new Tiger();
			animal1.moveAnimal(tiger);
			
			
			
			Eagle eagle = new Eagle ();
			
				AnimalTest1.moveMove(tiger);
				AnimalTest1.moveMove(eagle);
				
				
				
				
				
				
				
				
			}
	
	
	
	
	
	
}
