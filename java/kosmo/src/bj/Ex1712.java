package bj;
import java.util.Scanner; 

public class Ex1712 {
	

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a , b, c;
		
	
	
		a= scanner.nextInt();
		b = scanner.nextInt();
		c= scanner.nextInt();
		
		
		if(b>=c) {
				System.out.println(-1);
			
			}
		else {System.out.println(a/(c-b)+1);
		
		
		}
		
	}

}
