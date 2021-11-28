package bj.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4344 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int c = scanner.nextInt();
		int sum= 0;
		int count= 0;
		for(int i =0; i< c; i++) {
			int a = scanner.nextInt();
			int[] array= new int [a];
			count+=a;
				for(int j=0; j<a; j++) {
				array[j]=scanner.nextInt();
				sum+= array[j];	
				}al.addAll(array);
				
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
