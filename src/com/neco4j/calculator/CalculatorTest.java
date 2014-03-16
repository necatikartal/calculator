package com.neco4j.calculator;

import java.util.Scanner;

/**
 * CalculatorTest class to test calculator
 * @author Necati Kartal
 */
public class CalculatorTest {
	/**
	 * Main method to test calculator
	 * @param args
	 * @throws if any exception handled
	 */
	public static void main(String[] args) {
		Calculator calculator = new Calculator(); // Calculator object to use
		Scanner stdin = new Scanner(System.in);
		boolean condition = true;
		String input;
		
		System.out.println("Enter an infix expression (valid operators: +,-,*,/):");
		do {
			try {
				input = stdin.next(); // get input from user
				System.out.println("Result: " + calculator.calculate(input)); // print result of the input
				stdin.close();
				condition = false;
			} // end try
			catch (Exception exception) {
				//exception.printStackTrace(); // handling exceptions
				//System.err.printf( "\nException: %s\n", exception );
				System.out.println("Invalid expression: Please try again:\n");
				stdin.nextLine();
			} // end catch
			
		} while (condition);
	} // end method Main
} // end class CalculatorTest