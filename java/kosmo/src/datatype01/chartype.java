package datatype01;

public class chartype {
	public static void main(String[] args){
		char c1 = 'A', c2 = 65, c3 = 0B1000001;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 ='가';
		System.out.println(c4);
		char c5 = '나';
		System.out.println(c4);
		System.out.println(c5);
		//char형 : 하나의 문자를 저장할 수 있는 자료형2byte 0부터 2^16 -1 까지 저장
		// 값 저장시 하나의 문자를 ' ' 로 감싼다.
		
		char ch1= 'A';
		int num1 = 2;
		System.out.println(ch1+num1);
		
		//아스키(혹은 유니코드) 코드값(십진수) 을 char형으로 변환하면 해당 아스크 코드값의 문자로 바꿈
		// 반대로 어떤 문자를 int 형으로 바꾸면 그 문자의 코드값으로 변환
		
		
		System.out.println("");
		
		
		
		
		
	}		
	
}
