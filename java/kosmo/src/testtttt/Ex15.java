package testtttt;

public class Ex15 {

	public static void main(String[] args) {
		

		for(int i =1; i<100; i++) {
		
			int b= i%10;
			int a = i/10;
			
			if (i<10) {
				if (i%3==0) System.out.println(i + "짝 ");
			}
			else 
			{
				if((a%3==0) ) {
				System.out.println(i + "");
			}else if ((a%3==0)&&(b%3==0))
				System.out.println(i+ "짝 짝");
		
			else if ((b%3==0))
				System.out.println(i+ " 짝 ");
		
		
		
		
		
		
			}
		}	
		

	}

}
