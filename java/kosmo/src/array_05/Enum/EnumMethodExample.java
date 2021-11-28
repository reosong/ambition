package array_05.Enum;

public class EnumMethodExample {

	public static void main(String[] args) {
	
		//enum데이터 타입을 사용하는 객체는 java lang enum 클래스를 상속 받는다
		//java lang enum 클래스의 매소드를 사용할 수 있다
		//name() 메소드 : 열거 객체가 가지고 있는 문자열을 리턴한다. 
		
		Week today = Week.SUNDAY;
		String name = today.name();
		//ordinal() 메소드 : 전체 열거 객체중 몊번째 열거 객체인지 알려준다(인덱스 번호 )
		
		System.out.println(name);
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		//compare() 메소드: 매개값으로 주어진 열거 객체를 기준으로 전후 몇번째에 위치하는 지 비교
		//extends
		
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 =day2.compareTo(day1);
		
		System.out.println(result1);
		System.out.println(result2);

		//valueOf() 매가값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴
		
		
		if(args.length ==1) {
			String StrDay =args[0];
			Week weekDay = Week.valueOf(StrDay);
			if(weekDay == Week.SATURDAY|| weekDay == Week.SUNDAY) {
				System.out.println("주말이군요 ");
				
			}else {
				System.out.println("평일이군요 ");
			}
		}
		
	/*	String arg0 = args[0];
		String arg1 = args[1];
		String arg2 = args[2];
		String arg3 = args[3];
		System.out.println(arg0 + " "+ arg1 + " "+ arg2+ " "+arg3);
		
	*/	
		//values() 모든 열거 객체들을 배열을 만들어 리턴한다. 
		
		
		
		
		
		
		
		
		
	}

}
