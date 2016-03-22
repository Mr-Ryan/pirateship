package org.vashonsd.pirateship.minigame;

import java.util.Random;

public class HardestGame implements Minigame
{
	private int day;
	private int money;
	public HardestGame() 
	{
		super();
		setUpGame();
	}
	
	private void setUpGame() 
	{
		day = 0;
		money = 0;
	}

	public String Run()
	{
		return "This is the hardest and most realistic RPG ever created. You are the CEO of Apple. Hit enter to continue.";
	}

	public String Handle(String s)
	{
		String[] life = {"You made money.", "Someone asked you for money and you made them dance for it... *ss hole.", "You donated to charity.", "Your stocks went up.", "You pooped today!", "Apple pie for breakfast."};
		String[] death = {"You were suffocated by a mob of Apple fanatics.", "Your intern put cinnamon in you coffee and you're allergic to it", "A tiger bit your head off at a party.", "You went on a vacation to Africa but were captured by tribesmen. The last thing you heard was 'whaki buhtaki maki laki'", "Microsoft decided to 'take you out'.", "Drugs are bad"};
		Random rnd = new Random();
		int theNumber = rnd.nextInt(life.length);
		int theNumber2 = rnd.nextInt(death.length);
		int theNumber3 = rnd.nextInt(5);
		money += theNumber3;
		day++;
		if (theNumber3 > 1)
		{
			return life[theNumber] + "\nHit enter to go to tommorow";
		}
		else
		{
			day = 0;
			return death[theNumber2] + " You died.\n\nYou survived " + day + " days, and made " + money + " million dollars.\n\nHit enter to play again?";
		}
	}

	public String Exit()
	{
		return "Hahahahahaha";
	}

	public String getPrompt() 
	{
		return "HG";
	}

}
