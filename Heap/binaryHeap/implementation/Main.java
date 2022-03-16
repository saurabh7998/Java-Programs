package binaryHeap.implementation;

public class Main {

	public static void main(String[] args) {
		MinHeap h = new MinHeap(11);
		
		h.insert(3);
		h.insert(2);
		
		h.deleteKey(0);
		
		h.insert(15);
		h.insert(20);
		
		System.out.println(h.extractMin());
		
		h.decreaseKey(2, 1);
		
		System.out.println(h.extractMin());
	}
}
