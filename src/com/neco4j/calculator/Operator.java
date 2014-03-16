package com.neco4j.calculator;

/**
 * A small operator enum that implements operator interface
 */
public enum Operator implements IOperator {
	ADD // Addition
	{
		/**
		 * Apply for ADD operator to calculate the result
		 * @return result
		 * @see com.neco4j.calculator.IOperator#apply(double, double)
		 */
    	@Override 
		public double apply(double x, double y) {
            return x + y; 
        } // end method apply
    }, // end enum type ADD
    SUBTRACT // Subtraction
    {
    	/**
		 * Apply for SUBTRACT operator to calculate the result
		 * @return result
		 * @see com.neco4j.calculator.IOperator#apply(double, double)
		 */
        @Override 
        public double apply(double x, double y) {
            return x - y; 
        } // end method apply
    }, // end enum type SUBTRACT
    MULTIPLY // Multiplication
    {
    	/**
		 * Apply for MULTIPY operator to calculate the result
		 * @return result
		 * @see com.neco4j.calculator.IOperator#apply(double, double)
		 */
        @Override 
        public double apply(double x, double y) {
            return x * y; 
        } // end method apply
    }, // end enum type MULTIPLY
    DIVIDE // Division
    {
    	/**
		 * Apply for DIVIDE operator to calculate the result
		 * @return result
		 * @see com.neco4j.calculator.IOperator#apply(double, double)
		 */
        @Override 
        public double apply(double x, double y) {
            return x / y; 
        } // end method apply
    }; // end enum type DIVIDE
} // end enum Operator