package Inheritance07.lab14;

public class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("야옹 ");
		
	}
	public Cat() {
		this.kind = "포유류 ";
		
	}

}
