package Sampletest.Retry;

public class ShopService {

	private static ShopService singleton = new ShopService();

	public static ShopService getSingleton() {
		return singleton;
	}

	public static void setSingleton(ShopService singleton) {
		ShopService.singleton = singleton;
	}
	
	


	
	
	
}
