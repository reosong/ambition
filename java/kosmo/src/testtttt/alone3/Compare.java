package testtttt.alone3;

public class Compare {
public static void main(String[] arg) {
	
	Pair<Integer,String> p1= new Pair<Integer,String>(1,"apple");
	Pair<Integer,String> p2= new Pair<Integer,String>(1,"apple");
	
	boolean result1 = Util.compare(p1,p2);
	if(result1) {
		System.out.println("ok");
		
	}else System.out.println("no");
	
}
}
