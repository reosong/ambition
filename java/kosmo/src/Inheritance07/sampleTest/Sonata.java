package Inheritance07.sampleTest;

public class Sonata extends CarTest1{

	@Override
	public void start() {
		System.out.println("소나타 ");
		
	}

	@Override
	public void drive() {
		System.out.println("소나타1 ");
		
	}

	@Override
	public void stop() {	System.out.println("소나타2 ");
		
	}

	@Override
	public void turnOff() {
		System.out.println("소나타3 ");
		
	}
	

}
