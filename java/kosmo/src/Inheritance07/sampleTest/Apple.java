package Inheritance07.sampleTest;

public class Apple extends Fruit{
	
	

	public Apple (String name, String color, String size) {
		super(name,color,size);
	};
	
	
	@Override
	public void showInfo() {
		System.out.println("과일의 이름 색깔 크기 :" +name+ " "+color + " "+size );
	}

}
