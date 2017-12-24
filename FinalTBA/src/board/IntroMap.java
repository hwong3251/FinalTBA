package board;

import character.Flowey;
import character.Player;
import room.EmptyRoom;
import room.IntroFlowey;
import room.Room;
import runner.GameRunner;

public class IntroMap extends Board{

	public EmptyRoom ER0 = new EmptyRoom(null, false);
	public EmptyRoom ER1 = new EmptyRoom(null, false);
	public EmptyRoom ER2 = new EmptyRoom(null, false);
	public EmptyRoom ER3 = new EmptyRoom(null, false);
	public EmptyRoom ER4 = new EmptyRoom(null, false);
	public EmptyRoom ER5 = new EmptyRoom(null, false);
	public EmptyRoom ER6 = new EmptyRoom(null, false);
	public EmptyRoom ER7 = new EmptyRoom(null, false);
	public IntroFlowey IF1 = new IntroFlowey(null, true);
	
	public Room[][]map = { {ER0,ER1,ER2},
						   {ER3,ER4,ER5},
						   {ER6,IF1,ER7}	};
	
	private int xboardSize = map.length;
	private int yboardSize = map[0].length;
	
	@Override
	public void updateMap() 
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < map.length; i++)
		{
			for (int j = 0; j < map[i].length; j++)
			{
				if(i==Player.getX() && j==Player.getY())
				{
					map[i][j].addOccupants();
				}
				else
				{
					map[i][j].removeOccupants();
				}
			}
		}
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
	
	//get x dimension
	public int getxBoardSize()
	{
		return this.xboardSize;
	}
	//get y dimension
	public int getyBoardSize()
	{
		return this.yboardSize;
	}
	
	public boolean FloweyPlayerEncounter()
	{
		if(Player.getX()==2 && Player.getY()==1)
		{
			System.out.println("You see a flower,.............. it is talking to you!");
			try {
				Flowey.createPlayerName();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
		return false;
	}
	
	//////////////////////////////////////////INTRO SCENE///////////////////////////////////////////////
	public static void introduction() throws InterruptedException
	{
		int sleepTime = 1000;
		System.out.println("Long ago, two races ruled over Earth: HUMANS and MONSTERS");
		Thread.sleep(sleepTime);
		System.out.println("One day, war broke out between the two races.");
		Thread.sleep(sleepTime);
		System.out.println("After a long battle, the humans were victorious");
		Thread.sleep(sleepTime);
		System.out.println("They sealed the monsters underground with a magic spell");
		Thread.sleep(sleepTime);
		System.out.println("Many years later... \n ");
	}
}
