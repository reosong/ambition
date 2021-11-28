package doit.array;

import java.util.ArrayList;

public class Stu {

	int studentId;
	String studentName;
	ArrayList<Subject> list;
	
	
	public Stu(int studentId, String studentName) {
		this.studentId= studentId;
		this.studentName= studentName;
		list = new ArrayList<Subject>();
	}
	
	public void addSubject(String subjectName, int score) {
		Subject sub = new Subject();
		sub.setSubjectName(subjectName);
		sub.setScore(score);
		list.add(sub);
		
	}
	
	
	public void showInfo() {
		System.out.println(studentId+ studentName);
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i).getSubjectName()+list.get(i).getScore());
		}
		
	}
	
	
	
	
}
