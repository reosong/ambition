package doit.array;

import java.util.ArrayList;

public class DogTest {

	public static void main(String[] args) {
		

		ArrayList<Dog> array = new ArrayList<Dog>();
		
		
		Dog dog1 = new Dog();
		
		dog1.setName("레오");
		dog1.setType("말티푸");
		array.add(dog1);
		
		
		Dog dog2 = new Dog();
		dog2.setName("땅콩");
		dog2.setType("시츄");
		array.add(dog2);
		
		Dog dog3 = new Dog();
		dog3.setName("봉춘");
		dog3.setType("미니핀");
		array.add(dog3);
		
		Dog dog4 = new Dog();
		dog4.setName("두부");
		dog4.setType("진도개");
		array.add(dog4);
		
		
		for(Dog a :array ) {
			System.out.println(a.getName()+" "+ a.getType());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
