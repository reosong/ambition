package testtttt;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		
		
	Scanner scanner = new Scanner(System.in);
	
	int array[]= {1000000,100000,10000,1000,100,10,1};
	
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int c = scanner.nextInt();
	int newArray[] =new int[] {};
	
	int sum = a* b* c;
	System.out.println(sum);
	for ( int i = 0 ; i< array.length;i++) {
		int count = 0;
		for(int n =0;;n++) {
		if(sum>=0) {
		sum -=array[i];
		count++;
		}
		else break;
		}newArray[i]= count;
	}

		
for(int i =0; i<newArray.length;i++) {
	System.out.println(newArray[i]);
}
		
		
		
		
		
		
		
		}
	}

