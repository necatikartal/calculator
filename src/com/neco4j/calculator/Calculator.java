package com.neco4j.calculator;

/**
 * A small calculator class that implements calculator interface
 */
public class Calculator implements ICalculator {
	/**
	 * Adds infix expression as input to evaluate and returns the result
	 * @param input as infix expression 
	 * @return input expression's result 
	 * @see com.neco4j.calculator.ICalculator#calculate(java.lang.String)
	 */
	@Override
	public double calculate(String input) throws Exception {
		/**
		 *  Shunting-yard algorithm to solve infix type expression inputs
		 *	NOTE: it will change with different solutions as JAVACC
		 */
		try {
			return Infix.postfixEvaluate(Infix.infixToPostfix(input));
		} catch (Exception e) {
			throw new IllegalArgumentException("Unvalid expression type! Input has to be infix expression.");
		}	
	} // end method calculate
} // end class Calculator