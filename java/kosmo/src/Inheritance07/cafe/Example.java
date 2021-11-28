package Inheritance07.cafe;

class Parent{
	String a;
	void b() {System.out.println("b");};
	void c() {System.out.println("c");};
	
}
class Child extends Parent{
	String aa;
	void c() {System.out.println("cc");}
	void d() {System.out.println("d");}
}



public class Example {

	public static void main(String[] arg) {
		
		Parent parent = new Child();
		parent.a ="abc";
		parent.b();
		parent.c();
		
		Child child = (Child) parent;
		child.c();
		child.d();
		child.a = "dkek";
		
		
		
		
		
	}
}
