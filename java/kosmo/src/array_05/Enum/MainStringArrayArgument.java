package array_05.Enum;

public class MainStringArrayArgument {
	//main () 메소드에 args 인자로 값을 던져주기 

	public static void main(String[] args) {
	if(args.length !=2 ) {
		System.out.println("프로그램의 사용법 ");
		System.out.println("Java MainStringArrayArgument num1 num2");
		System.exit(0); //프로그램 강제종료 
		
	}
	String StrNum1 = args[0];
	String StrNum2 = args[1];
	System.out.println(StrNum1 + StrNum2 );
	
	int num1  =Integer.parseInt(StrNum1);  //정수형으로 타입 변환 
	int num2 = Integer.parseInt(StrNum2);	// 정수형으로 타입 변환 
	
	int result = num1 + num2;
	System.out.println("num1 + num2 = "+ result);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
