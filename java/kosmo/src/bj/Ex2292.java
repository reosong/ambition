package bj;

import java.util.Scanner;

public class Ex2292 {

	public static void main(String[] args) {
		
		Scanner  scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		
		int sum = 1;
		
		for(int i =0;;i++) {
			if(a==1) {System.out.println(1);}
			if(sum>=a) {
				System.out.println(i);
				break;
			}else {
				sum+=6*i;
			}
		}
		
		
		
		
		
	}

}
