package room;

import character.Player;
import runner.GameRunner;

public class IntroFlowey extends Room{
	private boolean occupied = true;
	private Player occupants ;
	
	public IntroFlowey(Player occupants, boolean occupied) {
		this.occupants = occupants;
		this.occupied = occupied;
	}
	
	public void print() 
	{
		if(occupied)
		{
			System.out.print("[F]");
		}
		else
		{
			System.out.print("[ ]");
		}

	}

	@Override
	public void addOccupants() {
		occupants = GameRunner.player;
		occupied = true;
	}

	@Override
	public void removeOccupants() {
		occupants = null;
	}
}
