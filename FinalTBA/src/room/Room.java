package room;

import character.Player;
import item.Item;

import java.util.Arrays;

public abstract class Room {
	private boolean occupied;
    private Character[] occupants;
    private Item[] items;
    
    public Room(Character[]occupants, Item[]items, boolean occupied)
    {
    	this.occupants = occupants;
    	this.items = items;
    	this.occupied = occupied;
    }
    
    public Character[] getOccupants() 
    {
        return occupants;
    }

    public void setOccupants(Character[] occupants) 
    {
        this.occupants = occupants;
    }
    
    public abstract void print();
    
    /*
    public void print(boolean occupied)
    {
    	if(occupied)
    		System.out.print("[X]");
    	else
    		print();
    }
    */
}
