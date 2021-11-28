package generic_12.Vector;

import generic_12.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet met = new MemberTreeSet();
		
		Member m1 = new Member(100,"snog");
		Member m2 = new Member(102,"kim");
		Member m3 = new Member(101,"choi");
		
		
		met.addMember(m1);
		met.addMember(m2);
		met.addMember(m3);
		
		met.showAllMember();
		
		Member m4 = new Member(102,"park");
		met.addMember(m4);
		met.showAllMember();
		
		
	}

}
