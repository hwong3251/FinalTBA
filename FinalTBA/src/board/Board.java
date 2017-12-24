package board;
import room.Room;
import character.Player; 
public abstract class Board {
	
    private static Room[][] map;
    private Boolean isOccupied; 
    private int boardSize;
    
	public abstract void printMap();
    public abstract void updateMap();
	public abstract int getxBoardSize();
	public abstract int getyBoardSize();
	
   // public abstract void getboardSize();
}
