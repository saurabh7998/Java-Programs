package linkedlists.probems;

import java.util.HashSet;

public class RemoveDups {

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

		// Print Original LL
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
		
		//Removing Duplicates:
		Node curr = head;
		HashSet<Integer> set = new HashSet<Integer>();
		Node prev = null;
		
		while(curr!=null) {
			if(set.contains(curr.data)) {
				prev.next = curr.next;
			}else {
				set.add(curr.data);
				prev = curr;
			}
			curr = curr.next;
		}
		
		System.out.println("");
		Node head1 = head;
		while(head1!=null) {
			System.out.print(head1.data+" ");
			head1=head1.next;
		}
	}

}
