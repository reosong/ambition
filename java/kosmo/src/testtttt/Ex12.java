package testtttt;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
	
		
		int arr[]= new int[10];
		System.out.println("정수 10개를 입력하세요 ");
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i =0; i<arr.length; i++) {
			arr[i]=scanner.nextInt();
			}

		System.out.print("3의 배수는 :");
		for(int i =0; i< arr.length; i++) {
			if(arr[i]%3 ==0) {
				System.out.print(arr[i]+ " ");
			}
		}
		
		
		
		
	}

}
