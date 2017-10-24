package caveExplorer;

public class CaveRoom {

	private String description;
	// tells what room looks like
	private String directions;
	// tells what you can do
	private String contents;
	// a symbol representing what's in the room
	private String defaultContents;
	// the rooms are organized by direction, null means no room or door in that direction
	private CaveRoom[] borderingRooms;
	private Door[] doors;
	
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;
	
	public CaveRoom(String description) {
		this.description = description;
		setDefaultContents(" ");
		contents = defaultContents;
		// difference btw dC and c is " c becomes x when you are inside this room.
		// when you leave, it goes back to dC
		
		// by Default, arrays will populate with 'null' meaning there are no connections.
		borderingRooms = new CaveRoom[4];
		doors = new Door[4];
		setDirections();
	}

	public void setDirections() {
		directions = "";
		boolean doorFound = false;
		for(int i = 0; i < doors.length; i++) {
			if(doors[i] != null) {
				doorFound = true;
				directions += "\n  There is a "+doors[i].getDescription() +" to "
				+toDirection(i)+". "+doors[i].getDetails();
			}
		}
		if(!doorFound) {
			directions += "There is no way out. You are stuck.";
		}
	}
	
	public void enter(){
		contents = "X";
	}

	public void leave() {
		contents = defaultContents;
	}
	
	public void setConnection(int direction, CaveRoom anotherRoom, Door door){
		addRoom(direction, anotherRoom, door);
		anotherRoom.addRoom(oppositeDirection(direction), this, door);
	}
	
	public static int oppositeDirection(int direction) {
		return (direction + 2) % 4;
	}

	public void addRoom(int direction, CaveRoom cave, Door door) {
		borderingRooms[direction] = cave;
		doors[direction] = door;
		setDirections();
	}

	public void interpretInput(String input) {
		while(isValid(input)) {
			System.out.println("You can only enter 'w', 'a', 's', 'd'.");
			input = CaveExplorer.in.nextLine();
		}
		String direction ="wdsa";
		goToRoom(direction.indexOf(input));
	}
	
	public boolean isValid(String input) {
		String validEntries = "wdsa";
		return validEntries.indexOf(input) > -1 && input.length() == 1;
	}

	public void goToRoom(int direction) {
		if(borderingRooms[direction] != null && doors[direction] != null) {
			CaveExplorer.currentRoom.leave();
			CaveExplorer.currentRoom = borderingRooms[direction];
			CaveExplorer.currentRoom.enter();
			CaveExplorer.inventory.updateMap();
		}
	}

	public static void setUpCaves() {
		//your group sets up all the caves and all the connections
	}
	
	public static String toDirection(int dir) {
		String[] directions = {"the North","the East","the South","the West"};
		return directions[dir];
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public void setDefaultContents(String defaultContents) {
		this.defaultContents = defaultContents;
	}

	
	
}
