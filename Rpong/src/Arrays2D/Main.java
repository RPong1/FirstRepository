package Arrays2D;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		print(addToMetroCard(5.55,40.00));
		howManyRides(addToMetroCard(5.55,40.00));
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
	
	public static String reverseString(String s) {
        String str = "";
        for(int i = s.length(); i >= 1; i--){
        	System.out.println(s.substring(i-1, i));
        	str += s.substring(i-1,i);
        }
        return str;
    }
	
	public static int singleNumber(int[] nums) {
		System.out.println(nums);
	        Arrays.sort(nums);
	    System.out.println(nums);
	        int single = nums[0];
	        int i = 1; 
	        while(i < nums.length){
	        	System.out.println(single);
	        	System.out.println(nums[i]);
	        	System.out.println(" ");
	            if(single != nums[i]){
	                single = nums[i];
	            }
	            i++;
	        }
	        return single;
	    }
	
	public static ArrayList<Double> addToMetroCard(double amount, double total){
		ArrayList<Double> results = new ArrayList<Double>();			
		for(double i = 5.50; i <= total; i += 0.05){
			double j = round(i,2);
			if((round(j*1.05,2)+ amount) % 2.75 == 0.0){
				results.add(j);
			}
		}
		return results;
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