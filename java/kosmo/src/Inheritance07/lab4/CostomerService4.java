package Inheritance07.lab4;

public class CostomerService4 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer (10030, "홍길동", 2000);	//업캐스팅
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + " 님이 지불해야할 금액은" + 
				vc.calcPrice(10000));
	}

}
