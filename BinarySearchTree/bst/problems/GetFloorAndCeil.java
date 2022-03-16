package bst.problems;



/**
 * This code finds the floor and ceil value of an input node in the BST.
 * Floor of an item is the value which is closest and smaller/equal(in the BST) to the item's value.
 * Ceil of an item is the value which is closest and greater/equal(in the BST) to the item's value;
 *
 * @author saurabh
 *
 */
public class GetFloorAndCeil {

	static class Node {
		int key;
		Node right;
		Node left;

		Node(int k) {
			key = k;
		}
	}

	public static Node floor(Node root, int x) {
		Node res = null;
		while (root != null) {
			if (root.key == x)
				return root;
			else if (root.key > x)
				root = root.left;
			else {
				res = root;
				root = root.right;
			}
		}
		return res;
	}

	public static Node ceil(Node root, int x) {
		Node res = null;
		while (root != null) {
			if (root.key == x)
				return root;
			else if (root.key < x)
				root = root.right;
			else {
				res = root;
				root = root.left;
			}
		}
		return res;
	}

	public static void main(String[] args) {

		Node root = new Node(15);
		root.left = new Node(5);
		root.left.left = new Node(3);
		root.right = new Node(20);
		root.right.left = new Node(18);
		root.right.left.left = new Node(16);
		root.right.right = new Node(80);
		int x = 17;

		System.out.println(floor(root, x).key);
		System.out.println(ceil(root, x).key);

	}
}
