package testtttt.aloneJava;

public class Anonymous1 {
	RemotControl field =new RemotControl() {
		@Override
		public void turnOn() {
			System.out.println("티비를 켭니다 ");
		}
		public void turnOff() {
			System.out.println("티비를 끕니다. ");
		}
	};
	
	void method1 () {
		RemotControl localVar = new RemotControl() {
			@Override
			public void turnOn() {
				System.out.println("오디오를 끕니다. ");
			}
		@Override
		public void turnOff() {
			System.out.println("오디오를 끕니다. ");
			
		}
		};
		localVar.turnOn();
		
		
	}
	void method2(RemotControl rc) {
		rc.turnOn();
	}

}
