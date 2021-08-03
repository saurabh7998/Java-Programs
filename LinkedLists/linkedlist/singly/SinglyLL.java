package linkedlist.singly;

import java.util.LinkedList;

public class SinglyLL {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void insertAtBeginning(int d) {

		Node new_node = new Node(d);
		new_node.next = head;
		head = new_node;

	}

	public void insertAfterNode(Node prev_node, int d) {

		if (prev_node == null) {
			System.out.println("Previous node cannot be null");
			return;
		}
		Node new_node = new Node(d);
		new_node.next = prev_node.next;
		prev_node.next = new_node;

	}

	public void insertAtEnd(int d) {

		Node new_node = new Node(d);

		if (head == null) {
			head = new_node;
			return;
		}

		Node last = head;
		while (last.next != null) {
			last = last.next;
		}

		new_node.next = last.next;
		last.next = new_node;

	}

	public void deleteNode(int position) {

		// If linked list is empty
		if (head == null)
			return;

		// Store head node
		Node temp = head;

		// If head needs to be removed
		if (position == 0) {
			head = temp.next; // Change head
			return;
		}

		// Find previous node of the node to be deleted
		for (int i = 0; temp != null && i < position - 1; i++)
			temp = temp.next;

		// If position is more than number of ndoes
		if (temp == null || temp.next == null)
			return;

		// Node temp->next is the node to be deleted
		// Store pointer to the next of node to be deleted
		Node next = temp.next.next;

		temp.next = next; // Unlink the deleted node from list

	}

	public void deleteNodeByData(int d) {
		// Store head node
		Node temp = head, prev = null;

		// If head node itself holds the key to be deleted
		if (temp != null && temp.data == d) {
			head = temp.next; // Changed head
			return;
		}

		// Search for the key to be deleted, keep track of the
		// previous node as we need to change temp.next
		while (temp != null && temp.data != d) {
			prev = temp;
			temp = temp.next;
		}

		// If key was not present in linked list
		if (temp == null)
			return;

		// Unlink the node from linked list
		prev.next = temp.next;
	}

	public void searchNode(int d) {
		Node temp = head;
		int pos = 1;
		while (temp != null) {
			if (temp.data == d) {
				System.out.println(d + " is present at position " + pos);
				return;
			} else {
				temp = temp.next;
				pos++;
			}

		}
		System.out.print("Could not find the element");

	}

	public void sortedInsert(int x) {
		Node new_node = new Node(x);
		Node temp = head;

		if (head == null) {
			head = new_node;
			return;
		}

		if (temp.data > x) {
			new_node.next = temp;
			head = new_node;
			return;
		}
		while (temp.next != null && temp.next.data < x) {
			temp = temp.next;

		}

		if (temp.next == null) {
			temp.next = new_node;
			return;

		} else {
			new_node.next = temp.next;
			temp.next = new_node;
			return;
		}

	}

	public void printList() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public void printMiddleNode() {

		if (head == null) {
			return;
		}

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		System.out.print("The middle node is: " + slow.data);
	}

	public void printNthNodeFromEnd(int n) {

		if (head == null) {
			return;
		}

		int length = 0;
		for (Node temp = head; temp != null; temp = temp.next) {
			length++;
		}

		if (length < n) {
			return;
		}

		Node current = head;
		for (int i = 0; i < length - n + 1; i++) {
			current = current.next;
		}

		System.out.print("Node " + n + " from the end is: " + current.data);
	}
	
	public void ReverseLL() {
		
		Node current = head;
		Node previous = null;
		
		while(current!=null) {
			Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
		System.out.println("Reversed Linked List is:");
	}
	
	public void removeDuplicates() {
		Node current = head;
		
		while(current!=null && current.next!=null) {
			if(current.data==current.next.data) {
				current.next=current.next.next;
			}else {
				current=current.next;
			}
		}
		System.out.print("Given sortedList after removing the duplicates is: ");
	}

	public static void main(String[] args) {

		SinglyLL linkedList = new SinglyLL();

		linkedList.head = new Node(2);
		Node second = new Node(3);
		Node third = new Node(4);

		linkedList.head.next = second;
		second.next = third;

		linkedList.insertAtBeginning(1);

		linkedList.insertAtEnd(6);
		linkedList.insertAtEnd(7);

		linkedList.insertAfterNode(third, 10);
		linkedList.printList();
		System.out.println("");
		linkedList.sortedInsert(0);
		linkedList.printList();
		System.out.println("");
		linkedList.searchNode(15);

		linkedList.deleteNode(4);
		linkedList.insertAfterNode(third, 5);
		linkedList.sortedInsert(5);
		System.out.println("");
		linkedList.printList();
		linkedList.printMiddleNode();
		;

		System.out.println(" ");

		linkedList.searchNode(5);
		System.out.println("");

		/////
		SinglyLL ll = new SinglyLL();
		ll.sortedInsert(8);
		ll.insertAtBeginning(7);
		ll.insertAtEnd(10);
		ll.sortedInsert(9);
		ll.printList();
		ll.printMiddleNode();
		System.out.println("");
		ll.printNthNodeFromEnd(3);
		System.out.println("");
		ll.searchNode(9);
		
		ll.ReverseLL();
		ll.printList();
		
		ll.insertAtEnd(6);
		System.out.println("");
		ll.printList();
		System.out.println("");
		
		ll.ReverseLL();
		ll.printList();
		System.out.println("");
		
		ll.sortedInsert(7);
		ll.sortedInsert(8);
		ll.printList();
		System.out.println("");
		ll.removeDuplicates();
		ll.printList();

	}

}
