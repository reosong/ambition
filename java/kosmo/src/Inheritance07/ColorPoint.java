package Inheritance07;

public class ColorPoint extends Point{	//point클래스를 상속 받는 자식 
	
	private String color;
	
	public void setColor(String color) {
		this.color = color;
		
	}
	
	public void showColorPoint() {		//color. 좌표를 출력 
		System.out.println(color);
		showPoint();				//부모 클래스에서 상속받는 메소드 호출 
	}
	
	

}
