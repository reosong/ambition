package testtttt.alone3;
import java.util.List;
import java.util.ArrayList;


public class TravelTest {

	public static void main(String[] args) {
		TravelCustomer tc1 = new TravelCustomer("song",28, 1000);
		TravelCustomer tc2 = new TravelCustomer("kim",27, 1200);
		TravelCustomer tc3 = new TravelCustomer("choi",29, 1300);
		TravelCustomer tc4 = new TravelCustomer("park",30, 900);
		TravelCustomer tc5 = new TravelCustomer("yun",26, 1100);
		
		List<TravelCustomer> tr = new ArrayList<>();
		
		tr.add(tc1);
		tr.add(tc2);
		tr.add(tc3);
		tr.add(tc4);
		tr.add(tc5);
		
		System.out.println("고객 추가된 순서대로 출력");
		tr.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		int total = tr.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총경비"+total);
		
		System.out.println("20세 이상 참가자");
		tr.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		
		
		
		
		
		
		
		
		
		
	}

}
