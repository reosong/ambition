package array_05;
public class TwoDimension {
public static void main(String[] args) {

	int [ ][] arr = {{1,2,3,} , {4,5,6}};		//2차원 배열 선언과 초기화 

	for(int i =0; i<arr.length;i++) { //arr.length : 1차원 배열일때 열 
									//2차원 배열일 때 행 arr[0].length :행의 인덱스 번호 열을 출력 
		for(int j =0; j<arr[i].length;j++) {	//열을 루프 
			
			System.out.println(arr[i][j]);
		} System.out.println();
	}
	
	System.out.println("arr.length : "+ arr.length);
	System.out.println("arr[0].length : "+ arr[0].length);
	System.out.println("=======================");
		
	arr [1][2] =300;
		
		
		
		
		
		
		
		
		
	}

}
