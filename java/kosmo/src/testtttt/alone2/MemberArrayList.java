package testtttt.alone2;

import java.util.ArrayList;

public class MemberArrayList {
	 
	private ArrayList<Member123> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member123>();
	}
	
	public void addMember(Member123 member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for(int i =0 ; i<arrayList.size();i++) {
			Member123 member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId +"가 존재하지 않습니다. ");
		return false;
	}
	public void insertMember(Member123 member, int index) {
		arrayList.add(index, member);
		}
	
	public void showAllMember() {
		for(Member123 member: arrayList) {
			System.out.println(member);;
			
		}
		System.out.println();
	}
	
	
	
	

}
