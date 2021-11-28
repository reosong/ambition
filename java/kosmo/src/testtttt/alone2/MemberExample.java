package testtttt.alone2;

public class MemberExample {

	public static void main (String[] arg) {
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		Member m3 = new Member("red");
		
		if(m1.equals(m2)) {
			System.out.println("같음");
		}else System.out.println("다름 ");
		
		
		if (m2.equals(m3)) {
			System.out.println("같습니다 ");
			
		}else System.out.println("다릅니다. ");
		
		
		
		
		
	}
}
