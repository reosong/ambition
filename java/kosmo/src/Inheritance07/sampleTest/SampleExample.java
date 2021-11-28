package Inheritance07.sampleTest;

import java.util.ArrayList;

public class SampleExample {

	public static void main(String[] args) {
		

		Fruit apple = new Apple( "사과", "빨강" , "작음" );
		Fruit orange = new Orange("오랜지 ", "주황 ", "큼");
		Fruit banana = new Banana("바나나", "노랑", "중간");
		
		ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
		
		Fruit[] fruit = { apple, orange, banana};
		
		for(Fruit fruit1 : fruit ) {
			fruit1.showInfo();
		}
		

		Orange f = (Orange) orange;
		Apple a = (Apple) apple;
	
		f.sale();
		
		for(int i =0; i<fruitList.size(); i++) {
			Fruit fr = fruitList.get(i);
			if( fr instanceof Apple) {
				Apple ap = (Apple) fr;
			}if (fr instanceof Orange) {
				Orange or = (Orange) fr;
				or.sale();
			}if( fr instanceof Banana) {
				Banana ba = (Banana) fr;
			ba.ba();
			}
		}
		
		
	}

}
