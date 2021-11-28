package generic_12.Vector;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
//단어 검색장 영문,한글을 해쉬맵에 저장하고 영어를 넣었을때 한글을 출력
	
	
	public static void main(String[] args) {
		
		HashMap<String,String> dic = new HashMap<String,String>();
		
		Scanner sc = new Scanner(System.in);
		
		
		dic.put("apple", "사과");
		dic.put("baby", "아기");
		dic.put("iwant ", "나는 원한다");
		dic.put("gohome", "집에 간다");
			
	
		while(true) {
			System.out.println("찾고싶은 단어 ");
			String eng = sc.next();
			if(eng.equals("exit") ){
				System.out.println("프로그램 종료 ");
				break;
				}
			System.out.println(dic.get(eng));
			System.out.println("============================");
			
			
		}
		
		
		
		
		
		
		
		
	}

}
