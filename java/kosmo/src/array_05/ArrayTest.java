package array_05;

public class ArrayTest {

	public static void main(String[] args) {
		
		int [] number = new int [] {1,2,3,4,5,6,7,8,9,10};
		
		for (int i=0; i<number.length;i++ ) {
			System.out.println(number[i]);
			
		}
		System.out.println("==========================");
		
		System.out.println(number[0]);
		number[0]= 50;
		number[1]= 60;
		number[2]= 70;
		number[3]= 80;
		
		System.out.println("length :" +number.length);
		
		
		System.out.println(number[0]);
		System.out.println(number[1]);
		int[] array = new int [] {1,2,3,4,5,6,7,8,9};
		System.out.println(array.length);
		//int[] array2 = new int[] {12,34,56,array};
		System.out.println("--------------------------");
		int[] abc = new int[] {1,2,3,4};
		System.out.println(abc[0]);
		int abcd[] = new int[10];
		System.arraycopy(abc, 0, abcd, 0, 4);		

		for (int i =0; i<10;i++) {
			System.out.println(abcd[i]);
		}
	}

}
