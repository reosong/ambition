package testtttt.alone2;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
private HashSet<Member123> hashSet;

public MemberHashSet() {
	hashSet = new HashSet<Member123>();
}
public void addMember(Member123 member) {
	hashSet.add(member);
}
public boolean removeMember(int member) {
	Iterator<Member123> ir = hashSet.iterator();
	
	while(ir.hasNext()) {
		Member123 member = ir.next();
		int tempId = member.getMemberId();
	
		if(tempId== memberId) {
			hashSet.remove(member);
			return true;
		}
	}
	System.out.println("id가 존재하지 않습니다. ");
	return false;
	
}
	public void showAllMember() {
		for(Member123 member: hashSet) {
			System.out.println(member);
		}System.out.println();
	}



}
