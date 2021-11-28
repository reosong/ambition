package doit.array;

public class StudentExam {

	public static void main(String[] args) {
		

		Stu studentLee = new Stu(1234,"lee");
		studentLee.addSubject("math", 90);
	
		studentLee.addSubject("korea", 95);
		
		Stu studentSong = new Stu(1234,"song");
		
		studentSong.addSubject("math", 100);
		studentSong.addSubject("korea",100);
		
		
		studentLee.showInfo();
		studentSong.showInfo();
		
		
		
		
		
		
		
		
	}

}
