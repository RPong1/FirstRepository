package caveExplorer;

public class TwoDArrayPractice {

	
	
	public static void main(String[] args) {
		String [][] pic = new String[6][10];
		for(int row = 0; row < pic.length; row++) {
			for(int col = 0; col < pic[row].length; col++) {
				pic[row][col] = " ";
			}
		}
		//drawHorizontalLine(pic,1);
		//drawHorizontalLine(pic,3);
		//drawHorizontalLine(pic,5);
		//drawVericalLine(pic,2);
		drawSlot(pic,4,5);
		drawBox(pic,4,5);
		print(pic);
	}

	public static void drawBox(String[][] pic, int row, int col) {
		drawSlot(pic,row,col);
		drawSlot(pic,row + 1,col);
		drawIfInBounds("_",pic,row + 1,col);
		for(int j = col - 1; j <= col + 1; j++) {
			drawIfInBounds("_", pic, row - 1, j);
		}
	}

	public static void drawIfInBounds(String string, String[][] pic, int row, int col) {
		//ALWAYS CHECK ROW BEFORE COLUMN
		//please check row exists before checking if a column exists in the row
		if(row >= 0 && row < pic.length && col >= 0 && col < pic[row].length){
			pic[row][col] = string;
		}
	}

	public static void drawSlot(String[][] pic, int row, int col) {
		if(row >= 0 && row < pic.length) {
			if(col>0) {
				pic[row][col-1] = "|";
			}
			if(col< pic[row].length - 1) {
				pic[row][col+1] = "|";
			}
		}
	}

	public static void drawVericalLine(String[][] pic, int col) {
		for(int row = 0; row < pic.length; row++) {
			pic[row][col] = "|";
		}
	}

	public static void drawHorizontalLine(String[][] pic, int row) {
		for(int col = 0; col < pic[row].length; col++) {
			pic[row][col] = "-";
		}
	}
	
	

	public static void print(String[][] pic) {
		String output = "";
		for(int row = 0; row < pic.length; row++) {
			for(int col = 0; col < pic[row].length; col++) {
				output += pic[row][col];
			}
			output += "\n";
		}
		System.out.println(output);
	}

}
