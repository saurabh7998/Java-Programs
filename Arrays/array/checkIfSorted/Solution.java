package array.checkIfSorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

class Node{
	Node next;
	int val;
	
	Node(int val){
		this.val = val;
		this.next = null;
	}
}
public class Solution {
	static Node head;
	
	public static void main(String[] args) {
		
		head = new Node(2);
		head.next = new Node(3);
		head.next.next = new Node(4);
		head.next.next.next = new Node(5);
		
		printList(head);
		
		addFront(1);
		printList(head);
		
		addLast(7);
		printList(head);
		
		addAfter(5,6);
		printList(head);
		
		addAfter(8,6);
		printList(head);
		
		addAfter(7,8);
		printList(head);
		
	
		
	}
	
	public static void addFront(int x) {
		Node newNode = new Node(x);
		newNode.next = head;
		head = newNode;
	}
	
	public static void addLast(int x) {
		Node newNode = new Node(x);
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public static int addAfter(int x, int y) {
		Node curr = head;
		while(curr.val!=x && curr.next!=null) {
			curr = curr.next;
		}
		if(curr.next==null) {
			return -1;
		}else {
			Node temp = curr.next;
			Node newNode = new Node(y);
			curr.next = newNode;
			newNode.next = temp;
			return 1;
		}
		
		
	}
	
	public static void printList(Node curr) {
		while(curr!=null) {
			System.out.print(curr.val + " ");
			curr = curr.next;
		}
		System.out.println("");
	}

}
