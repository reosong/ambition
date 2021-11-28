package testtttt.aloneProject;

public class Pants extends Clothes {

	String name;
	String color;
	String made;
	int price;
	int productNum;
	
	
	
	
	@Override
	public void wear() {
		System.out.println(name+color+"색깔 "+made+"제조 "+"바지를 입습니다."+"가격 :"+price);		
	}

	public String toString() {
		
		return  name+" "+color+" "+made+" "+price;
	}


	
	
	
	

}
