package datatype01;

public class DoWhileStatment {

	public static void main(String[] args) {
		
		
		
		/*
		 * do -while
		 * 
		 * 형식]
		 * [초기식;]
		 * do{
		 *  수행문1;
		 *  [증감식;]
		 *  
		 *  }	while (조건식);
		 *  
		 *  
		 *  -조건식은 비교식 내지 논리식이여야한다
		 *  -무조건 한번은 수행한다. 그외는 while문과 동일하다
		 *  -초기식은 반드시 초기화해야한
		 */
		
		int i=1;
		int sum=0;
		do {
			sum+=i;
			i++;
		}while(i<=10);
		System.out.println(sum);
		System.out.println("do while문이 끝난후 i "+ i);
		
		int a =1;
		
		do {
		int b= 1;
			do {
			if(a==b)System.out.printf("1");
			else System.out.printf("0");
			b++;
			}while(b<5);
			a++;
			System.out.println();
		}while(a<5);
		
		
		
		int c= 1;
		do {
			int d =1;
			
			do {
			
			if(c>=d)System.out.printf("*");
			else System.out.printf("");
			d++;
			}while(d<6);
			
			c++;
			System.out.println();
		}while(c<6);
		
		
		int e=2;
		do {
			int d=1;
			do {
			System.out.printf("%d * %d = %d ",e,d,e*d);
			d++;
			}while(d<10);
			System.out.println();
			e++;
		
		}while(e<10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
