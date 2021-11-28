package Inheritance07.abstract_gamelevel;

public class BeginerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다. ");
		
	}

	@Override
	public void jump() {
		System.out.println("jump를 할줄 모릅니다. ");		
	}

	@Override
	public void turn() {
		System.out.println("turn 도 할줄 모릅니다. ");
	}

	@Override
	public void showLevelMassage() {
		System.out.println("=========초보자 레벨입니다. ==========");
		
	}
	
	
	

}
