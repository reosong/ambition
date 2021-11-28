package array_05.twodemension;

public class IrreqularArray {

	public static void main(String[] args) {
		
		int intArray[][] = new int[4][];
		//비정방형 배열 선언. 앞에 있는 행의 갯수만 선언!!
		
		intArray[0]= new int[3]; 	//행의 인덱스 0에 열의 갯수 선언 3개 
		intArray[1]= new int[2];	//행의 인덱스 1에 열의 갯수 선언 2개 
		intArray[2]= new int[3];	//행의 인덱스 2에 열의 갯수 선언 3개 
		intArray[3]= new int[2];	//행의 인뎃스 3에 열의 갯수 선언 2개 
		
		for(int i =0; i<intArray.length;i++) {	//배열의 각방에 값을 입력 
			for(int j =0; j<intArray[i].length;j++) {
				intArray[i][j] =(i+1)*10+j;
			}
		}
		
		for (int i =0; i<intArray.length;i++) {
			for(int j =0; j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+" ");
				
			} System.out.println();
		}
		
		
		
		
		
		
		
	}

}
