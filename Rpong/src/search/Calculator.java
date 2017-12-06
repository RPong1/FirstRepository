package search;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner calculator = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		double response = 0;
		initiateCalculator(num1, num2, calculator);
	}
	
	public static void initiateCalculator(double num1, double num2, Scanner calculator){	
		print("Enter the first number: ");
		num1 = calculator.nextDouble();
		print("Enter the second number: ");
		num2 = calculator.nextDouble();
		println("What would you like to do with these numbers?");
		println("Type 'a' to add, 's' to subtract, 'm' to multiply or 'd' to divide.");
		useOperation(num1,num2, calculator);
	}
	
	private static void useOperation(double num1, double num2, Scanner calculator) {
		String userResponse = calculator.next();
		if (userResponse.equals("a")){
				double response = num1 + num2;
				println(num1 + " + "+ num2 + " = "+ response);
		}
		else if (userResponse.equals("s")){
			double response = num1 - num2;
			println(num1+ " - "+ num2 + " = "+ response);
		}
		else if (userResponse.equals("m")){
			double response = num1*num2;
			println(num1+ " * "+ num2 + " = "+response);
		}
		else if (userResponse.equals("d")){
			double response = num1/num2;
			println(num1+ " / "+num2+" = "+response);
		}
		else println("Please type 'a' to add, 's' to subtract, 'm' to multiply or 'd' to divide.");
	}
	public static void print(String s){
		System.out.print(s);
	}
	public static void println(String s){
		System.out.println(s);
	}
}
