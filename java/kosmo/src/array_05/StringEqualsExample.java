package array_05;
public class StringEqualsExample {
public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";

		if (strVar1 == strVar2 ) {
			System.out.println("str1과 str2는 참조가 같음");
		}else {
			System.out.println("str1과 str2는 참조가 다르다.");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("str1과 str2는 문자열이 같음 ");
		}
	
		String strVar3 = new String ("신민철");
		String strVar4 = new String ("신민철");
		
		if (strVar3==strVar4) {
			System.out.println("str3와 str4는 참조가 같음");
		}else {
			System.out.println("str3와 str4는 참조가 다름");
		}
	
		if(strVar3.equals(strVar4)) {
			System.out.println("str3와 str4는 문자열이 같음 ");
		}
	

		
	
	
	
	
	}

}
