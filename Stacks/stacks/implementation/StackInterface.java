package stacks.implementation;

public interface StackInterface {
	
	/**
	 * Method signature to Push items on to the stack
	 * 
	 * @param a
	 */
	void push(int a);
	
	/**
	 * Method signature to Pop out the top item from the stack
	 * 
	 */
	void pop();
	
	/**
	 * Method signature to peek the top item of the stack
	 * 
	 */
	void peek();
	
	/**
	 * Method signature to print the elements of the stack in LIFO order
	 * 
	 */
	void printStack();

}
