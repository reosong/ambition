package array_05.arraylist;

public class Subject {		//과목의 점수를 나타내는 클래스 
	

	private String name ; 		//과목(국어, 영어, 수학 ....)
	private int scorePoint; 	//과목의 정수를 저장하는 변수 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScorePoint() {
		return scorePoint;
	}
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}

}
