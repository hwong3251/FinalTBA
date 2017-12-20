package room;

import item.Item;

public class EmptyRoom extends Room{
	
	private boolean occupied;
	private Character[] occupants;
	private Item[] items;
	public EmptyRoom(Character[] occupants, Item[] items, boolean occupied) {
		super(null, null, false);
	}
	
	public boolean isOccupied()
	{
		if(occupants==null)
		{
			return false;
		}
		return true;
	}
	
	
	public void print() 
	{
		if(occupied)
		{
			System.out.print("[x]");
		}
		System.out.print("[ ]");
	}

}
