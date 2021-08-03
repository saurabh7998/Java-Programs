package stacks.problems;

import java.util.Stack;

public class StackMin extends Stack<Integer> {
	
	Stack<Integer> s2;
	
	public StackMin() {
		s2 = new Stack<Integer>();
	}
	
	public  void push(int val) {
		if(val<min()) {
			s2.push(val);
		}
		super.push(val);
	}
	
	public Integer pop() {
		int value = super.pop();
		if(value==min()) {
			s2.pop();
		}
		return value;
	}
	
	public  int min() {
		if(s2.isEmpty()) {
			return Integer.MAX_VALUE;
		}else {
			return s2.peek();
		}
		
	}
	
	public static class Main 
	{ 
	    public static void main(String[] args) 
	    { 
	        StackMin s = new StackMin(); 
	        s.push(3); 
	        s.push(5); 
	        System.out.println(s.min()); 
	        s.push(2); 
	        s.push(1); 
	        System.out.println(s.min()); 
	        System.out.println(s.pop()); 
	        System.out.println(s.min()); 
	        System.out.println(s.pop()); 
	        System.out.println(s.peek()); 
	        System.out.println(s.min());
	    } 
	} 

}
