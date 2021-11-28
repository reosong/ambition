package ArryType;

import java.util.Calendar;

public class Enumtype {

	private static final String Week = null;

	public static void main(String[] args) {
		
		/*열거타입
		 * public enum 열거타입이름{상수이름, 상수이름2...]
		 * -데이터 타입임
		 * 상수는 주로 대문자로 사용
		 * 허용가능한 값들을 제한
		 * 
		 * 
		 * 열거타입 변수 :
		 * Week week;
		 * 
		 * 열거타입 열거상수
		 *예 week =Week.MONDAY
		 *
		 */
		
		week today;
		today = Week.MONDAY;
		System.out.println(Week.MONDAY);
		//name ()매서드
		String name = today.name();
		System.out.println(name);
		//ordinal() 
		//전체열거 객체중 몇번째 열거 객체인지 리턴 
		System.out.println(today.ordinal());
		//compareTo() 
		Week day1 =Week.MONDAY;
		Week day2 =week.TUESDAY;
		int result =day1.compareTo(day2);
		System.out.println(result);
		
		//valueOf (매개변수) 매서드
		//매개변수 값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체 리턴
		
		Week weekDay =Week.valueOf("STAUDAY")
		System.out.println(weekday);
		
		Calendar cal = calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		Week today =Week.MONDAY;
		switch(wk) {
		case 1: today = Week.SUNDAY;break
		
		}
		
		
		
	}

}
