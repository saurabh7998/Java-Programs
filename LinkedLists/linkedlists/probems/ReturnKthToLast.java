package linkedlists.probems;

public class ReturnKthToLast {
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {

		Node head = new Node(4);
		head.next = new Node(0);
		head.next.next = new Node(2);
		head.next.next.next = new Node(0);
		head.next.next.next.next = new Node(4);

		printKthToLast(head, 5);
		printKthToLast(head, 2);

	}

	public static void printKthToLast(Node head, int k) {

		Node n1 = head;
		Node n2 = head;
		int count = 0;

		while (count != k) {
			if (n1 == null) {
				System.out.println("Not Possible to print the " + k + "th node");
				break;
			}
			n1 = n1.next;
			count++;
		}

		while (n1 != null) {
			n1 = n1.next;
			n2 = n2.next;
		}

		System.out.println(n2.data);
	}

}
