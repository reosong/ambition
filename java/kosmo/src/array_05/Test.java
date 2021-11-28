package array_05;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//배열 방의 수를 입력 받아 배열의 크기를 생성하고 
		//각 방에 정수를 넣어서 입력하고 각 방의 내용을 향상된 for문으로 출력 
		//평균출력 
		
		Scanner scanner =new Scanner(System.in);
		int size=0;
		double avg= 0;	
		
		int sum= 0;
		
		
		System.out.println("방의 크기를 적어주세요 ");
		size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("정수를 입력해주세요 "+size +"개 ");
		for(int i=0; i<array.length;i++) {
			array[i]= scanner.nextInt();
		}
		System.out.println("입력된 내용 : ");
		for(int a : array) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		for(int i=0; i< array.length; i++) {
			sum+= array[i];
		}
		
		System.out.println("평균은 :"+ (double)sum/array.length);

	}

}
