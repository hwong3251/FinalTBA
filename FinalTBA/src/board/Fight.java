package board;

import java.util.Scanner;

import character.Player;
import utilities.Utilities;

public class Fight {

	
	public static void playerVSflowey()
	{
		System.out.println("See that heart? That is your SOUL, the very culmination of your being! \n");
		System.out.println("Your SOUL starts off weak, but can grow strong if you gain a lot of LV.  \n"
							+ "What's LV stand for? Why, LOVE, of course! \n"
							+ "Don't worry, I'll share some with you! \n");
		System.out.println("a -> accept / d ->denied");
		
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
			if(response.equals("a"))
			{
				System.out.println("You idiot! In this world, it's kill or BE killed. "
								  +"Why would ANYONE pass up an opportunity like this!?");
				Player.setHP(0);
				Player.death();
			}
			else if(response.equals("d"))
			{
				System.out.println("LOVE is shared through... little white... \"friendliness pellets.\" Get as much as you want!");
			}
			else
			{
				System.out.println("You want some LOVE, don't you?");
			}
	}
}

