package bj.Array;

import java.util.Scanner;

public class Ex3052 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[10];
		int count=10;
		
		for(int i = 0; i<array.length;i++) {
			array[i] = scanner.nextInt()%42;
		}
		
		
		for(int i =0; i<9; i++) {
			for(int j = i+1; j<10;j++) {
				if(array[i]==array[j]) {
					count--;
					break;
				}
			}
		}
		System.out.println(count);
		
		
		
		
		
		
		
		
	}

}
