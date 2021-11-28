package bj.Array;

import java.util.Scanner;

public class Ex1546 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		int array[]= new int[count];
		double newArray[]= new double [count];
		int max = 0;
		double sum = 0;
		
		for(int i =0; i<array.length;i++) {
			array[i]= scanner.nextInt();
			max= max>array[i]?max:array[i];
		}
		
		
		for(int i =0; i<newArray.length;i++) {
			newArray[i]=(double)array[i]/(double)max*100;
			sum+= newArray[i];
		}
		
		
		
		System.out.println((double)sum/newArray.length);
		
		
		
		
		
		
		
		
		
	}

}
