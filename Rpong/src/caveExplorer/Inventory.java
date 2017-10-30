package caveExplorer;

public class Inventory {

	private String map;
	
	public Inventory() {
		updateMap();
	}

	public void updateMap() {
		map = " ";
		for(int i = 0; i < CaveExplorer.caves[0].length - 1; i++) {
			map += "____";//4 underscores
		}
		map += "___\n";//3 underscores
		for(CaveRoom [] row : CaveExplorer.caves) {
			//3 rows of text
			for(int i = 0; i < 3; i++) {
				String text = "";
				for(CaveRoom cr : row) {
					// id door is open, leave it open
					if(cr.getDoor(CaveRoom.WEST)!= null && cr.getDoor(CaveRoom.WEST).isOpen()) {
						text += " ";								
					}
					else {
						text += "|";
					}
					//contents of room depending on what row it is
					if(i == 0) {
						text += "   ";//3 spaces
					}
					else if(i == 1) {
						text += " "+cr.getContents()+" ";
					}
					else if(i == 2) {
						//draw space if to south is open
						if(cr.getDoor(CaveRoom.SOUTH) != null && cr.getDoor(CaveRoom.SOUTH).isOpen()) {
							text += "   ";//3 spaces
						}
						else {
							text += "___";
						}
					}
				}
				text += "|";
				map += text + "\n";
			}
		}
	}

	public String getDescription() {
		//return "You have nothing in your inventory.";
		return map;
	}

}
