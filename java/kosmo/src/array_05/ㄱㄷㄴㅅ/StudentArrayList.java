package array_05.ㄱㄷㄴㅅ;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		
		ArrayList<student> arr = new ArrayList<student>();
		

		student lee = new student(1000,"이순신");
	
		student hong = new student(2000,"홍길동 ");
		
		
		

		arr.add(lee);
		arr.add(hong);
		
		for(int i=0; i<arr.size();i++) {
		student s = arr.get(i);
			s.showInfo();
		}
				
		
		
		
		
		
		
		
	}

}
