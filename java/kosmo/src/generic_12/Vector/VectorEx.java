package generic_12.Vector;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();

		v.add(5);
		v.add(3);
		v.add(10);
		
		
		v.add(2, 100);
		
		System.out.println("백터내의 요소 객체 갯수는 " +v.size());
		
		System.out.println("백터의 현재 용량 "+ v.capacity());
		
		//모든 요소의 정수 출력하기 
		for(int i=0; i<v.size();i++) {
			System.out.println(v.get(i));
		}
		int sum= 0;
		for(int i =0 ; i<v.size();i++) {
			
			sum+= v.get(i);
		}System.out.println(sum);
		
		
		
	}

}
