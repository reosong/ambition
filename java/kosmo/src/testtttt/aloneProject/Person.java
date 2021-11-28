package testtttt.aloneProject;

import java.util.ArrayList;

public class Person {
	int ownMoney;
	int count=0;
	ArrayList<Clothes> pants;
	ArrayList<Clothes> top;
	
	
	public void getPants(ArrayList<Clothes> pArray) {
		pants= pArray;
	}
	public void getTop(ArrayList<Clothes> tArray) {
		top = tArray;
	}
	
	public void showInfo() {
		
		System.out.println("잔액: "+ownMoney+" 옷 개수 "+ count);
	}
	public int buyPants(int buyPrice,Clothes clothes) {
		pants.add(clothes);
		System.out.println(clothes+"구매완료 ");
		ownMoney = ownMoney- buyPrice;
		count++;
		return ownMoney-buyPrice;
		
		
	}
	
	public int SellPants(int sellPrice, Clothes clothes) {
		for(int i=0;i<pants.size();i++) {
			if(pants.get(i)==clothes) {
				pants.remove(i);	}
			}
		ownMoney = ownMoney+sellPrice;
		count--;
		System.out.println(clothes+"판매완료");
		return ownMoney;
		}
	
	public int buyTop(int buyPrice,Clothes clothes) {
		top.add(clothes);
		System.out.println(clothes+"구매완료 ");
		ownMoney = ownMoney- buyPrice;
		count++;
		return ownMoney-buyPrice;
		
		
	}
	
	public int SellTop(int sellPrice, Clothes clothes) {
		for(int i=0;i<pants.size();i++) {
			if(top.get(i)==clothes) {
				top.remove(i);	}
			}
		ownMoney = ownMoney+sellPrice;
		count--;
		System.out.println(clothes+"판매완료");
		return ownMoney;
		}
	
}
