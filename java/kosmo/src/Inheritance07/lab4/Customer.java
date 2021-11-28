package Inheritance07.lab4;

public class Customer {
	
	protected int customerID;			// 고객 ID
	protected String customerName;		// 고객 이름
	protected String customerGrade;		// 고객의 등급 ( VIP, Gold, Silver...)/ 적립포인트, 할인률
	int bonusPoint;				// 보너스 포인트, 포인트 적립 : 고객 등급에 따라서 차등 적립
	double bonusRatio;			// 포인트 적립 비률 : 고객등급에 따라서 물품값을 할인 
	
	public Customer() {			// 기본 생성자 : 기본 회원 등급을 초기화 
		customerGrade = "Silver";		// 기본 회원의 등급 : Silver
		bonusRatio = 0.01;			// 포인트 적립 비율, 물품 가격의 1% 적립 ,  		
	}
	public Customer ( int customerID, String customerName) {
		this.customerID = customerID; this.customerName = customerName;
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	public int calcPrice ( int price ) {	// 구매한 물품에 대해서 보너스 포인트를 적립하는 메소드
		bonusPoint += price * bonusRatio;	// 기존의 보너스 포인트에서 새로운 보너스 포인트를 적립
		return price ;				//일반고객(Silver) : 가격 할인이 없다. 
	}
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + 
				bonusPoint + "입니다. ";
	}
	 /*  customerID, customerName, customerGrade 의  getter, setter */
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}



}
