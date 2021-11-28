package testtttt.alone4;

public class Stu {
public int studentNum;
public String name;


public Stu(int studentNum, String name) {
	this.studentNum = studentNum;
	this.name = name;
	
}


@Override
public int hashCode() {
		return studentNum;
}


@Override
public boolean equals(Object obj) {
	if(obj instanceof Stu) {
		Stu stu = (Stu) obj;
		if(stu.studentNum==studentNum)
			return true;
		else return false;
	}return false;
}




}
