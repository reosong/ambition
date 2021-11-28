package Basic_class_11.garbage_collector;

public class Counter {
	//garbage Collector : 메모리의 쓰레기(사용하지 않는 객체) 청소. system.gc();
	//JAVA는 가비지를 jvm이 자동으로 청소해준다. cpu가 유효 할때 
	//finalize() 메소드 : 가비지 컬렉터가 청소하기전에 호출되는 메소드
	//객체 소멸 직전에 호출괴는 메소드
	// 객체 소명자 (가비지컬렉터) 개체를 소명하기 직전 finalize() 메소드 호출
	
	private int no;
	public Counter(int no) {
		this.no= no;
		
	}
	@Override		//객체가 삭제될때 호출 
	
	protected void finalize() throws Throwable {
		System.out.println(no+"번째의 finalize() 가 실행됨 ");
	
	}
	

	
	
	
	
	
}
