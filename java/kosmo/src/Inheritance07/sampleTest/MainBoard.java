package Inheritance07.sampleTest;

public class MainBoard {

	public static void main(String[] args) {

	P player =new P();
	player.play1(1);
	
	
	AdvancedLevel1 av = new AdvancedLevel1 ();
	player.upgradeLevel1(av);
	player.play1(2);
	
	
	SuperLevel1 sp = new SuperLevel1();
	player.upgradeLevel1(sp);
	player.play1(3);

	}

}
