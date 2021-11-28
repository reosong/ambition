package bj.Array;

import java.util.Scanner;

public class Ex2577 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	
		//int a = scanner.nextInt();
	//	int b = scanner.nextInt();
	//	int c = scanner.nextInt();
	//	int array[] =new int[10];
		
	//	scanner.close();
	//	int sum = a* b* c;
		
	//	while(sum>0) {
	//		array[sum%10]
	//	}
		
		
		
		
		int array[]= {100000000,10000000,1000000,100000,10000,1000,100,10,1};
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		int sum = a* b* c;
		int newArray[] = new int[10];
		
		
		for(int i =0; i<array.length;i++) {
			newArray[i] = sum/array[i];
			sum-=newArray[i]*array[i];
		}
	
		for(int i =0; i<newArray.length;i++) {
			int count = 0;
			for(int n =0; n<9;n++) {
				if(i+1 == newArray[n]) {
					count++;
				}
			}System.out.println(count);
		}
	
			
			
			
		

	}

}
