package Interface08.lab03;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue =new BookShelf();
		for(int i=0; i<100;i++) {
			shelfQueue.enQueue("태백산맥"+(i+1)+"권");
		}
		shelfQueue.enQueue("태백산맥");
		shelfQueue.enQueue("태백산맥2");
		shelfQueue.enQueue("태백산맥3");
		System.out.println("책장의 수량 "+ shelfQueue.getSize());
		
		
		
		
	
		for(int i=0; i<30;i++) {
			System.out.println(shelfQueue.deQueue());
		}
		
		
		System.out.println("책장의 책 수량 "+shelfQueue.getSize());
	}
	
}
