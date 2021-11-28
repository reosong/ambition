package array_05;

public class ArrayCopy {		//배열의 복사, 배열은 초기 배열방에 갯수가 선언되고 자동으로 늘어나지 않습니다. 
								//배열의 더 많은 정보를 넣기 위해서는 새로운 배열을 만들고 기존 배열의값을 복사해서 사용 

	public static void main(String[] args) {
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {1,2,3,4,5};
		int[] array3 = new int [10];	//새로운 배열 방 10개 생성 
		int[] array4 = new int[20];
		
		
		
		System.arraycopy(array1, 0, array2, 1, 4);		//(복사할 원본, 시작할 인덱스 번호 , 복사될 대상 ,복사할 주소 ,복사할 갯수 )
		System.arraycopy(array2, 0, array3, 0, 5);
		System.arraycopy(array1, 2, array4, 0, 3);
		
		for (int i =0; i<array2.length;i++) {
			System.out.println(array2[i]);
		}

		System.out.println("------------------------------------");
		for(int i = 0; i<array3.length;i++) {
			System.out.println(array3[i]);
			
		}
		array3 [5] =500;
		array3 [6]=600;
		array3 [7]= 700;
		System.out.println("------------------------------------");
		for (int i = 0; i<array3.length;i++) {
			System.out.println(array3[i]);
			
		}
		System.out.println("------------------------------------");
		for (int i =0 ; i<array4.length;i++) {
			System.out.println(array4[i]);
			
		}
		
		
		
		
	}

}
