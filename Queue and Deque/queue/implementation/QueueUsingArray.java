package queue.implementation;



public class QueueUsingArray {

	private int front;
	private int rear;
	private int[] queue;
	private int capacity;

	public QueueUsingArray(int size) {
		this.queue = new int[size];
		this.capacity = size;
		front = -1;
		rear = -1;
	}

	public void enQueue(int item) {
		if (isFull()) {
			System.out.println("Queue is full");
			System.exit(-1);
		}

		if (front == -1) {
			front = 0;
		}
		queue[++rear] = item;
		System.out.println("Inserted item: " + item);

	}

	public int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			System.exit(-1);
		}

		int element;
		element = queue[front];
		if (front >= rear) {
			front = -1;
			rear = -1;
		} else {
			front++;
		}
		System.out.println("Deleted Element " + element);
		return element;
	}

	public void diplay() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			System.out.println("\nFront index-> " + front);
			System.out.println("Items -> ");
			for (int i = front; i <= rear; i++)
				System.out.print(queue[i] + "  ");

			System.out.println("\nRear index-> " + rear);
		}
	}

	public boolean isFull() {
		if (front == 0 && rear == capacity - 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		return front == -1;
	}
	
	
	
	public static void main(String[] args) {
		
		QueueUsingArray queue = new QueueUsingArray(5);
		
		/*queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(2);
		queue.enQueue(3); //Queue is full
		queue.enQueue(4);*/ 
		
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.diplay();
		
		queue.deQueue();
		queue.deQueue();
		queue.diplay();
		
		queue.deQueue();
		queue.diplay();
		
		queue.deQueue();
		
		
	}

}

