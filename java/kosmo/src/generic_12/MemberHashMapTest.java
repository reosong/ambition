package generic_12;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap mh = new MemberHashMap();
		
		Member me = new Member(1000,"song");
		Member me1 =new Member(1002,"kim");
		Member me2 = new Member(1003,"shoi");
		
		
		mh.addMember(me2);
		mh.addMember(me1);
		mh.addMember(me);
		
		mh.showAllMember();
		
		
		mh.removeMember(1002);
		mh.showAllMember();
		
		

	}

}
