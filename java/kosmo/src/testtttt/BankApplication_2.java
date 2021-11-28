package testtttt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BankApplication_2 {
	
	private static Scanner sc = new Scanner(System.in);
	private static List<Account_2> arrayList = new ArrayList<Account_2>();
	
	
	
	
				
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
			
			Account_2 account = new Account_2(a,o,b);
			for(int i = 0; i <arrayList.size();i++) {
				
			}
			arrayList.add(account);
			
			System.out.println("계좌 생성 완료 ");
			
		
			
			
			
			
			
				
			

				}
			
				
					
			//	계좌 목록 보기
					private static void accountList() {
						System.out.println("--------------------------");
						System.out.println("계좌 목록 ");
						System.out.println("--------------------------");
					
					for(int i = 0 ; i<arrayList.size(); i++) {
						System.out.println(arrayList.get(i).getAno()+ arrayList.get(i).getOwner()
								+arrayList.get(i).getBalance());
					}
					
					}
						
			
						
						
					
					//예금하기 
					private static void deposit() {
						System.out.println("계좌 번호를 입력해주세요 ");
						String num = sc.next();
						for(int i =0; i< arrayList.size();i++) {
							String list = arrayList.get(i).getAno();
							if (num.equals(list)) {
								System.out.println("입금 금액을 입력해주세요 ");
								int num1 = sc.nextInt();
								int sum=arrayList.get(i).getBalance()+num1; 
								arrayList.get(i).setBalance(sum);
								System.out.println("남은 잔고 :"+arrayList.get(i).getBalance());
								break;
							}	
						}
					}
					
					//출금하기 
					private static void withdraw() {
						
						System.out.println("계좌번호를 입력해주세요 ");
						String num = sc.next();
						for(int i =0; i< arrayList.size();i++) {
							if(num.equals(arrayList.get(i).getAno())) {
								System.out.println("출금 금액을 입력해주세요 ");
								int minus = sc.nextInt();
								int sum = arrayList.get(i).getBalance()-minus;
								arrayList.get(i).setBalance(sum);
								System.out.println("남은 잔고 :"+ arrayList.get(i).getBalance());
								break;
								}
							if(!num.equals(arrayList.get(i).getAno())) System.out.println("계좌 없슈 ");
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
		
		
	

}
