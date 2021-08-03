package stacks.problems;

import java.util.Stack;

public class QueueUsingStack {
	
	Stack<Integer> newStack = new Stack<Integer>();
	Stack<Integer> oldStack = new Stack<Integer>();
	
	public void addToQueue(int item) {
		oldStack.push(item);
		System.out.println("Added item "+item);
	}
	
	public void removeFromQueue() throws Exception {
		shiftStack();
		if(newStack.isEmpty()==false) {
			System.out.println("Removed item "+ newStack.pop());
			//return newStack.pop();
		}else {
			throw new Exception("Stack is Empty");
		}
		
	}
	
	public void shiftStack() {
		if(newStack.isEmpty()) {
			while(!oldStack.isEmpty()) {
				newStack.push(oldStack.pop());
			}
		}
	}
	
	static class Main{
		public static void main(String[] args) throws Exception {
			QueueUsingStack queue = new QueueUsingStack();
			
			queue.addToQueue(1);
			queue.addToQueue(2);
			queue.addToQueue(3);
			queue.addToQueue(4);
			queue.addToQueue(5);
			
			queue.removeFromQueue();
			queue.removeFromQueue();
			queue.removeFromQueue();
			queue.removeFromQueue();
			queue.removeFromQueue();
			//queue.removeFromQueue();  This will throw the exception that stack is empty
			
			queue.addToQueue(10);
			queue.addToQueue(12);
			queue.addToQueue(14);
			queue.removeFromQueue();
			queue.addToQueue(16);
			

			
		}
	}
	
}
