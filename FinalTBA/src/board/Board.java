package board;
import room.Room;
import character.Player; 
public class Board {
	
    private static Room[][] map;
    private Boolean isOccupied; 
    public Board(Room[][] map)
    {
        this.map = map;
    }
	public static void setMap(Room[][] map) 
	{
        Board.map = map;
    }
    
}
