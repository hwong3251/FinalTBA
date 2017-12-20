package character;
import java.util.Scanner;

import board.Map1;
import room.Room;
import utilities.Utilities;

public class Player extends Character implements CharacterInterface{
	
	public static String name;
	private String line, description;
	private static int HP;
	private int AT;
	public int x;
	public int y;
	/**
	 * @param x y: position of player.
	 */
	public Player(String name, String line, String description,int HP, int AT, int x , int y)
	{
		super(name, line, description,HP, AT);
		this.x =x;
		this.y = x;
	}
	//set limit to where player can go in the map. 
	public void moveLimit()
	{
		if(y > Map1.boardSize-1)
		{
			System.out.print("You cannot move this way.\n");
			y -=1;	
		}
        if(y < 0)
        {
        	System.out.print("You cannot move this way.\n");
      		y +=1;
        }
        if(x> Map1.boardSize-1)
        {
        	System.out.print("You cannot move this way.\n"); 
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
			this.y -= 1;
		}
		else if (response.equals("s"))
		{
			this.y += 1;
		}
		else if (response.equals("d"))
		{
			this.x += 1;
		}
		else if (response.equals("a"))	
		{
			this.x -= 1 ;
		}
		else
		{
			System.out.println("Choose w(up),a(left),s(down),or d(right)");
		}
		moveLimit();
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public static void setPlayerName(String name) {
		Player.name = name;
	}
	

	private String[]dArr = {"tired","hungry","determined","lost"};
	private String[]lArr = {"attack", "spare", "stay", "compliment", "flee","item","check","collect","follow","..."};
	@Override
	public String getStageLine() {
		// TODO Auto-generated method stub
		return null;
	}
	//getter, setter
	public static int getHP() {
		return HP;
	}
	public static void setHP(int hP) {
		Player.HP = hP;
	}
	//death
	public static void death()
	{
		if(getHP() == 0)
		{
			System.out.println("You Died");
		}
	}
	
}
