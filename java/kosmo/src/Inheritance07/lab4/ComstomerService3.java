package Inheritance07.lab4;

public class ComstomerService3 {

	public static void main(String[] args) {
	
			Customer customerLee = new Customer( 10010, "이순신"); //일반 고객
			customerLee.bonusPoint = 1000;
			
			VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345); //VIP 고객
			customerKim.bonusPoint = 10000;
			
			int price = 10000; 
			
			System.out.println(customerLee.getCustomerName() + " 님이 지불해야할 금액은 " + 
					customerLee.calcPrice(price));
			System.out.println(customerKim.getCustomerName() + " 님이 지불해야할 금액은 " + 
					customerKim.calcPrice(price));		// 메소드 오버라이딩.
						// 동적 바인딩 : 상속 관계에서 부모클래스와 자식클래스에서 동일한 메소드가 존재할 경우 
						//  	자식 클래스의 메소드로 바인딩이 된다. 
	}

}
