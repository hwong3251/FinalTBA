package room;

import character.Player;

import java.util.Arrays;

public abstract class Room {
	private boolean occupied;
    private Player occupants ;
    
    public abstract void print();

	public abstract void addOccupants();
	
	public abstract void removeOccupants();
    
}
