package Arrays;

import java.util.Arrays;

public class ArraysMain {
	
	private int[] testArray;
	private int[] intRay;
	
	public ArraysMain() {
		intRay = new int[100];
		//populate(intRay);
		//checkOccurences(intRay,3,18);
		populate1ToN(intRay);
		shuffle(intRay);
		System.out.println(Arrays.toString(intRay));
	}
	
	private void populate(int[] intRay) {
		for(int i = 0; i < intRay.length; i++) {
			intRay[i] = diceRoll(3);
		}
	}
	
	private void checkOccurences(int[] array, int start, int end) {
		int[] counter = new int[end-start+1];
		for(int value: array) {
			counter[value - start]++;
		}
		for(int i = 0; i < counter.length; i++) {
			System.out.println("A "+(start+i)+" was rolled "+counter[i]+" times.");
		}
	}

	private void populate1ToN(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}
	}

	private void swap(int[] array, int i, int j) {
		int tempNumber = array[i];
		array[i] = array[j];
		array[j] = tempNumber;
	}

	private void shuffle(int[] array) {
		for(int i = 0; i< array.length;i++) {
			swap(array,(int)(Math.random()*array.length),(int)(Math.random()*array.length));
		}
	}
	
	public static void main(String[] args) {
		ArraysMain arrayPractice = new ArraysMain();
	}

	public int diceRoll(int numberOfDice) {
		int roll = 0;
		for(int i = 0; i < numberOfDice; i++) {
			roll += (1+(int)(Math.random()*6));
		}
		return roll;
	}
	
	public void notes(){
		// Arrays are a collection of primitives or objects
		// utility class included in Java for formatting
		// SPECIAL NOTE: This is the ONLY collection of primitives
		
		//size cannot be modified
		
		//Elements of an array are REFERENCES to objects.
		//(If you change an element of an array, the REFERENCES changes, not the object)
		
		//Two different types of constructors
			//int[] firstType = {3,0.14,0.00159};
			//CAN ONLY BE USED AT DECLARATION.
			
			//SecondType : 
				testArray = new int[22];
				//SPECIAL NOTE2: for primitive arrays, when they are instantiated, they
				//are automatically population w/ 0s. This isn't the case with Object arrays
				//which are populated with 'null' and for boolean array, populated with false.
		
		//standard for loop
		for(int i = 0; i < testArray.length;i++) {
			System.out.println(testArray[i]);
		}
		
		//NEW ForEach loop
			//but it's only useful when you don't need to keep track of index
		
		for(int value:testArray) {
			//for each int in testArray
			System.out.println(value);
		}
	}
}
