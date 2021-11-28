package testtttt.aloneJava;

public class Tryedet {

	public static void main(String[] args) {
		String[ ] array = {"10", "2a"};
		int a = 0;
		
		
	
		for(int i =0; i<2; i++) {
			try {
				a = Integer.parseInt(array[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 초과 ");
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환 불가 ");
				
			}finally {
				System.out.println(a);
			}
			
			
		}
		
		
	}

}
