package stacks.problems;

import java.util.*;

/**
 * Multiple stacks acting as one big single stack
 * 
 * @author saurabh
 *
 */
public class StackOfPlates {

	ArrayList<Stack> stacks;
	int capacity;
	int count;

	public StackOfPlates(int capacity) {
		stacks = new ArrayList<Stack>();
		this.capacity = capacity;
		count = 0;
	}

	public void pushOnStack(int item) {
		Stack<Integer> last = getLastStack();

		if (last != null && count < capacity) {
			System.out.println("Pushed item " + item);
			last.push(item);
			count++;
		} else {
			count = 0;
			Stack<Integer> stack = new Stack<Integer>();
			System.out.println("Pushed item " + item);
			stack.push(item);
			count++;
			stacks.add(stack);
		}

	}

	public int popFromStack() {
		Stack<Integer> last = getLastStack();
		if (!last.isEmpty()) {
			return last.pop();
		} else {
			stacks.remove(stacks.size() - 1);
			Stack<Integer> last1 = getLastStack();
			return last1.pop();
		}
	}

	public Stack<Integer> getLastStack() {
		if (stacks.size() == 0) {
			return null;
		}
		return stacks.get(stacks.size() - 1);
	}

	public static class Main {
		public static void main(String[] args) {
			StackOfPlates sop = new StackOfPlates(2);
			sop.pushOnStack(1);
			sop.pushOnStack(2);
			sop.pushOnStack(3);
			System.out.println(sop.popFromStack());

			sop.pushOnStack(4);
			sop.pushOnStack(5);
			sop.pushOnStack(6);
			sop.pushOnStack(7);
			System.out.println(sop.popFromStack());
			System.out.println(sop.popFromStack());
			System.out.println(sop.popFromStack());
		}
	}
}
