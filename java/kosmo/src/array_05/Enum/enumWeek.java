package array_05.Enum;

import java.util.Calendar;

public class enumWeek {


	public static void main(String[] args) {
	

		Week today =null;
		Calendar cal = Calendar.getInstance();//메소드를 호출해서 사용 객체 생성 , 싱글톤
		//getInstance ()메소드는static 으로 설정
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//요일을 숫자로 출력
		//일 (1) 월 (2) 화(3) 수(4) 목 (5)
		System.out.println(week);
		
		
		switch(week) {
		case 1:today =Week.SUNDAY ; break; 
		case 2:today =Week.MONDAY ; break;
		case 3:today =Week.TUESDAY ; break;
		case 4:today =Week.WEDNESDAY ; break;
		case 5:today =Week.THURSDAY ; break;
		case 6:today =Week.FRIDAY ; break;
		case 7:today =Week.SATURDAY ; break;
			
		}
		
		
		
		
		
	}

}
