package search;

import java.util.Scanner;

public class TowersOfHanoi {

	   public void solve(int n, String start, String helper, String end) {
	       if (n != 1) {
	    	   solve(n - 1, start, end, helper);
	           System.out.println("Put disc "+start + " to disc " + end);
	           solve(n - 1, helper, start, end);
	       } else {
	    	   System.out.println("Put disc "+ start + " to disc " + end);
	       }
	   }

	   public static void main(String[] args) {
	       TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
	       System.out.print("Enter number of discs: ");
	       Scanner scanner = new Scanner(System.in);
	       int discs = scanner.nextInt();
	       towersOfHanoi.solve(discs, "A", "B", "C");
	   }
	}
