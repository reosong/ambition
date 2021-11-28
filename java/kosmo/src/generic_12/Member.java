package generic_12;

public class Member implements Comparable<Member>{
	
	private int memberId;
	private String memberName;
	
	public Member(int memberId,String memberName) {
		this.memberId = memberId;
		this.memberName= memberName;
		
	}
	
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	public String toString() {
		return memberId + memberName;
	}


	@Override
	public int hashCode() {
return memberId;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId==member.memberId) {
				return true;
			}else return false;
		}return false;
		
		
	}


	@Override
	public int compareTo(Member member) {
				return (this.memberName.compareTo(member.memberName));
	}
	
	
	


}
