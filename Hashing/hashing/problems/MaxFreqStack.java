package hashing.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashMap.*;

/**
 * This code adds element to the stack using push function. Unlike normal stack,
 * the element with maximum frequency in the stack is popped first
 * 
 * @author saurabh
 *
 */

public class MaxFreqStack {

	static int top;
	ArrayList<Integer> stack;
	HashMap<Integer, Integer> count = new HashMap<>();

	public MaxFreqStack() {
		top = -1;
		stack = new ArrayList<Integer>();
	}

	public void push(int x) {
		top++;
		stack.add(x);

	}

	public int pop() {
		int key = countFreq();
		int index = 0;
		for (int i = 0; i < stack.size(); i++) {
			if (stack.get(i) == key) {
				index = i;
			}
		}
		stack.remove(index);
		top--;
		return key;
	}

	public int countFreq() {

		for (int x : stack) {
			count.put(x, 0);
		}
		for (int x : stack) {

			count.put(x, count.getOrDefault(x, 0) + 1);
		}
		int max = Integer.MIN_VALUE;
		int key = 0;
		// int i=0;
		for (Map.Entry<Integer, Integer> itr : count.entrySet()) {
			// i++;
			int i = itr.getValue();
			int j = itr.getKey();
			
			// System.out.println(j+" "+i);

			if (i >= max) {

				max = i;
				key = j;
			}
//			if (i == max) {
//				if (stack.get(top) == itr.getKey()) {
//					key = stack.get(top);
//				} else {
//					max = i;
//					key = j;
//				}
//				
//
//			}

		}
		return key;

	}

	public void printStack() {
		for (int i = 0; i < stack.size(); i++) {
			System.out.print(stack.get(i) + " ");
		}
	}

	public static void main(String[] args) {

		MaxFreqStack stack = new MaxFreqStack();

		stack.push(5);
		stack.push(7);
		stack.push(5);
		stack.push(7);
		stack.push(4);
		stack.push(5);
		// stack.push(4);

		stack.printStack();
		System.out.println("");
		System.out.println("Popped element is: " + stack.pop());
		stack.printStack();
		System.out.println("");
		System.out.println("Popped element is: " + stack.pop());
		stack.printStack();
		System.out.println("");
		System.out.println("Popped element is: " + stack.pop());
		stack.printStack();
		System.out.println("");
		System.out.println("Popped element is: " + stack.pop());
		stack.printStack();
		System.out.println("");
		System.out.println(top);

	}

}
