package ArryType;

public class arrayType {

	public static void main(String[] args) {
		
		
		/*
		 * 배열
		 * -같은 데이터형을 가진 기억장소 여러개의 모음
		 * -배열변수의 선언형식
		 * 		데이터타입[]이름;
		 * 		데이터타입 이름[];
		 * 1)배열 객체의 생성
		 * 예)
		 * int[] intArray; 또는 int intArray[];
		 * 2)배열 객체의 초기
		 * 1)선언과 동시에 초기화 
		 * 1 타입[] 변수={값1,갑2}
		 * 2 타입 변수[] ={갑1,값2,값3}
		 * 2)new 연산자로 선언후 초기화
		 * 1.타입[] 변수=new 타입[길이]
		 * ----------------------
		 * 특징 
		 * 모든 배열형의 변수는 참조변수이다
		 * 같은 타입만 저장가능하다
		 * 길이가 고정되어있다.
		 */
		
		
		
		int[] intArray = {10,20,30,40,50};
		for(int i =0;i<intArray.length;i++) {
			System.out.println("intArray [%d]:%d%n,i,intArray[i]");
			
		}
		
		//2]선언후 new연산자로 초기화
		int[] intArray2;
		//intArray2 = {10,20,30,40,50};
		intArray2= new int[] {10,20,30,40,50};
		
		
		
		
		String strArray[];
		
		strArray =new String[] {"이순신","강감찬", "세종대왕"};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
