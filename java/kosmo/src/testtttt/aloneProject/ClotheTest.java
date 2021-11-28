package testtttt.aloneProject;

import java.util.ArrayList;
import java.util.Scanner;

public class ClotheTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("자본금을 입력하세요");
		int startMoney = sc.nextInt();
		

		Person person1 = new Person();
		Customer cus1 = new Customer();
		
		person1.count= 0;
		person1.ownMoney =startMoney;
		System.out.println("사입할 옷 개수를 정하세요");
		int number = sc.nextInt();
	//	for(int i = 0;i<number;i++)
		
		
	
		System.out.println("손님수를 입력하세요 ");
		int customer= sc.nextInt();
		
	
		
		ArrayList<Clothes> pArray = new ArrayList<Clothes>();
		
		ArrayList<Clothes> personTop = new ArrayList<Clothes>();
	
		
		person1.getPants(pArray);
		
		person1.getTop(personTop);
		
	
//	for(int i=0 ;i<customer;i++) {
		
		
		
		
		
		
//	}
		Pants p1 =new Pants();
		p1.color= "blue";
		p1.made="dior";
		p1.name="청바지";
		p1.price = 200000;
		p1.productNum= 1234;
		
		
		Pants p2 =new Pants();
		p2.color= "black";
		p2.made= "zara";
		p2.name= "슬랙스 ";
		p2.price = 10000;
		p2.productNum= 2531;
		
		
		Pants p3 =new Pants();
		p3.color= "white";
		p3.made= "polo";
		p3.name= "면바지  ";
		p3.price = 30000;
		p3.productNum= 2356;
		
		Pants p4 =new Pants();
		p4.color= "black";
		p4.made= "lacoste";
		p4.name= "츄리닝";
		p4.price = 250000;
		p4.productNum= 1423;
		
		Pants p5 =new Pants();
		p5.color= "gray";
		p5.made= "zara";
		p5.name= "슬랙스 ";
		p5.price = 40000;
		p5.productNum= 4321;
		
	
		
		Top t5 = new Top("hoodi","gray","nike", 30000, 3274);
		
		
		
		System.out.println("--------------------사입중---------------");
		person1.buyPants(20000, p1);
		person1.buyPants(10000, p2);
		person1.buyPants(30000, p3);
		person1.buyPants(25000, p4);
		person1.buyPants(40000, p5);
	
		person1.buyTop(30000, t5);
		
		System.out.println("사입 완료 ");
		System.out.println();
		
		
		System.out.println("----------옷 리스트 --------");
		System.out.println(person1.pants);
		System.out.println(person1.top);
		person1.showInfo();
		
		System.out.println("------------------------------");
		cus1.buy(50000, p5);
		person1.SellPants(50000, p5);
		
		System.out.println("------------------------------");
		System.out.println(person1.pants);
		person1.showInfo();
		System.out.println("------------------------------");
		System.out.println(cus1.pants);
		cus1.showInfo();
		
		
		
		
		
	}

}
