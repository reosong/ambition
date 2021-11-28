package Sampletest.test6;

public class AccountExample {

	public static void main(String[] args) {

		Account ac =new Account();
		
		ac.setBalance(10000);
		System.out.println("잔고 :" +ac.getBalance());

	
		ac.setBalance(-100);
		System.out.println("잔고 :" +ac.getBalance());
		
		
		ac.setBalance(200000);
		System.out.println("잔고 :" +ac.getBalance());
		
		ac.setBalance(300000);
		System.out.println("잔고 :" +ac.getBalance());
		
		
		
		
	}

}
