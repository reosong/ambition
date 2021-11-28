package Basic_class_11;

import java.utill.Objects;

class MyDate{
int day;
int month;
int year;

public MyDate(int day, int month, int year) {
	this.day= day;
	this.month= month;
	this.year = year;
	
}

@Override
public String toString() {
	
	return year+" 년 "+ month+ "월 "+ day + "일";
}

@Override
public int hashCode() {
	return Object.hash(day,month,year);
}


@Override
public boolean equals(Object obj) {
	if(obj instanceof EqualTest4) {
		EqualTest4 eq = (EqualTest4) obj;
	if(this.year == eq.year) {
		return true;
	}else return false;
		
}
	return false;
}




}
public class EqualTest4 {

	public int year;

	public static void main(String[] args) {
		
		
		
	MyDate my = new MyDate(27,9,2021);
	MyDate myy = new MyDate(27,9,2021);
	
	
	
	
	System.out.println(my);
		
		
		
		
		
		
		
		
	}

}
