package com.neco4j.calculator;

/**
 * A small generic stack interface
 */
public interface IStack<T> {
	/**
	 * Adds the given item to the top of the stack
	 * @exception ArrayIndexOutOfBoundsException if stack is full
	 */
	void push(T item) throws Exception;

	/**
	 * Removes the top item from the stack and returns it
	 * @exception java.util.NoSuchElementException if the stack is empty
	 */
	T pop() throws Exception;

	/**
	 * Returns the top item from the stack without popping it
	 * @exception java.util.NoSuchElementException if the stack is empty
	 */
	T peek() throws Exception;

	/**
	 * Returns whether the stack is empty or not
	 */
	boolean isEmpty();

	/**
	 * Returns whether the stack is full or not
	 */
	boolean isFull();

	/**
	 * Returns the number of items currently in the stack
	 */
	int count();
} // end interface IStack<T>