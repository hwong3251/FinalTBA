package character;
import java.util.Scanner;

import room.Room;
import runner.GameRunner;
import utilities.Utilities;

public class Player extends Character{
	
	private static int x;
	private static int y;
	public static String name;
	/**
	 * @param x y: position of player.
	 */
	public Player(int x , int y, String name)
	{
		this.x = x;
		this.y = y;
		this.name = name;
	}
	
	//set limit to where player can go in the map. 
	public void moveLimit()
	{
		if(y > GameRunner.currentMap.getyBoardSize()-1)
		{
			System.out.print("!! You cannot move this way. !!\n");
			y -=1;	
		}
        if(y < 0)
        {
        	System.out.print("!! You cannot move this way. !!\n");
      		y +=1;
        }
        if(x > GameRunner.currentMap.getxBoardSize()-1)
        {
        	System.out.print("!! You cannot move this way. !!\n"); 
        	x -=1;
        }
        if(x < 0)
        {
        	System.out.print("!! You cannot move this way. !!\n");  
      		x +=1;
        }  
	}
	
	//player movement control
	public void chooseMove()
	{
		System.out.println("Where do you want to go?");		
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();	
		if (response.equals("w"))
		{
			this.x -= 1;
		}
		else if (response.equals("s"))
		{
			this.x += 1;
		}
		else if (response.equals("d"))
		{
			this.y += 1;
		}
		else if (response.equals("a"))	
		{
			this.y -= 1 ;
		}
		else
		{
			System.out.println("Choose w(up),a(left),s(down),or d(right)");
		}
		moveLimit();
	}
	
	//set Player name
	public static void setPlayerName(String name) {
		Player.name = name;
	}
	
	//getter
	public static int getX()
	{
		return x;
	}
	public static int getY()
	{
		return y;
	}
	public static String getName()
	{
		return name;
	}
	
}
