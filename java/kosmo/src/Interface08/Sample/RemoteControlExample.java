package Interface08.Sample;

public class RemoteControlExample {

	public static void main(String[] args) {
		

		RemoteControl rc;
		rc= new Television();
	

		rc.setMute(true);
		rc.setVolume(15);
		
		
		
		Television t = (Television) rc;
		
		t.off();
		
		
		
		
		
		
		
	}

}
