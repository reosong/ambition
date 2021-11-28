package testtttt.alone2;

public class ShowTest {
	private String cos;
	private int time;
	private Show girl;

	public ShowTest(String cos, int time,String name, int age) {
		
		this.cos = cos;
		this.time = time;
		girl = new Show(age,name);
	}
	public void ShowTime() {
		System.out.println(cos);
		System.out.println(time);
		girl.showInfo();
	}

	public static void main(String[] args) {
		ShowTest new1 = new ShowTest("a",2,"민",24);
		
		new1.ShowTime();

	}

}
