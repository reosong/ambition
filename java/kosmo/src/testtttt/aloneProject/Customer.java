package testtttt.aloneProject;

import java.util.ArrayList;

public class Customer {

	int cosMoney;
	int count;
	ArrayList<Clothes> pants;
	ArrayList<Clothes> top;
	
	
	public void getPants(ArrayList<Clothes> pArray) {
		pants= pArray;
	}
	public void getTop(ArrayList<Clothes> TArray) {
		top = TArray;
	}
	
	public void showInfo() {
		
		System.out.println("잔액: "+cosMoney+" 옷 개수 "+ count);
	}
	public int buy(int buyPrice,Clothes clothes) {
		pants.add(clothes);
		System.out.println(clothes+"구매완료 ");
		cosMoney = cosMoney- buyPrice;
		count++;
		return cosMoney-buyPrice;
		
		
	}
	
	public int Sell(int sellPrice, Clothes clothes) {
		for(int i=0;i<pants.size();i++) {
			if(pants.get(i)==clothes) {
				pants.remove(i);	}
			}
		cosMoney = cosMoney+sellPrice;
		count--;
		return cosMoney;
		}
		
		
		
		
		
		
		
		
		
		
		

}
