package Inheritance07.sampleTest;

import Inheritance07.abstract_gamelevel.PlayerLevel;

public class P {
	private PlayerLevel1 level;
	
	public P() {
		level =new BeginerLevel1();
		level.showLevel();
	}

	public PlayerLevel1 getLevel1() {
		return level;
	}
	public void upgradeLevel1(PlayerLevel1 level) {
		this.level =level;
		level.showLevel();
	}
	public void play1(int count) {
		level.go1(count);
	}
}
