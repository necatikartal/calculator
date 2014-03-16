package com.neco4j.calculator;

/**
 * A small generic bounded stack that implements generic stack class
 */
public final class BoundedStack<T> extends Object implements IStack<T> {
	private T[] items;
	private int top;

	/**
	 * Default(no-argument) constructor to create stack with default size
	 */
	@SuppressWarnings("unchecked")
	public BoundedStack() {
		top = -1;
		items = (T[]) new Object[20];
	} // end no-argument BoundedStack constructor

	/**
	 * Constructor to create stack with size
	 * @param size
	 */
	@SuppressWarnings("unchecked")
	public BoundedStack(int size) {
		top = -1;
		items = (T[]) new Object[size];
	} // end one-argument BoundedStack constructor

	/**
	 * Adds the given item to the top of the stack
	 * @param item
	 * @throws if stack is full
	 * @see com.neco4j.calculator.IStack#push(java.lang.Object)
	 */
	@Override
	public void push(T item) throws Exception {
		if (isFull())
			throw new Exception("Stack is full");
		items[++top] = item;
	} // end method push

	/**
	 * Removes the top item from the stack and returns it
	 * @throws if stack is empty
	 * @return top item
	 * @see com.neco4j.calculator.IStack#pop()
	 */
	@Override
	public T pop() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is empty");
		return items[top--];
	} // end method pop

	/**
	 * Returns the top item from the stack without popping it
	 * @throws if stack is empty
	 * @return top item
	 * @see com.neco4j.calculator.IStack#peek()
	 */
	@Override
	public T peek() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is empty");
		return items[top];
	} // end method peek

	/**
	 * Returns whether the stack is empty or not
	 * @return true/false condition
	 * @see com.neco4j.calculator.IStack#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return top == -1;
	} // end method isEmpty

	/**
	 * Returns whether the stack is full or not
	 * @return true/false condition
	 * @see com.neco4j.calculator.IStack#isFull()
	 */
	@Override
	public boolean isFull() {
		return top == items.length - 1;
	} // end method isFull

	/**
	 * Returns the number of items currently in the stack
	 * @return count
	 * @see com.neco4j.calculator.IStack#count()
	 */
	@Override
	public int count() {
		return top + 1;
	} // end method count
} // end class BoundedStack<T>