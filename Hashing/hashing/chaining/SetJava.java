package hashing.chaining;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetJava {

	public static void main(String[] args) {

		// HashSet implements Set Interface
		Set<String> fruits = new HashSet<String>();

		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Kiwi");

		// HashSet will store items in the set in any order
		System.out.println(fruits.toString());
//////////////////////////////////////////////////////////////////////////////////

		// LinkedHashSet implements Set Interface
		Set<String> fruits1 = new LinkedHashSet<String>();

		fruits1.add("Banana");
		fruits1.add("Apple");
		fruits1.add("Kiwi");

		// LinkedHashSet stores elements in the same order in which they are added
		System.out.println(fruits1.toString());
//////////////////////////////////////////////////////////////////////////////////

		//TreeSet implements Set Interface
		Set<String> fruits2 = new TreeSet<String>();

		fruits2.add("Banana");
		fruits2.add("Apple");
		fruits2.add("Kiwi");
		
		//TreeSet stores the elements in ascending order
		System.out.println(fruits2.toString());
//////////////////////////////////////////////////////////////////////////////////
		
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(2);
		set2.add(4);
		set2.add(6);
		set2.add(8);
		
		//Find union of two sets: (uncomment to see this work) (re-comment it again to see the intersection result present below)
//		set1.addAll(set2);
//		System.out.println(set1);
		
		//Intersection of two sets:
		set1.retainAll(set2);
		System.out.println(set1);
		
		//For Subset, use .contains() method.
	}

}
