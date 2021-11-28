package generic_12.Vector;

import java.util.Iterator;
import java.util.TreeSet;

import generic_12.Member;


public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
		
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
		
	}
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int temId = member.getMemberId();
			if(temId == memberId) {
				treeSet.remove(member);
				return true;
			}
			
		}return false;
		
		
		
	}
	public void showAllMember() {
		for(Member member: treeSet) {
			System.out.println(member);
		}System.out.println();
	}
	

}
