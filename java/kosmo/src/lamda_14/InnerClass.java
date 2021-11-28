package lamda_14;

import lamda_14.OutClass.InClass;

class OutClass{
	private int num= 10;
	private static int sNum= 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
		
	
	
	class InClass{
		int inNum =100;
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
			System.out.println(inNum);
			
		}
		public void usingClass() {
			inClass.inTest();
		}
		
		
	}
	static class InStaticClass{
		int inNum= 100;
		static int sInNum = 200;
		
		public void inTest() {
			num+=10;
		}
		
		
	}
	
	
}

public class InnerClass {
	public static void main (String[] arg) {
	
	
		OutClass outc = new OutClass();
		OutClass.InClass inc =  outc.new InClass();
		
		
		inc.usingClass();
		outc.u
		
		
	}

}
