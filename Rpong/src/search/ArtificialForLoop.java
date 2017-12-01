package search;

public class ArtificialForLoop {

	/*
	public static void main(String[] args) {
		forLoop(10, new Action() {
			int count = 1;
			public void act() {
				System.out.println(count+". Hello world");
				count++;
			}
		});
	}
	
	public static void forLoop(int n, Action a) {
		if(n > 0) {
			a.act();
			forLoop(n - 1, a );
		}
	}
	*/
	
	public static void main(String[] args) {
		int value = 18;
		//System.out.println(value + "! is equal to "+factorial(value));
		System.out.println(value + " has " + countPrimeFactors(value,2)+ " prime factors.");
		
	}
	
	public static int countPrimeFactors(int value, int testPrime) {
		if(value == 1) {
			return 0;
		}
		else if(value % testPrime == 0) {
			return countPrimeFactors(value/testPrime, testPrime) + 1;
		}
		else {
			testPrime++;
			return countPrimeFactors(value,testPrime);
		}
	}
	
	public static int factorial(int value) {
		if(value > 1) {
			value *= factorial(value - 1);
		}
		return value;
	}
	
}
