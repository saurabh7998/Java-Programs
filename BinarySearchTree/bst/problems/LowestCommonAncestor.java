package bst.problems;

public class LowestCommonAncestor {

	static class Node {
		Node left;
		Node right;
		int data;

		Node(int val) {
			data = val;
		}
	}

	static Node lca(Node node, int n1, int n2) {
		if (node == null)
			return null;

		// If both n1 and n2 are smaller than root, then LCA lies in left
		if (node.data > n1 && node.data > n2)
			return lca(node.left, n1, n2);

		// If both n1 and n2 are greater than root, then LCA lies in right
		else if (node.data < n1 && node.data < n2)
			return lca(node.right, n1, n2);

		else return node;
	}

	public static void main(String[] args) {

		Node root = new Node(2);
		root.left = new Node(1);
		root.right = new Node(3);

		root.right.left = new Node(4);
		root.right.right = new Node(5);

		root.right.right.right = new Node(6);

		Node ans = lca(root, 4, 6);
		System.out.println("Lowest Common Ancestor of 4 and 6 in the given BST is: " + ans.data);

	}

}
