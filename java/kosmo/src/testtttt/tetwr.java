package testtttt;

import java.util.Scanner;

public class tetwr {
	public static void main(String[] args) {
	
	
	
	
	Scanner sc = new Scanner(System.in);
	
	
	
	int a[]= new int[9];
	int sum =0;
	System.out.println("정수 10개를 입력 하세요 ");
	for(int i=0; i<=a.length; i++) {
		a[i]= (int)(Math.random()*10+1);
	}
	
	for(int b=0;b<10;b++) {
		sum+=a[b];
	}
	
	
	}
}
