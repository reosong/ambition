package datatype01;

public class ContinueStatement {

	public static void main(String[] args) {
		/*
		 * continue문]
		 * 반복문과 함께 쓰임
		 * 반복문에서 continue문을 만나면 이후의 문장은 수행하지 않고 
		 * for문의 처음으로 돌아가 증감식을 수행
		 */

		//1부터 100까지 홀수합을 구하기(for문)
		int sum=0;
		int num=0;
		for(num=0;num<=100;num++) {
			if(num%2!=0)
			sum+=num;
		}
		System.out.println("1부터 100까지 홀수 합"+sum);
		
		sum=0;
		num=0;
		for(num=0;num<=100;num++) {
			if(num%2==0)
				continue;
			sum+=num;
			
		}
		System.out.println(sum);
		
		//while문(1부터 100까지 짝수합)
		sum=0;
		num=0;
		while (num<=100) {
			if(num%2!=0) 
				continue;
			sum+=num;
			num++;
			
			
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
	}

}
