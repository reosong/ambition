package Interface08.inter;

public interface RemoteControl {
	int MAX_VOLUME =10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 ");
		}else {
			System.out.println("무음 해제 ");
		}
	}

	static void changeBatterry() {
		System.out.println("건전지를 교페합니다. ");
	}
}
