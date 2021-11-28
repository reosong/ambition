package array_05;

public class ObjectCopy3 {

	public static void main(String[] args) {//배열의 깊은 복사 
		

		Book[] bookArray1 = new Book[3]; // 객체의 배열방 3개 생성 
		Book[] bookArray2 = new Book[3];
		bookArray1 [0]= new Book("태백산맥","조정래");
		bookArray1[1] =new Book("데미안", "헤르만 헤세");
		bookArray1[2] =new Book("어떻게 살 것인가 ","유시민");
		
		bookArray2[0] = new Book();			//객체를 직접 생성 후 복사 
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		
		
		
		
		
		
		for(int i =0;i<bookArray1.length;i++) {
			bookArray2 [i].setBookName(bookArray1[i].getBookName());
			bookArray2 [i].setAuthor(bookArray1[i].getBookName());
		}
		for(int i =0; i<bookArray2.length;i++){		//bookaArray2 출력 
			bookArray2[i].showInfo();
		}
		bookArray1[0].setBookName("나목");			//원본을 수정 
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("===============bookArray1================");
		
		for(int i =0 ; i<bookArray1.length;i++) {
			bookArray1[i].showInfo();
		}
		System.out.println("===============bookArray2================");
		
		for(int i =0 ; i<bookArray2.length;i++) {
			bookArray2[i].showInfo();
		}
		
		

	}

}
