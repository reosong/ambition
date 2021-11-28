package lamda_14;

class Outer{
	//static 안붙으면 인스턴스 클래스
	int outNum= 10;			//인스턴스 변수 
	static int sNum= 200;	//정적 변수 
	
	Runnable getRunnable(int i) {
		int num =100;
		
		class MyRunnable implements Runnable{//	지역 내부 클래스 
			int localNum =10;
			@Override
			public void run() {
			//	num=200;
			//	i=100;
				System.out.println("i="+i);
				System.out.println(num);
				System.out.println(localNum);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
		}
		return new MyRunnable();
	}
}

public class LocalInnerClass {
	//지역 내부 클래스 
	//메소드 내에클래스를 정의
	//메소드가 호출할때 사용 메소드가 호출이 끝나면 제거
	//익명 클래스의 기반이 됨
	//익명 내부클래스 지역내부 클래스에서 클래스 이름을 없앤것 
	public static void main(String[] args) {
	
	
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		
		runner.run();
	
	
	
	
	
	

}
}