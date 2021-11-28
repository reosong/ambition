package testtttt.alone4;

class Point{
	int x ;
	int y;
	
	
	
	Point(int x , int y){
		this.x= x;
		this.y =y;
		
	}
	public String toString() {
		return x+ " "+ y;
	}
}
class Circle implements Cloneable{
	Point point;
	int radius;
	Circle(int x, int y, int radius){
		this.radius =radius;
		point = new Point(x,y);
	}
	public String toString() {
		return point+" "+ radius;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}





public class ObjectCloneTestt {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle ci = new Circle(10,20,30);
		Circle co = (Circle)ci.clone();
		
		System.out.println(ci);
		System.out.println(co);
		System.out.println(System.identityHashCode(ci));
		System.out.println(System.identityHashCode(co));
	}

}
