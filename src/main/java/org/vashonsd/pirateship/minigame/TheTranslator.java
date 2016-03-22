package org.vashonsd.pirateship.minigame;

import java.util.Random;

public class TheTranslator implements Minigame
{
	
	public TheTranslator() 
	{
		super();
		setUpGame();
	}
	
	private void setUpGame() 
	{
		
	}

	public String Run()
	{
		return "I will translate any Foreign Language word or phrase you type into English";
	}

	public String Handle(String s)
	{
		int spaces = 0;
		int doubleSpace = 0;
		String[] nouns = {"McDonalds", "Pizza", "Burgers", "French Fries", "Flag", "America", "Merica", "Chips", "Biscuit", "Chicken", "Tv", "Pop Corn", "Car"};
		String[] adjectives = {"Filthy", "Fun", "Bright", "Big", "Fat"};
		String[] verbs = {"Runs", "Eats", "Farts", "Sings", "Flies", "Drives", "Dreams"};
		String[] adverbs = {"Quickly", "Slowly", "Happily", "Elegantly", "Daily", "Always", "Never"};
		String[] andThe = {"The", "A", "Your", "My"};
		Random rnd = new Random();
		int theNumber = rnd.nextInt(nouns.length);
		int theNumber2 = rnd.nextInt(adjectives.length);
		int theNumber3 = rnd.nextInt(verbs.length);
		int theNumber4 = rnd.nextInt(andThe.length);
		int theNumber5 = rnd.nextInt(adverbs.length);
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == ' ')
			{
				doubleSpace ++;
				spaces ++;
			}
			else
			{
				doubleSpace = 0;
			}
			if (doubleSpace == 2)
			{
				return "No translation";
			}
		}
		if (spaces == 0)
		{
			return nouns[theNumber];
		}
		else if (spaces == 1)
		{
			return andThe[theNumber4] + " " + nouns[theNumber];
		}
		else if (spaces == 2)
		{
			return andThe[theNumber4] + " " + adjectives[theNumber2] + " " + nouns[theNumber];
		}
		else if (spaces == 3)
		{
			return andThe[theNumber4] + " " + adjectives[theNumber2] + " " + nouns[theNumber] + " " + verbs[theNumber3];
		}
		else if (spaces == 4)
		{
			return andThe[theNumber4] + " " + adjectives[theNumber2] + " " + nouns[theNumber] + " " + verbs[theNumber3] + " " + adverbs[theNumber5];
		}
		else
		{
			return "No translation";
		}
	}

	public String Exit()
	{
		return "Hope I was helpful";
	}

	public String getPrompt() 
	{
		return "TheT";
	}

}
