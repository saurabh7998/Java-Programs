package queue.problems;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueUsingRecursion {

	static void Print(Queue<Integer> q) {
		for (Integer x : q)
			System.out.print(x + " ");
	}

	static void reverse(Queue<Integer> q) {
		if (q.isEmpty())
			return;

		int x = q.peek();
		q.remove();

		reverse(q);
		q.add(x);

	}

	public static void main(String args[]) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(12);
		queue.add(5);
		queue.add(15);
		queue.add(20);
		
		System.out.println("Queue:");
		Print(queue);
		System.out.println("");

		reverse(queue);
		System.out.println("Reversed Queue:");
		Print(queue);
	}

}
