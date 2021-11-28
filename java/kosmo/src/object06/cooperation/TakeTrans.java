package object06.cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		//학생 두명을 생성 해서 버스와 지하철 탑승
		
		Student studentJames = new Student ("James", 5000);
		//>제임스 학생객체 생성 
		Student studentTomas = new Student ("Tomas ",10000);
		//> 토마스 학생 객체 생성 
		Student studentKim = new Student ("Kim", 20000);
		//> 킴 학생 객체 생성 
		
		
		studentJames.showInfo();
		studentTomas.showInfo();
		studentKim.showInfo();
		System.out.println("--------------------");
		
		Bus bus100 =new Bus (100);
		studentJames.takeBus(bus100); 		//James 가 100번 버스를 탐 
		studentJames.showInfo();
		bus100.showinfo();
		
		System.out.println("--------------------");
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		
		subwayGreen.showInfo();
		
		System.out.println("--------------------");
		
		//	버스 지하철 노선, 금액다르게 설정 해보기
		
		studentKim.takeBus(bus100);
		studentKim.takeSubway(subwayGreen);
		studentKim.showInfo();
		bus100.showinfo();
		subwayGreen.showInfo();
		
		
		Bus bus200 = new Bus(200);
		
		studentKim.takeBus(bus200);
		studentKim.showInfo();
		bus100.showinfo();
		

	}

}
