package hashing.chaining;

import java.util.ArrayList;
import java.util.LinkedList;

public class ChainingImplementation {

	int BUCKET;
	ArrayList<LinkedList<Integer>> table;

	public ChainingImplementation(int b) {
		// TODO Auto-generated constructor stub
		BUCKET = b;
		table = new ArrayList<LinkedList<Integer>>();
		for (int i = 0; i < b; i++) {
			table.add(new LinkedList<Integer>());
		}
	}

	void insert(int key) {
		int i = key % BUCKET;
		table.get(i).add(key);
	}

	boolean search(int key) {
		int i = key % BUCKET;
		return table.get(i).contains(key);
	}

	void delete(int key) {
		int i = key % BUCKET;
		table.get(i).remove(key);
	}

}

class Main {
	public static void main(String[] args) {
		
		ChainingImplementation ChainImp = new ChainingImplementation(7);
		
		ChainImp.insert(10);
		ChainImp.insert(20);
		ChainImp.insert(15);
		ChainImp.insert(7);
		
		System.out.println(ChainImp.search(15));
		System.out.println(ChainImp.search(12));
		
		ChainImp.delete(20);
		System.out.println(ChainImp.search(20));
		

	}
}
