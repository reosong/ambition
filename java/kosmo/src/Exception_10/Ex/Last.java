package Exception_10.Ex;

import java.util.Scanner;

public class Last {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		
		int a = sc.nextInt();
		int b = sc.nextInt();
		CompleteCalc com =new CompleteCalc();
		
		com.add(a, b);
		
		com.times(a, b);
		com.substract(a, b);
		com.divide(a, b);
		
		
		
		}

	

}
