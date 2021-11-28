package Basic_class_11.garbage_collector;

public class FinalizeExample {

	public static void main(String[] args) {
		
		Counter counter = null;
		for(int i =1; i<50; i++) {
			counter = new Counter(i);
			
			counter = null;		//객체를 스레기로 만듬 
			
			System.gc();		//가비지 컬렉터 수동으로 호출 
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
