package Inheritance07.Sample;

public class Bmw extends Car{

	public Bmw(String name, int cc) {
		super(name, cc);
		System.out.println(name+ cc);
	}
	
	
public void start() {
	System.out.println("bmw달립니다 ");
}

	

}
