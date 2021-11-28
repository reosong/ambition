package testtttt.alone2;

public class Member123 {



		private int memberId;
		private String memberName;
		
		public Member123(int memberId,String memberName) {
			this.memberId =memberId;
			this.memberName = memberName;
			
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
		@Override
		public String toString() {
			return memberName + memberId;
		}

}
