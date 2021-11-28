package testtttt.alone2;

public class MemberArrayListTest {

	public static void main(String[] args) {
		

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member123 memberLee = new Member123(1001,"이지원");
		Member123 memberSon = new Member123(1002,"손민");	
		Member123 memberPark = new Member123(1003,"박서현");
		Member123 memberHong = new Member123(1004,"홍길동");
		Member123 memberSong = new Member123(1333,"송영서");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.insertMember(memberSong, 1);
		memberArrayList.showAllMember();
		
	}

}
