package anyone;

import java.util.*;

public class Account {
	int money;
	
	
	
	public void minus(int a) {
		money= money-a;
	}

	public void plus(int a) {
		money= money+ a;
		
	}
	public int rest() {
		return money;
	}
	
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	Account ac = new Account();
	
	
	boolean aa= true;
	boolean run = true;
	
	while(aa) {
		System.out.println("선택하세요 ");
		System.out.println("1.예금,2.출금, 3.잔고,4.종료");
		int num = sc.nextInt();
		while(run) {
		if(num==1) {
			System.out.println("돈을 입력하세요 ");
			int p = sc.nextInt();
			ac.plus(p);
			
			System.out.println("잔액"+ac.money);
			break;
		}if(num==2) {
			System.out.println("돈을 입력하세요 ");
			int p = sc.nextInt();
			ac.minus(p);
			System.out.println("잔액"+ac.money);
			break;
		}if(num==3) {
			System.out.println("잔액"+ac.money);
			break;
		}if(num==4) {
			 aa = false;
		}
		}
		
	}
	
	
	
	
	
	
	
	
	
	

		
	}
}
