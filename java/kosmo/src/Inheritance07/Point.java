package Inheritance07;

public class Point  {// (x,y) 의 한점을 표현하는 point 클래스와 리를 상속받아
					//색을 가진 점을 표현하는 colorpoint 클래스. 
	
	private int x,y ;		//한 점을 지칭하는 점의 좌표값 

	public void set(int x, int y ) {	//메소드로 좌표값변수에 적용함 
		this.x = x;
		this.y = y;
		
	}
	public void showPoint () {
		System.out.println("("+ x+ ","+ y+")");
	}
	
	
	
	
	

}
