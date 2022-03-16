package bst.problems;

import java.util.TreeSet;

/**
 * This code prints the ceiling of the items in the array only from the items left side.
 * If item does not have a ceiling on left side, print -1, else print the ceiling value
 * @author saurabh
 *
 */
public class CeilOnLeftSide {
	
	public static void main(String[] args) {
		
		int arr[]={2,8,30,15,25,12};
	    int n=arr.length;
	
	    printCeilingOnLeft(arr,n);
		
	}
	
	static void printCeilingOnLeft(int[] arr, int n) {
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		System.out.print("-1"+" "); // First element will not have ceiling on left side so print -1
		ts.add(arr[0]);
		for(int i=1; i<n; i++) {
			if(ts.ceiling(arr[i])!=null)
                System.out.print(ts.ceiling(arr[i])+" ");
            else
                System.out.print("-1"+" ");
            ts.add(arr[i]);
		}
		
	}

}
