package board;

import java.io.IOException;
import java.util.Scanner;

import character.Player;
import room.EmptyRoom;
import room.IntroFlowey;
import room.Room;
import runner.GameRunner;

public class Fight extends Board{
	
	public EmptyRoom ER = new EmptyRoom(null, true);
	public EmptyRoom ER1 = new EmptyRoom(null, false);
	
	public Room[][]map = { {ER,ER,ER1,ER,ER},
						   {ER,ER,ER,ER,ER},
						   {ER,ER,ER,ER,ER},
						   {ER1,ER,ER,ER,ER1},
						   {ER1,ER1,ER,ER1,ER1}
						};
	@Override
	public void updateMap() 
	{
		
	}
	
	public void printMap() 
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < map.length; i++)
		{
			for (int j = 0; j < map[i].length; j++)
			{
					map[i][j].print();
			}
			System.out.println(" ");
		}
		
	}

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
				System.out.println("You idiot! In this world, it's kill or BE killed. \n  \n"
								  +"Why would ANYONE pass up an opportunity like this!? \n\n\n\n\n\n");
				System.out.println("YOU DIED! GAME OVER");
			}
			else if(response.equals("d"))
			{
				System.out.println("...Just run... DON'T TURN BACK");
				System.out.println("GAME OVER");
			}
			else
			{
				System.out.println("a -> accept / d ->denied");
			}
	}

	@Override
	public int getxBoardSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getyBoardSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}