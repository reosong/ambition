package Inheritance07.abstract_temple;

public class AICAr extends Car{

	@Override
	public void drive() {
		System.out.println("자율주행을 합니다. ");	
		System.out.println("차가 스소로 방향을 전환 ");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다. ");		
	}
	
	
	
	
	
	

}
