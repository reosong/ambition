package Interface08.inter;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl re;
		re = new Television();
		re.turnOn();
		re.setVolume(20);
		re.setVolume(6);
		re.turnOff();
		
		
		
		re = new Audio();
		
	
	}

}
