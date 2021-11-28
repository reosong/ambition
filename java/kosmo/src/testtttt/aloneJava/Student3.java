package testtttt.aloneJava;

public class Student3 {
	
	public static int num= 1000;
	
	public String name;
	
	public int cardNum;
	
	
	

	public Student3(String name) {
		this.name = name;
		num++;
		cardNum= num*100;
	}
	
	public void showInfo() {
		System.out.println(name+ "의 카드 번호: "+cardNum);
		
	}
	
	
	
	
	
	
	
	
	
	

}
