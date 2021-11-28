package lamda_14;
class Outer2{
	
	Runnable gerRunnable (int i ) {
		int num =100;
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}
			
			
		};
		
	}
	Runnable runner = new Runnable() {
		@Override 
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수 ");
		}
	};
	
	
	
	
	
	
	
	
}

public class AnonymousTest {

	public static void main(String[] args) {
		
		
		Outer2 out = new Outer2();
		
		Runnable runnable = out.gerRunnable(10);
		
		runnable.run();
		
		out.runner.run();
		
		
		
		
		
	}

}
