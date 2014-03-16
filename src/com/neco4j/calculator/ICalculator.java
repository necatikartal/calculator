package com.neco4j.calculator;

/**
 * A small calculator interface.
 */
public interface ICalculator {
	/**
	 * Adds infix expression as input to evaluate and returns the result
	 * @exception if handled any exception
	 */
	double calculate(String input) throws Exception;
} // end interface ICalculator