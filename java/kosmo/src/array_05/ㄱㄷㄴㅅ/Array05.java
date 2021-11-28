package array_05.ㄱㄷㄴㅅ;

public class Array05 {

	public static void main(String[] args) {
		

		char[ ] arr= new char[26];		//char 문자 1글자를 저장 
		
		char ch = 'A'; 
		
		
		
	for(int i = 0; i<arr.length;i++,ch++) {
		arr[i] =ch;
	}
		
		
	for(int i =0; i<arr.length;i++) {
		System.out.println(arr[i]);
	}
		
		
		
	}

}
