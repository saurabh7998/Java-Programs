package bst.implementation;

import java.util.TreeSet;

public class JavaTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("saurabh");
		ts.add("aneesh");
		ts.add("devendra");
		ts.add("sahil");
		ts.add("sahil");
		
		System.out.println(ts.contains("devendra"));
		System.out.println(ts);
		
		//Unlike HashSet, TreeSet adds items in increasing order 
		for(String x : ts) {
			System.out.println(x+" ");
		}
	}

}
