package Sampletest.test6;

public class ShopService {

	private static ShopService se= new ShopService();
	
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return se;
		
	}

	public static void main(String[] args) {
		ShopService o1 = ShopService.getInstance();
		ShopService o2= ShopService.getInstance();
		if(o1==o2) {
			System.out.println("ddd");
		}else {
			System.out.println("sss");
		}
		
		
		
		
		
	}
	
	
	
	
	
}
