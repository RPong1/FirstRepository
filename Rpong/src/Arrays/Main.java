package Arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//ObjectArrays oA = new ObjectArrays();
		Person s = new Person("Ben", "Nockles", Borough.NY_BOROUGHS[0]);
		int x = 10;
		int[] a = {5,6,7};
		test3(s,x,a);
		System.out.println(s+", "+x+", "+Arrays.toString(a));
		}

	/*
	 PASS BY VALUE EXAMPLES
	 
	 //when you have a local variable, you can't change the local variable to where it comes from
	 
	 */
	public static void test(Person s, int x, int[] array) {
		String name = s.getFirstName();
		name = "Ilona";
		x = 5;
		array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
	}
	// changes the name and array
	public static void test2(Person s, int x, int[] array) {
		s.setFirstName("Ilona");
		x = 5;
		array = new int[3]; 
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
	}
	
	public static void test3(Person s, int x, int[] array) {
		s.setFirstName("Ilona");
		x = 5;
		//array = new int[3]; AS LONG AS YOU DONT MAKE A NEW ARRAY,
		//THE REFERENCES WILL CHANGE
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
	}
}
