package Basic_class_11.object.cloneEx;

class Point{

	int x ;		//점의 좌표 
	int y;
	public Point(int x, int y ) {
		this.x = x;
		this.y = y;
		
	}
	@Override
	public String toString() {			//객체를 출력할때 toString()메소드가 출력 
		return "x = " + x + ","+ "y = "+ y;
	}




}
class Circle implements Cloneable{		//Circle 클래스는 객체 복제를 허용 
	Point point;
	int radius;
	
	public Circle (int x, int y, int radius) {		//생성자 
		point = new Point(x,y);
	}
	
	@Override
	public String toString() {
		return "원점은 " + point + "이고 반지름은 "+radius+"입니다." ;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	
	
}


public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		

	Circle circle = new Circle(10,20,30);
	Circle copyCircle = (Circle) circle.clone();
	
		
		
		System.out.println(circle);
		System.out.println(copyCircle);
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
