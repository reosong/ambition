package object06;

import java.util.Scanner;

public class Rectangle {                //넓이와 높이를 입력 받아서 넓이를 구하는 프로그램 
	int width;		//넓이 
	int height;		//높이 
	
	public Rectangle() {}			//기본 생성자는 생략이 가능 
	
	
	public int getArea() {		//int 값을 리턴 돌려주는 getArea 메소드 
		return width * height;
	}
	
	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.println(">>");
		
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		
		System.out.println("사각형의 면적은 " +rect.getArea());
		
		
		
	}

}
