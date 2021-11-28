package testtttt.aloneProject;

public class Top extends Clothes{

	String name;
	String color;
	String made;
	int price;
	int productNum;
	
	public Top(String name, String color,String made, int price, int productNum) {
		this.name = name;
		this.color = color;
		this.made =made;
		this.price = price;
		this.productNum = productNum;
		
	}
	@Override
	public void wear() {
		System.out.println("상의를 입습니다 ");		
	}
	public String toString() {
		
		return  name+" "+color+" "+made+" "+price;
	}
	

}
