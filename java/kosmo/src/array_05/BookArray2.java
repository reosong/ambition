package array_05;

public class BookArray2 {

	public static void main(String[] args) {
		

		Book[] libray = new Book[5];		//Book의 객체 배열을 저장할 방을 5개 생성 
		
		libray [0] = new Book("태백산맥","조정래 ");
		libray[1] = new Book("데미안", "헤르만 헤세");
		libray [2]= new Book ("어떻게 살것인가? ", "유시민 ");
		libray [3] = new Book("토지 ","박경리 ");
		libray [4] = new Book("어린왕자 ","생택쥐베리 ");
		
		for (int i =0; i<libray.length; i++) {
			libray[i].showInfo();		//객체의 메소드를 호출해서 객체 정보를 출력 
		}
		for (int i =0; i<libray.length; i++) {
			System.out.println(libray[i]);			//객체의 주소값만 저장되어잇다 
			
		}
		
		
	
	
		
	}

}
