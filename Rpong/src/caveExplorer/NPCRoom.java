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
	
	public String validKeys() {
		return "wdsae";
	}
	
	public void printAllowedEntry() {
		CaveExplorer.print("You can only enter 'w', 'a', 's', or 'd' to more or you can type 'e' to interact");
	}
	
	public void performAction(int direction) {
		if(direction == 4) {
			if(containsNPC() && presentNPC.isActive()) {
				presentNPC.interact();
			}
			else {
				CaveExplorer.print("There is nothing to interact with.");
			}
		}
		else {
			CaveExplorer.print("That key does nothing.");
		}
	}
	
	public String getContents() {
		if(containsNPC() && presentNPC.isActive()) {
			return "M";
		}
		else {
			return super.getContents();
		}
	}
	
	public String getDescription() {
		if(containsNPC() && !presentNPC.isActive()) {
			return super.getDescription()+"\n"+presentNPC.getInactiveDescription();
		}
		else {
			return super.getDescription() + "\n" + presentNPC.getActiveDescription();
		}
	}
}
