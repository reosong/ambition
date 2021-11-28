package data.test;

public class MemberVO {
private String num;
private String name;
private int t;
private int w;
private int age;

public MemberVO() {
	
}

public MemberVO(String name, int age) {
	this.name = name;
	this.age= age;
	
}
public MemberVO(int age) {
	
	this.age = age;
	
}
public MemberVO(String name) {
	
	this.name = ;
	
}
public MemberVO(String num,String name, int t, int w, int age) {
	this.num= num;
	this.name = name;
	this.t= t;
	this.w = w;
	this.age =age;
	
}

public String getNum() {
	return num;
}

public void setNum(String num) {
	this.num = num;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getT() {
	return t;
}

public void setT(int t) {
	this.t = t;
}

public int getW() {
	return w;
}

public void setW(int w) {
	this.w = w;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}










}
