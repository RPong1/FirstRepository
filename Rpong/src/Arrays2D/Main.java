package Arrays2D;

public class Main {

	public static void main(String[] args) {
		judgeCircle("DURDLDRRLL");
		
	}

	public static boolean judgeCircle(String moves) {
        int l = 0;
        int d = 0;
        int u = 0;
        int r = 0;
        String[] arr = {"UD","LR"};
        for(int i = 0; i < moves.length(); i++){
            if(moves.substring(i,i+1).toLowerCase().equals("l")){
                l++;
            }
            if(moves.substring(i,i+1).toLowerCase().equals("d")){
                d++;
            }
            if(moves.substring(i,i+1).toLowerCase().equals("u")){
                u++;
            }
            if(moves.substring(i,i+1).toLowerCase().equals("r")){
                r++;
            }   
        }
        System.out.println("L: "+ l + " R: " + r + " D: " + d + " U: " + u);
        return ((l == r) && (d == u));
    }
}