package stacks.implementation;



public class LLStack implements StackInterface {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	
	@Override
	public void push(int d) {

		Node new_node = new Node(d);
		if (head == null) {
			head = new_node;
			return;
		}

		new_node.next = head;
		head = new_node;

	}
	

	@Override
	public void pop() {
		if(head==null) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println(head.data);
		head = head.next;
		//System.out.println("");
	}

	
	@Override
	public void peek() {
		System.out.println(head.data);
	}
	
	@Override
	public  void printStack() {
		for(Node curr=head; curr!=null; curr=curr.next) {
			System.out.print(curr.data+" ");
		}
		System.out.println(" ");
	}
	
	
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		StackInterface stack = new LLStack();
		
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.printStack();
		
		stack.pop();
		stack.pop();
		stack.printStack();
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		
		
		
	}

}
