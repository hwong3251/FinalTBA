package board;

import character.Player;
import room.EmptyRoom;
import room.Room;

public class Map1{
	static EmptyRoom ER = new EmptyRoom(null, null, false);
	public static Room[][]map = {{ER,ER,ER},
								 {ER,ER,ER},
								 {ER,ER,ER}};
	public static int boardSize = 3 ;
	
	public static void printMap(Player player,int boardSize) {
		for (int i = 0; i < boardSize; i++)
		{
			for (int j = 0; j < boardSize; j++)
			{
				if (j == player.x && i == player.y)
				{
					System.out.print(" [ " + "u" + " ] ");
				}
				else
					System.out.print(" [   ] ");
			}
			System.out.println(" ");
		}
	}
}
