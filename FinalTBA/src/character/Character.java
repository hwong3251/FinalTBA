package character;

import java.util.Scanner;

import room.Room;

public abstract class Character {
	public static String name, line, description;
	private int HP, AT, DF, EXP;
	private Room room;
	private int x, y;
	
	/** 
	 * @param name : name of character. Player can create their own name.
	 * @param line : character's quotes / lines in the game
	 * @param description : the physical description of the character
	 * @param xlocation : x location of character in the board
	 * @param ylocation : y location of character in the board
	 * @param HP : Hit Point, 0 HP = game over / dead
	 * @param AT : Attack. Strength of fight option in combat(player) 
	 * @param x y : position of player
	 */
	public Character(String name, String line, String description,int HP, int AT)
	{
		this.name = name;
		this.line = line;
		this.description = description;
		this.HP = HP;
		this.AT = AT;

	}
}
