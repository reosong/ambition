package datatype01;

public class ForStatment {

	public static void main(String[] args) {
	
	/*
	 * for 문] 어떤 명령문을 반복하고할때 사용하는 제어문
	 * 
	 * 형식
	 * for (초기화식;반복조건식; 증감식){
	 * 실행문
	 * }
	 * -초기화식 : 최초 한번 실행
	 * -반복조건식 : 조건식을 만족할 동안 계속 반복
	 * -증감식: 한번 수행 할때 마다 증감
	 * 
	 * -실핼문이 하나일떄 {} 생략가능
	 * 
	 * 1] 초기화식 생략
	 * int i =0;
	 * for(;조건식;증감식){
	 *  실행문}
	 * 2] 조건식 생략
	 * for(초기화;증감식){
	 * 	실행문; break ; //빠져나온다 
	 * }
	 * 3] 증감식 생략
	 * for(초기화;조건식;){
	 * 	실행문; i++; //증감식 실행문 안에서 증가
	 * }
	 * 4] 무한반복(모두생략)
	 * for{
	 * }
	 * 
	 * 
	 * -for 문은 반복횟수가 정해진경우 사용
	 * 반대로 반복횟수를 모를 경우에는while을 사용
	 * 
	 
	 *  		
	 */
		
	int sum= 0;
	for(int i=1; i<=10; i++) {
		sum+= i;
	}
	System.out.println(sum);
	
	// 1부터 10까지 2의 배수의 합
	sum = 0;
	for (int i =0; i<=10; i+= 2) {
		sum += i;
		
	}
	System.out.println(sum);
		
	sum = 0;
	for(int i =0; i <= 10; i ++) {
		if(i%2 ==0) sum += i;
		
	}
		
	System.out.println(sum);
		
	int i = 1;
	for (;i<=10;i++) {}
	System.out.println(i);
	
	
	for(int k =0;k>0;k--) {
		
	}
		
	int k=0;
	sum = 0;
	for (k=1; k<=100;k++) {
		if (k%3==0||k%5==0) sum+=k;
		if (k%3==0 && k%5==0) sum-=k;
		
		
	}
	
	System.out.println(sum);
		
 
	
	sum=0;
	for(k=0; k<=100; k++) {
		if (k%3==0 ^ i%5==0 ) sum+=k;
		
	}
		
	System.out.println(k);
	
	/*
	 * 중첩for문 :for문 안의 for문
	 * 이중 for 문에서 바깥 for문은 행을 의미
	 * 안쪽 for 문은 열을 의
	 */
	
	int j =0,m =0;
	for (j=0; j<2;j++) {
		for (m= 0;m<2;m++) System.out.println("hahah");
		
	}
	
	
	int a=0, b=0;
	for(a=1; a<5;a++) {
		for(b=1;b<5;b++) {
			if(a+b==5) System.out.printf("1");
			else System.out.printf("0");
		}
		System.out.println();
	}
	
	int q=0,w=0;
	for(q=0; q<5; q++) {
		for(w=0; w<5; w++) {
			if(q>=w)System.out.printf("* ");
			else System.out.printf(" ");
		}
	System.out.println();
	}
	
	for(q=0; q<5; q++) {
		for(w=0;w<5;w++) {
			if(q+w>=4)System.out.printf("*");
			else System.out.printf((" "));
		}
		System.out.println();
	}
	
	
	for(q=1;q<10;q++) {
		for(w=2;w<10;w++) {
			sum= q*w;
			System.out.printf("%d * %d =%d ", w, q,sum);
		}
		System.out.println();
			
	}
	
	
	

	}

}
