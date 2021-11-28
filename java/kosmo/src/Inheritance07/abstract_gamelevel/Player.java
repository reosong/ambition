package Inheritance07.abstract_gamelevel;

public class Player {

	private PlayerLevel level;
	
	public Player() {
		level =new BeginerLevel();
		level.showLevelMassage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	public void upgradLevel (PlayerLevel level) {
		this.level = level;
		level.showLevelMassage();
	}
	
	
	
	
	
	
}
