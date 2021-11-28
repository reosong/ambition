package Inheritance07.sampleTest;

public class Orange extends Fruit {
	public Orange (String name, String color, String size) {
		super(name,color,size);
	};
	
	
	@Override
	public void showInfo() {
		System.out.println("과일의 이름 색깔 크기 :" +name+ " "+color + " "+size );
	}
	
	
	public void sale() {
		System.out.println("오렌지 팝니다. ");
	}


}
