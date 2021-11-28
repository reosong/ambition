package SuperPosition09.alone;

public class Outter {

	public void method1(final int arg) {
	
	int localVariable =1;
	
	class Inner{
		void method() {
			int result = arg+ localVariable;
			
		}
	}
}
} 