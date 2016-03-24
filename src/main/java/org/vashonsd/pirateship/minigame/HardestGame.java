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
		String[] life = {"You made money.", "You preformed in an oprah.", "You donated to charity.", "Your stocks went up.", "You pooped today!", "Apple pie for breakfast.", "You learned how telepathy.", "You got a pet bear.", "You met Jim Carrey, and shared a burger with him.", "I KNEW YOU WERE TROUBLE WHEN YOU WALKED IN SO SHAME ON ME NOW!", "Wiki wiki liki shmicky ticky.", "You had a taco in mexico.", "You had rice in China with your native friend: Ching Ho Ma Chow Mein Wa Fu.", "You wasted your life away on an RPG made by some high school kid."};
		String[] death = {"You were suffocated by a mob of Apple fanatics.", "Your intern put cinnamon in you coffee and you're allergic to it.", "A tiger bit your head off at a party.", "You went on a vacation to Africa but were captured by tribesmen. The last thing you heard was 'whaki buhtaki maki laki'", "Microsoft decided to 'take you out'.", "Drugs are bad.", "You walked under a ladder.", "One of the heads on Easter Island fell on you."};
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
			int days = day - 1;
			int monies = money;
			day = 0;
			money = 0;
			return death[theNumber2] + " You died.\n\nYou survived " + days + " days, and made " + monies + " million dollars.\n\nHit enter to play again?";
			
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
