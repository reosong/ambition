package array_05;

public class ArrayTest2 {

	public static void main(String[] args) {
	

		double [] data = new double [5];
		
		data[0]=10.0;
		data[1]= 20.0;
		data[2]=30.0;
		
		double sum = 0;
		double total= 1.0;
		
		for(int i =0 ; i<data.length;i++) {
			System.out.println(data[i]);
			sum += data[i];
			
		}
		System.out.println("총합은 : "+ sum);
		

		for (int i =0; i>data.length; i++) {
			total *= data[i];
			
		}
		System.out.println("배열의 모든수를 곱한 결과:" + total);
		
	
		System.out.println("-------------------------------");
		double [] data2 = new double [10];
		
		
		
		System.arraycopy(data, 0, data2, 0,5);
		
		
		for(int i =0 ; i<data2.length;i++) {
			System.out.println(data2[i]);
			
		}
	}

}
