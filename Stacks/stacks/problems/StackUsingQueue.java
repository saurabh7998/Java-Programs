package stacks.problems;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	public void pushItem(int item) {
		System.out.println("Pushed item "+item);
		q2.add(item);

		while (!q1.isEmpty()) {
			q2.add(q1.peek());
			q1.remove();
		}

		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
	}

	public int popItem() {
		return q1.remove();
	}

	public int top() {
		return q1.peek();
	}
	
	static class Main{
		public static void main(String[] args) {
			
			StackUsingQueue stack = new StackUsingQueue();
			
			stack.pushItem(1);
			stack.pushItem(2);
			stack.pushItem(3);
			stack.pushItem(4);
			System.out.println(stack.popItem());
			System.out.println(stack.top());
		}
	}

}
