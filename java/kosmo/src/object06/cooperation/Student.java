package object06.cooperation;

public class Student {
	public String studentName;    //학생이름 
	public int grade;				//학년
	public int money;				//학생이 가진돈 
	
	public Student() {} 	//기본 생성자 (인풋갑이 없고, 실행부가 없는 생성자)
							//메모리를 초기화, 생략가능 
							// 다른 생성자가 있을 때 외부에서 호출시 반드시 명시 
	
	public Student(String studentName, int money) {	//학생이름과 가진돈을 초기화 
		this.studentName = studentName;
		this.money= money;
	}
	public void takeBus(Bus bus) {			//버스를탔을때 
		bus.take(1000);						//버스의 수입을 증가,버스에 돈을 지불 
		this.money -= 1000;			//this.money = this.money - 1000
		
	}
	public void takeSubway(Subway subway) {		//지하철을 탔을때 
		subway.take(1500);					//지하철 요금을 지불 
		this.money -= 1500;					//자신의 돈에서 1500을 지출 
		
	}
	public void showInfo() {
		System.out.println(studentName + "남은돈은 "+ money + "입니다. ");
	}
	
	
}
