package generic_12.Vector;
import java.util.Iterator;
import java.util.TreeMap;

import generic_12.Member;

public class MemberTreeMap {
	private TreeMap<Integer,Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer,Member>();
		
	}
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
	}
	
	
	
	
	
	
	
	
	

}
