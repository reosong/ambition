package testtttt.aloneJava;

public class AnonyExample {

	public static void main(String[] args) {
		
		
		Anonymous1 an = new Anonymous1();

		an.field.turnOn();
		
		an.method1();
		
		an.method2(
				new RemotControl() {
					@Override
					public void turnOn() {
						System.out.println("유가 상한가!");
					}
					@Override
					public void turnOff() {
					System.out.println("오늘도 가즈아! ");
					}
				}
				);
		
				












	}

}
