package generic_12.Vector;

import generic_12.Member;
import generic_12.MemberArrayList;

public class MemberArrayListTest {

	public static void main(String[] args) {
		

		MemberArrayList ma = new MemberArrayList();
		
		Member mem1 = new Member(100,"song");
		Member mem2 = new Member(200,"kim");
		
		
		ma.addMember(mem1);
		ma.addMember(mem2);
		ma.showAll();
		
		
		ma.removeMember(200);
		ma.showAll();
		
		
		System.out.println(ma);
	}

}
