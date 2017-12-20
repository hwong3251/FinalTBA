package utilities;
import java.util.Scanner;

public class Utilities {
	private static Scanner input= new Scanner(System.in);
	
	public static String getInput()
	{
		return input.nextLine();
	}
	public static int getInt()
	{
		String intString = getInput();
		boolean isInt = false;
		int value = 0;
		while(isInt == false)
		{
			try{
					value = Integer.parseInt(intString);
					isInt = true;
				}
			catch(NumberFormatException e)
			{
				System.out.println("You must enter an integer. Enter again!");
				intString = getInput();
			}
		}
		return value;
	}
}
