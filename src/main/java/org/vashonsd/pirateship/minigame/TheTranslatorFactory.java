package org.vashonsd.pirateship.minigame;

public class TheTranslatorFactory implements MinigameFactory {

	public String getName() {
		// TODO Auto-generated method stub
		return "TheT";
	}

	public String getFullName() {
		// TODO Auto-generated method stub
		return "The Translator";
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return "I will translate almost anything!";
	}

	public Minigame newGame() {
		// TODO Auto-generated method stub
		return new TheTranslator();
	}

}
