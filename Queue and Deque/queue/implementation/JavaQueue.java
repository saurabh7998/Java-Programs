package queue.implementation;

import java.util.*;
public class JavaQueue {
	
	public static void main(String[] args) {
		
       // Queue<Integer> q1 = new LinkedList<Integer>(); 
        Queue<Integer> q = new ArrayDeque<Integer>(); 
        
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q);
        System.out.println("");
        
        q.poll();
        q.poll();
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q);
        System.out.println("");
        
        q.poll();
        q.poll();
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q);
        

	}

}
