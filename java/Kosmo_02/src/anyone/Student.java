package anyone;

import java.util.*;

public class Student {
private int studentId;
private String studentName;
private String subject;
private ArrayList<Score> scoreList = new ArrayList<Score>();



public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}

public Student(int studentId,String studentName, String subject) {
	this.studentName = studentName;
	this.subject = subject;
	this.studentId = studentId;
}
public ArrayList<Score> getScoreList() {
	return scoreList;
}
public void setScoreList(ArrayList<Score> scoreList) {
	this.scoreList = scoreList;
}








}
