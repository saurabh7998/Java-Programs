package bst.implementation;

import java.util.TreeMap;

public class JavaTreeMap {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		
		tm.put(10, "Saurabh");
		tm.put(20, "Aneesh");
		tm.put(30, "Devendra");
		tm.put(40, "Sahil");
		
		System.out.println(tm.containsKey(10));
		System.out.println(tm.containsKey(1));
		System.out.println(tm.containsValue("Saurabh"));
		System.out.println(tm.floorKey(25));
		System.out.println(tm.ceilingEntry(15));
		
		System.out.println(tm);
		
	}

}
