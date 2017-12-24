package character;
import utilities.Utilities;
import character.Player;
import room.Room; 

public class Flowey extends Character{

	public int x;
	public int y;
	
	public Flowey(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public static void createPlayerName() throws InterruptedException
	{
		int sleepTime = 1050;
		System.out.println("Howdy! I'm FLOWEY. What is your name?");
		String Pn = Utilities.getInput();
		Player.setPlayerName(Pn);
		System.out.println("Hmmm... You're new to the UNDERGROUND, aren'tcha?" + Pn);
		Thread.sleep(sleepTime);
		System.out.println("Golly, you must be so confused. Someone ought to teach you");
		Thread.sleep(sleepTime);
		System.out.println("how things work around here!");
		Thread.sleep(sleepTime);
		System.out.println("I guess little old me will have to do.");
		Thread.sleep(sleepTime);
		System.out.println("Ready? Here we go!");
		Thread.sleep(sleepTime);
		System.out.println("*****************************************************\n\n\n");
	}
	

}
