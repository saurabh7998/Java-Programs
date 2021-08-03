package queue.implementation;

public class QueueUsingLinkedList {

	Node front;
	Node rear;
	int size;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void enQueue(int d) {

		Node new_node = new Node(d);
		if (front == null) {
			front = new_node;
			rear = new_node;
			size++;
			return;
		}

		rear.next = new_node;
		rear = new_node;
		size++;
	}

	public void deQueue() {

		if (front == null) {
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println("Dequeue: " + front.data);
		front = front.next;
		size--;
	}
	
	public int getSize() {
		return size;
	}

	public void printQueue() {

		for (Node curr = front; curr != rear.next; curr = curr.next) {
			System.out.print(curr.data + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {

		QueueUsingLinkedList queue = new QueueUsingLinkedList();

		queue.enQueue(10);
		queue.enQueue(9);
		queue.enQueue(8);
		queue.enQueue(7);
		queue.enQueue(6);

		queue.printQueue();
		System.out.println("Size of the queue is: "+queue.getSize());
		
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();

	}

}
