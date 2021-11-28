package Inheritance07.sampleTest;

public class Banana extends Fruit {
	public Banana (String name, String color, String size) {
		super(name,color,size);
	};
	
	
	@Override
	public void showInfo() {
		System.out.println("과일의 이름, 색깔, 크기 :" +name+ " "+color + " "+size );
	}
public void ba() {
	System.out.println("바나나는 맛있다. ");
}
}
