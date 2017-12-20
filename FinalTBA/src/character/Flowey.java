package character;
import utilities.Utilities;
import character.Player;
import room.Room; 

public class Flowey extends Character{
	private static String name;
	private String line, description;
	private int HP, AT;
	private Room room;
	public int x;
	public int y;
	
	public Flowey(String name, String line, String description,int HP, int AT, int x, int y)
	{
		super(name, line, description, HP, AT);
		this.x = x;
		this.y = y;
	}
	public static void createPlayerName()
	{
		System.out.println("Howdy! I'm FLOWEY. What is your name?");
		String Pn = Utilities.getInput();
		System.out.println("Hmmm... You're new to the UNDERGROUND, aren'tcha?" + Pn);
		System.out.println("Golly, you must be so confused. Someone ought to teach you"
						 + "how things work around here! \n"
							+"I guess little old me will have to do. \n"
							+"Ready? Here we go!");
		System.out.println("*****************************************************\n"
							+"ENTER FIGHT");
		Player.setPlayerName(Pn);
	}
	

}
