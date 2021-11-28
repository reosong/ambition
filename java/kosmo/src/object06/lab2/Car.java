package object06.lab2;

public class Car { 		//this : 객체 자신을 지칭 
	//필드
	String model;
	int speed;
	
	//생성자
	Car(String model){        //반듯이 this 가 들어가야함 
		this.model = model;	
	}
	
	//메소드
	void setSpeed(int speed) {		//반듯이 this 가 들어가야함 
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i<=50; i+=10) {  // i = i+10 
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속: "+
					this.speed +"km/h)");
		}
	}
	
	
	
	
	
	

}
