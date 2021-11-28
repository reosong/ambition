package Sampletest.test6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		
		
		if(H==0) {
			 if(M<45) {
				 M = (M-45)+60;
				 H = H+23;
				}
			 else if(M>=45) {
				 M = (M-45);
			
				 
			 }
		}
		
		else {
			if(M>=45) {
				M= M-45;
				
			}else if(M<45) {
				H= H-1;
				M= M+60-45;
			}
		}
		
		System.out.printf("%d %d",H,M);
		
		

		
	}

}
