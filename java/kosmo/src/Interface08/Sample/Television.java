package Interface08.Sample;

public class Television implements RemoteControl{

	private int volume;
	
	
	public void turnON() {
		System.out.println("TV를 켭니다. ");
		
	}
	
	public void trunOff() {
		System.out.println("끕니다");
	}
	
	
	
	
	
	public void setVolume(int volume) {
		if (volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume= RemoteControl.MIN_VOLUME;
			
		}else {
			this.volume= volume;
			
		}System.out.println("현재 볼륨 "+ this.volume);
	}
	
	
	public void off() {
		System.out.println("ave");
	}
	
}
