package Inheritance07.Sample;


class A {
	   public A() { System.out.println("Avv"); }
	   public A(int x) { System.out.println("A: " + x); }
}
	class B extends A {
	   public B() { super(100); }
	   public B(int x) { System.out.println("B: " + x); }
	}
	   
public class Tesla {
	public static void main(String[ ]arg) {
	
	
		      B b = new B(11);
		   }
		}
	
	
	


