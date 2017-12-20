package runner;
import board.Board;
import board.Fight;
import board.Map1;
import character.Character;
import character.Flowey;
import character.Player;
import room.Room;

public class GameRunner {

	public static boolean GameOn = true;
	static Room[][]NewMap = new Room[8][2];
	public static void main(String[]args) throws InterruptedException
	{
		introduction();
		Flowey flowey1 = new Flowey("FLOWEY", "", "",100, 33, 2, 2);
		Player player1 = new Player(Player.name, "", "",100, 15, 0 , 0);
		Boolean GameOn = true;
		while(GameOn)
		{
			if(player1.x == flowey1.x && player1.y == flowey1.y)
			{
				Flowey.createPlayerName();
				GameOn = false;
			}
			else
			{
				Map1.printMap(player1,3);
				player1.chooseMove();
			}
		}
		Fight.playerVSflowey();
	}
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
