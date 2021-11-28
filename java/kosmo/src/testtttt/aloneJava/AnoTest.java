package testtttt.aloneJava;

public class AnoTest {

	public static void main(String[] args) {
		
		Ano ano = new Ano();
		ano.field.run();
		ano.method1();
		ano.method2(new Vehicle() {
				@Override
				public void run() {
					System.out.println("트럭이 달립니다.");
				}
				
				
				
		}

		);
		
		
		
	}

}
