package testtttt.alone3;

public class TestString {

	public static void main(String[] args) {
		String s1 = "Hollo";
		String s2 = "world";
		
		StringConcat sc = (s,v) -> System.out.println(s+","+v);
		sc.makeString(s1, s2);
		
		
		
		
		
		StringConcat sc2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+", "+s2);
				
			}
			
		};
		
		sc.makeString("make","love");
		
		
		
	}
	
	
	
	
	

}
