package Sampletest.test6;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {
	private static Account[] 
	private static Scanner sc = new Scanner(System.in);
	static ArrayList<String> arrayList = new ArrayList<>();
	
	
		//계좌 생성하기
	private static void createAccount() {
					
		System.out.println("--------------------------");
		System.out.println("계좌 생성 ");
		System.out.println("--------------------------");
		System.out.println("계좌번호 ");
		String a=sc.next();
		System.out.println("계좌주 ");
		String o = sc.next();
		System.out.println("초기 입금액 ");
		int b = sc.nextInt();
		arrayList.add(a,o,b);
			
		for (int i =0 ; i<array.length;i++) {
			if (array[i]==null) {
				array[i] =newArray;
				System.out.println("계좌가 생성되었습니다. ");
				break;
			}
		}		
	}
				
				
				//계좌 목록 보기
				private static void accountList() {
					System.out.println("--------------------------");
					System.out.println("계좌 목록 ");
					System.out.println("--------------------------");
					
					for(int i = 0; i<array.length;i++) {
						if(array[i]==null) break;
						else System.out.println(array[i].getAno()+" "+
								array[i].getOwner()+" "+ array[i].getBalance());
				}
					
		
					
					
				}
				//예금하기 
				private static void deposit() {
					System.out.println("계좌 번호를 입력해주세요 ");
					String num = sc.next();
					for(int i =0; i< array.length;i++) {
						String list = array[i].getAno();
						if (num.equals(list)) {
							System.out.println("입금 금액을 입력해주세요 ");
							int num1 = sc.nextInt();
							int sum=array[i].getBalance()+num1; 
							array[i].setBalance(sum);
							System.out.println("남은 잔고 :"+array[i].getBalance());
							break;
						}	
					}
				}
				
				//출금하기 
				private static void withdraw() {
					
					System.out.println("계좌번호를 입력해주세요 ");
					String num = sc.next();
					for(int i =0; i< array.length;i++) {
						if(num.equals(array[i].getAno())) {
							System.out.println("출금 금액을 입력해주세요 ");
							int minus = sc.nextInt();
							int sum = array[i].getBalance()-minus;
							array[i].setBalance(sum);
							System.out.println("남은 잔고 :"+ array[i].getBalance());
							break;
							}
						if(!num.equals(array[i].getAno())) System.out.println("계좌 없슈 ");
						break;
					}	
				}
			

			/*account 계좌에서 
			 * private static Account findAccount(String ano) {
					Account account =null;
					for(int i =0 ;i<accountArray.length;i++) {
						if(accaountArray[i]!= null ) {
							Srting dbAno =accoutnArray[i].getAno();
							if(dbAno.equals(ano)){
							account = accountArray[i];
							break;
						}
					}
					return account;
			}
		*/
				
				public static void main(String[] args) {
		
			boolean run = true;
			while(run) {
			System.out.println("--------------------------");
			System.out.println("1계좌생성|2계좌목록|3예금|4출금|5종료");
			System.out.println("--------------------------");
			System.out.println("선택> ");
			
			
			int selectNo = sc.nextInt();
			
			
			if (selectNo ==1) {
				createAccount();
			}else if(selectNo==2) {
				accountList();
			}else if (selectNo==3){
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				run=false;
			}
			
		}System.out.println("프로그램 종료 ");
		
	
		
		
	}

}
