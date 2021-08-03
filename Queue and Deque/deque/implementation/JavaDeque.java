package deque.implementation;

import java.util.*;

public class JavaDeque {

	public static void main(String[] args) {
		Deque<Integer> d = new LinkedList<Integer>();

		// Adds element to front of queue
		d.offerFirst(10);

		// Adds element to end of queue
		d.offerLast(20);

		// Adds element to front of queue
		d.offerFirst(5);

		// Adds element to end of queue
		d.offerLast(15);

		// Retrieve the head element
		System.out.println(d.peekFirst());

		// Retrieve the tail element
		System.out.println(d.peekLast());

		// Retrieve and remove the head element
		d.pollFirst();

		// Retrieve and remove the tail element
		d.pollLast();

		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());

		// Traversal using Iterator
		Iterator it = d.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println();

		// Traversal using for-each
		for (int x : d)
			System.out.print(x + " ");
		System.out.println();

		// Descending Traversal using Iterator
		Iterator itr = d.descendingIterator();
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
	}

}
