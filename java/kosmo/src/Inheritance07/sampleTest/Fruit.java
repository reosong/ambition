package Inheritance07.sampleTest;

public class Fruit {

	
	String name;
	String color;
	String size;
	
	public Fruit(String name, String color, String size) {
		this.name= name;
		this.color= color;
		this.size= size;
		
	}
	
	public void showInfo() {
		System.out.println(name+ color+ size );
		
	}
	
	
	
}
