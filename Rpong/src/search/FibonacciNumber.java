package search;

public class FibonacciNumber {
	
	public static void main(String[] args) {
		for(int i = 0; i < 60; i ++) {
			System.out.println(i + ". "+fibonacciNumber(i));
		}
	}

	public static int fibonacciNumber(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		else return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
	}
}
