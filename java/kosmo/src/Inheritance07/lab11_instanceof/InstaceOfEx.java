package Inheritance07.lab11_instanceof;


	
	
	class Person{}
	class Student extends Person {}
	class Researcher extends Person{}
	class Professor extends Researcher{}
	
	public class InstaceOfEx {
		
		static void Print (Person p) {
			if(p instanceof Person) {System.out.println("Person ");}
			if(p instanceof Student) {System.out.println("Student ");}
			if(p instanceof Researcher) {System.out.println("Researcher");}
			if(p instanceof Professor ) {System.out.println("Professor");}
		System.out.println();
		}
		
		
	public static void main(String[] args) {
		

		System.out.print("new Student() -> \t "); Print(new Student());
		System.out.print("new Researcher() -> \t "); Print(new Researcher());
		System.out.print("new Professor() -> \t "); Print (new Professor());
		
		
		
		
		
		
	}

}
