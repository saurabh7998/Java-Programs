package linkedlists.probems;

import java.util.LinkedList;

public class Merge2SortedLists {
	
	static class Node{
		Node next;
		int data;
		
		public Node(int data){
			this.data = data;
		}
	}
	
	public static Node mergeLists(Node a, Node b) {
		
		if(a==null) {
			return b;
		}
		if(b==null) {
			return a;
		}
		
		if(a.data<b.data) {
			 a.next = mergeLists(a.next, b);
			 return a;
		}else {
			 b.next = mergeLists(a, b.next);
			 return b;
		}
		
		
	}

	public static void main(String[] args) {
		
		Node head1 = new Node(0);
		head1.next = new Node(1);
		head1.next.next = new Node(3);
		
		Node head2 = new Node(1);
		head2.next = new Node(1);
		head2.next.next = new Node(4);
		head2.next.next.next = new Node(5);
		head2.next.next.next.next = new Node(6);
		
		Node newNode = mergeLists(head1, head2);
		
		while(newNode!=null) {
			System.out.print(newNode.data+" ");
			newNode=newNode.next;
		}
		
		
	}
		
		
}
