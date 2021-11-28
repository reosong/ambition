package generic_12;
import java.util.HashSet;

import generic_12.Vector.MemberHashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet  me = new MemberHashSet();
		
		Member me1 = new Member(1001,"song");
		Member me2 = new Member(1002,"kim");
		Member me3 = new Member(1005,"choi");
		
		me.addMember(me1);
		me.addMember(me2);
		me.addMember(me3);
		
		me.showAllMember();
		
		Member me4 = new Member(1002,"hong");
		
		me.addMember(me4);
		me.showAllMember();
			
		
		
	
		
	}

}
