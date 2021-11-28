package testtttt.aloneJava;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다. ");
	}	
}
class Human extends AnimalTest{
	public void move() {
		System.out.println("사람이 두발로 걷습니다. ");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다. ");
	}
}
class Tiger extends AnimalTest{
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다. ");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다. ");
		
	}
}
class Eagle extends AnimalTest{
	public void move() {
		System.out.println("독수리가 하늘읍 납니다. ");
		
	}
		public void flying() {
			System.out.println("독수리가 날아오릅니다아아~");
			
		}
}


public class AnimalTest{
	ArrayList<AnimalTest> aniList = new ArrayList<AnimalTest>();
	public static void main(String[] arg) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("원래 형으로 다운캐스팅 ");
		aTest.testCasting();
		
	}
	
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani :aniList) {
			ani.move();
			
		}
		
	}
	public void test() {
		for(int i =0; i<aniList.size(); i++) {
			Animal ani = aniList.get(i);
			if(ani instanceof Human) {
				Human h = (Human)ani;
				h.readBook();
			}
		}
	}
	
	
	
	
	
}