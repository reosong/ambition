package Inheritance07.lab11_instanceof;
class Animal{}
class Human extends Animal{}
class Tiger extends Animal{}
class Lion extends Animal{}
class Eagle extends Animal{}
class HumanChild extends Human{}
class HumanChildSon extends HumanChild{}
//각각의 객



public class InstanceOfEx02 {
	
	static void Print (Animal a) {
		if(a instanceof Animal) {System.out.println("Animal");}
		if(a instanceof Human) {System.out.println("Human");}
		if(a instanceof Tiger ) {System.out.println("Tiger");}
		if(a instanceof Lion) {System.out.println("Lion");}
		if(a instanceof Eagle) {System.out.println("Eagle");}
		if(a instanceof HumanChild) {System.out.println("HumaChild");}
		if(a instanceof HumanChildSon) {System.out.println("HumanChildSon");}
		}

	public static void main(String[] args) {
		
System.out.print("Animal ="); Print(new Animal());
System.out.println("==========================");
System.out.print("Human = "); Print(new Human());
System.out.println("==========================");
System.out.print("Tiger = "); Print(new Tiger());
System.out.println("==========================");
System.out.print("Lion = "); Print(new Lion());
System.out.println("==========================");
System.out.print("Eagle ="); Print(new Eagle());
System.out.println("==========================");
System.out.print("HumanChild = "); Print(new HumanChild());
System.out.println("==========================");
System.out.print("HumanChildSon = ");Print(new HumanChildSon());
	
		
		
		
		
		
		
		
		
		

	}

}
