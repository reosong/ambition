package bj.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex8958 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int caseCount = scanner.nextInt();
		
		String array[] = new String[10];
		int ar[] = new int[caseCount];
		
		int count =0;
		int sum = 0;
		
		for(int i = 0; i<caseCount; i++) {
			array= scanner.next().split("");
			
			if(array[i]=="O") {
				count++;
				for(int j =1; j<10;j++)
				if(array[i]==array[j]) {
					sum= sum+1;
					
				}else break;
			}
			System.out.println(sum+count);
		}
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
