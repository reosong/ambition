package Sampletest.test5;

public class Example8_2 {

	public static void main(String[] args) {

		int [] [] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum =0;
		double avg = 0.0;
		int count =0;
		
		
		for(int i=0; i<array.length;i++) {
			for(int a =0; a<array[i].length; a++) {
				sum+= array[i][a];
				count ++;
			}
		}
		
		
		System.out.println(sum);
		
		System.out.println((double)sum/count);
		
		
		
		
		
		
		
	}

}
