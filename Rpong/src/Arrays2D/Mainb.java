package Arrays2D;

import java.util.ArrayList;
import java.util.Arrays;

public class Mainb {

	public static void main(String[] args) {
//		howManyRides(addToMetroCard(5.55,40.00));
	}

	public static int[] howManyRides(ArrayList<Double> results){
		int[] array = new int[results.size()];
		for(int i = 0; i < results.size(); i++) {
			double j = results.get(i);
			if(j <= 55)
				array[i] = (int) (round(j*1.05,2) / 2.75) + 2;
			if(j > 55)
				array[i] = (int) (round(j*1.05,2)/ 2.75) + 3;
		}
		print(Arrays.toString(array));
		return array;
		
	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
	
	public static void print(Object o) {
		System.out.println(o);
	}
	
}
