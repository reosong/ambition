package Sampletest;

import java.util.Scanner;

public class Erqtr {
public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	int H = scanner.nextInt();
	int M = scanner.nextInt();
	scanner.close();
	
	if(M>=45) {
		M=M-45;
	}else {
		H-=1;
		M= (M+60)-45;
	}
	
	if(H<0)
		H+=24;
	
	
	System.out.printf("%d %d",H,M);
	}


}
