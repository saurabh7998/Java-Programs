package stacks.implementation;

public class ArrayStack implements StackInterface{

	static int[] arr;
	static int top = -1;

	/**
	 * Constructor to initialize the stack size
	 * 
	 * @param size
	 */
	public ArrayStack(int size) {
		arr = new int[size];
	}
	
	
	
	@Override
	public void push(int a) {
		if (isFull()) {
			System.out.println("Stack is full");
		}
		top++;
		arr[top] = a;
	}

	@Override
	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
		}
		System.out.println(arr[top]);
		top--;
		
	}

	@Override
	public void peek() {
		System.out.println(arr[top]);
	}

	@Override
	public void printStack() {
		for (int i = top; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static boolean isFull() {
		return top == arr.length-1;
	}

	
	public static boolean isEmpty() {
		return top == -1;
	}
	
	
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		StackInterface stack = new ArrayStack(5);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.printStack();
		System.out.println(isFull());
		//stack.push(8);
		stack.pop();
		stack.printStack();
		
	}

}
