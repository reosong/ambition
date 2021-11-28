package datatype01;

import java.io.IOException;

public class whilemoon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 *while 문
		 *반복의 수가 정해져 있지 않을때 주로사용
		 *
		 *형식 ]
		 *[초기식;]
		 *while (반복조건식){
		 *수행문;
		 *[증감식;]
		 *}
		 *
		 *
		 *-조건식은 비교식 내지 논리식이여야한다
		 -조건식은 참일동안 반복 실행
		 -초기식은 반드시 초기화해야한다
		 
		 */
		//1부터 10까지 누적합
		
		int i =1;
		int sum=0;
		while(i<=10) {
			sum+=i;
			i++;
			}
		
		System.out.println(sum);
		System.out.println(i);
		
		
		
		int i1 =1;
		int sum1=0;
		while(i1<=1000) {
			if(i1%3==0||i1%5==0&&i1%15!=0)
			sum1+= i1;
			i1++;
		}
		/*System.out.println("총합은:"+sum1);
		System.out.println("문자열을 입력하세요 ");
		char word;
		//사용자가 몇 자를 적을지 모름으로 while문 사용 
		while((word=(char)System.in.read()) !=13) {
			System.out.println(word);
		}//while 
		*/
		System.out.println();
		
		int a=1;
		
		while (a<5) {
			int b=1;
			while(b<5){
				if (a==b) System.out.printf("1");
				else System.out.printf("0");
			b++;} 
			System.out.println();
			a++;
		}
		
		
		
		int c = 1;
		while(c<6) {
			int b =1;
			while(b<6) {
				if(c>=b)System.out.printf("*");
				else System.out.printf("");
				b++;
				
			}
			c++;
			System.out.println();
		}
		
		
		System.out.println();
		
		
		int o= 1;
		while(o<6) {
			int b= 1;
			while(b<6) {
				if(b>=o)System.out.printf("*");
				else System.out.printf(" ");
				b++;
			}
			System.out.println();
			o++;
		}
		
		
		int t= 1;
		while (t<10) {
			int b= 2;
			while(b<10) {System.out.printf("%d * %d =%d ",b,t,t*b);
			b++;}
			t++;
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
