package caveExplorer;

public class NPCRoom extends CaveRoom {

	private NPC presentNPC;
	
	public NPCRoom(String description) {
		super(description);
		presentNPC = null;
	}

	public boolean canEnter(){
		//NPCs can enter a room if no other NPC is already there.
		return presentNPC == null;
	}
	
	public void enterNPC(NPC m){
		presentNPC = m;
	}
	
	public void leaveNPC(){
		presentNPC = null;
	}
	
	public boolean containsNPC(){
		// helpful to have this other way of referring to it.
		// esp, if I decide to change the rules of "canEnter"
		return presentNPC != null;
	}
	
	// above,  new features to CaveRoom.
	// below, replace CaveRoom methods (override)
}
