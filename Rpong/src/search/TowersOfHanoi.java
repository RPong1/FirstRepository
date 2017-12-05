package search;

public class TowersOfHanoi {

		public static void main(String[] args) {
			hanoi(3, "A", "B", "C");
		}
	
	   public static void hanoi(int n, String start, String helper, String end) {
	       if (n != 1) {
	    	   hanoi(n - 1, start, end, helper);
	           System.out.println("Put disc "+start + " to disc " + end);
	           hanoi(n - 1, helper, start, end);
	       } else {
	    	   System.out.println("Put disc "+ start + " to disc " + end);
	       }
	   }
	}
