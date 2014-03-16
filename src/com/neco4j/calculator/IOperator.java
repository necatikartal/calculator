package com.neco4j.calculator;

/**
 * A small operator interface.
 */
public interface IOperator {
	/**
	 * Apply for any operator to calculate the result
	 */
	double apply (double x, double y);
} // end interface IOperator