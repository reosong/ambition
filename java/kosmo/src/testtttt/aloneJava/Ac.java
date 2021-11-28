package testtttt.aloneJava;

public class Ac {
	private long balance;
	
	public Ac() {}
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsyfficientException{
		if(balance<money) {
			throw new BalanceInsufficientException("잔고부족 ");
		}
		balance-= money;
	}
	

}
