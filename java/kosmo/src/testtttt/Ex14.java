package testtttt;

public class Ex14 {

	public static void main(String[] args) {
	
		
		int arr[] = new int[10];
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			arr[i]= (int)(Math.random()*10+1);
			}
		
		System.out.println("배열에 있는 숫자 ");
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			sum+= arr[i];
		}System.out.println();
		
		
		System.out.println("평균 : "+ (double) sum/arr.length);
		
		
		
		
		
		
		
		
		
		
	}

}
