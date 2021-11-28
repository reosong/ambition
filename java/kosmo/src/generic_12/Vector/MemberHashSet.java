package generic_12.Vector;
import java.util.HashSet;
import java.util.Iterator;

import generic_12.Member;

public class MemberHashSet {

	
		private HashSet<Member> hashSet;
		
		public MemberHashSet() {
			hashSet = new HashSet<Member>();
		}
		
		
		public void addMember(Member member) {
			hashSet.add(member);
		}
		
		public boolean removeMember(int memberId) {
			Iterator<Member> ir = hashSet.iterator();
			
			while(ir.hasNext()) {
				Member member = ir.next();
				int temId = member.getMemberId();
				if(temId == memberId) {
					hashSet.remove(member);
					return true;
				}
			}System.out.println("no"); return false;
		}
		public void showAllMember() {
			for(Member member: hashSet) {
				System.out.println(member);
			}System.out.println();
		}
		
		
		
		
		
	

}
