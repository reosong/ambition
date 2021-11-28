package array_05;

public class ReturnArray {	
	
	static int [] makeArray() {
		int temp[]= new int[4];		//정수형 배열 방 4개 생성 
		for(int i =0; i<temp.length;i++) {	//for문을 사용해서 각 방에 정수 값을 할당. 
			temp[i]= i;		//배열의 각 방에 값 : 0 ,1 ,2, 3
		}return temp;
	}

	
	public static void main(String[] args) {
		
		int intArray[];
		intArray =ReturnArray.makeArray();		//메소드로 부터 배열을 전달받음.
		//intArray =makeArray(); 메소드에 static이 없으면new로 생성해서 만들어야함 
		// 근데 static이 잇으면 클래스.메소드 말고 그냥 메소드만으로 사용가능 
		
		for(int i =0; i<intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		
		
		intArray[0]=50;
		intArray[1]= 60;
		intArray[2]= 70;
		intArray[3]= 80;
		
		for(int a :intArray) {
			System.out.print(a+ " ");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
