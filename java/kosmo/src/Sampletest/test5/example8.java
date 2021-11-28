package Sampletest.test5;

public class example8 {

	public static void main(String[] args) {

		
		int[][]array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum =0;
		double avg= 0.0;
		
		
		
		
		for (int i =0; i<3;i++) {
			for(int a =0 ;a<array[i].length; a++) {
				sum += array[i][a];
			}
		}
		avg = (double) sum/(array[0].length+ array[1].length+array[2].length);
		System.out.println(sum);
		System.out.println(avg);
		
		
		

	}

}
