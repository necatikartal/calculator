package com.neco4j.calculator;

/**
 * Infix class to use Shunting-yard algorithm to solve infix type expression inputs
 */
public class Infix {
	/**
     * Algorithm: Infix to postfix conversion
     * 1. Create an empty stack
     * 2. Convert the input string to a list by using string method split(tokenize)
     * 3. Scan the token from left to right
     *      If the token is operand append to output list(print)
     *      If the token is left parenthesis push it on the stack
     *      If the token is right parenthesis pop the stack until left parenthesis is removed,append each operator to the output list(print)
     *      If the token is an operator(/*-+) push it on the stack. However first remove any operators already on the stack that have higher or equal precedence and append them to the output list(print)
     * 4. When the input expression has been completely processed check the stack. Any operators still on the stack can be removed and appended to the output list(print)
     */
	static String infixToPostfix(String input) throws Exception {
		StringBuilder sb = new StringBuilder(input.length());
		BoundedStack<Character> stck = new BoundedStack<Character>();
		
		for (char token : input.toCharArray()) {
			if (token != '+' && token != '-' && token != '*' && token != '/' && token != '(' && token != ')') // An operand
				sb.append(token);
			else if (token == '(') // LPAR
				stck.push(token);
			else if (token == ')') // RPAR
			{
				char c;
				while (!stck.isEmpty() && (c = stck.pop()) != '(') // Pop and print until "("
					sb.append(c);
			} else // Operator *+/-
			{
				if (token == '+' || token == '-') {
					while (!stck.isEmpty() && stck.peek() != '(' && (stck.peek() == '+' || stck.peek() == '-' || stck.peek() == '*' || stck.peek() == '/'))
						sb.append(stck.pop());
					stck.push(token);
				} else if (token == '*' || token == '/') {
					while (!stck.isEmpty() && stck.peek() != '(' && (stck.peek() == '*' || stck.peek() == '/'))
						sb.append(stck.pop());
					stck.push(token);
				}
			}
		}
		while (!stck.isEmpty())
			sb.append(stck.pop());
		return sb.toString();
	} // end method infixToPostfix

	 /**
     * Algorithm: Postfix Evaluation
     * 1. Create an operand stack
     * 2. Convert the input string to a list by using string method split(tokenize)
     * 3. Scan the token from left to right
     *      If the token is an operand push it to the stack
     *      If the token is an operator pop 2 operands from stack and do the operation(*+-/), then push the result to the stack
     * 4. Pop the stack and return the result
     */
	static double postfixEvaluate(String exp) throws Exception {
		BoundedStack<Double> operands = new BoundedStack<Double>();
		
		for (char token : exp.toCharArray()) {
			if (token != '+' && token != '-' && token != '*' && token != '/') {
				operands.push(Double.parseDouble(Character.toString(token)));
			} else {
				double num2 = operands.pop();
				double num1 = operands.pop();
				double result;
				switch (token) {
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num2 == 0 ? 1 : num1 / num2;// Prevent divide by zero
					break;
				default:
					result = Double.MAX_VALUE; // No such situation
					break;
				}
				operands.push(result);
			}
		}
		return operands.pop();
	} // end method postfixEvaluate
} // end class Infix