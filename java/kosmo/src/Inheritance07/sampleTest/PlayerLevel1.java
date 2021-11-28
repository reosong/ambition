package Inheritance07.sampleTest;

public abstract class PlayerLevel1 {

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevel();
	final public void go1(int count) {
		run();
		for(int i =0; i<count; i++) {
			jump();
		}
		turn();
		}
	
}
