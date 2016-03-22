package org.vashonsd.pirateship.minigame;

public class HardestGameFactory implements MinigameFactory {

	public String getName() {
		// TODO Auto-generated method stub
		return "HG";
	}

	public String getFullName() {
		// TODO Auto-generated method stub
		return "Hardest Game";
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return "Do you want to enter the hardest RPG ever made?";
	}

	public Minigame newGame() {
		// TODO Auto-generated method stub
		return new HardestGame();
	}

}
