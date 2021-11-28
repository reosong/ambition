package Basic_class_11.wapper;

public class Boxing_unBoxing {

	//AutoBoxing :기본자료형의 데이터를 객체형 변수에 할당
	//unBoxing : 객체형의 자료형을 기본 자료형으로사용

	
	public static void main(String[] args) {
		

		Integer num1 = new Integer(100);		//num1은 객체형 자료형 
		
		int num2 = 200;							//num2는 기본 자료형 
		int sum = num1 +num2;
		//num1이 자동으로 언박싱	 num1.intValue();
		int sum2 = num1.intValue() + num2;
		
		Integer num3 = num2; 	// 오토 박싱 : Integer.valueOf(num2)로 자동변환 
		Integer num4 = Integer.valueOf(num2);
		
		
		System.out.println(sum);
		System.out.println(sum2);
		
		
		
		
	}

}
