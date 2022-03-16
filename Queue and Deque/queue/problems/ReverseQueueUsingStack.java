package queue.problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueUsingStack {

	static Queue<Integer> queue = new LinkedList<Integer>();

	public static void reverseQueue() {

		Stack<Integer> stack = new Stack<Integer>();

		while (queue.isEmpty() == false) {
			stack.push(queue.peek());
			queue.remove();
		}

		while (stack.isEmpty() == false) {
			queue.add(stack.peek());
			stack.pop();
		}

	}

	static void Print() {
		for (Integer x : queue)
			System.out.print(x + " ");
	}

	public static void main(String args[]) {
		queue = new LinkedList<Integer>();
		queue.add(12);
		queue.add(5);
		queue.add(15);
		queue.add(20);
		
		System.out.println("Queue:");
		Print();
		System.out.println("");

		reverseQueue();
		System.out.println("Reversed Queue:");
		Print();
	}

}
