package tree.basic.implementation;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree {

	static class Node {
		int key;
		Node left;
		Node right;

		Node(int key) {
			this.key = key;
			left = null;
			right = null;
		}
	}

	static void inOrderTraversal(Node root) {
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.print(root.key + " ");
			inOrderTraversal(root.right);
		}
	}

	static void preOrderTraversal(Node root) {
		if (root != null) {
			System.out.print(root.key + " ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}

	static void postOrderTraversal(Node root) {
		if (root != null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.key + " ");
		}

	}

	static void levelOrderTraversal(Node root) {
		Queue<Node> q = new ArrayDeque<Node>();
		q.add(root);

		while (q.isEmpty() == false) {
			Node curr = q.poll();
			System.out.print(curr.key + " ");

			if (curr.left != null) {
				q.add(curr.left);

			}
			if (curr.right != null) {
				q.add(curr.right);
			}
		}
	}

	static void lineByLineTraversal(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);

		while (q.size() > 1) {

			Node curr = q.poll();
			if (curr == null) {
				System.out.println();
				q.add(null);
				continue;
			}

			System.out.print(curr.key + " ");

			if (curr.left != null) {
				q.add(curr.left);
			}
			if (curr.right != null) {
				q.add(curr.right);
			}
		}
	}

	static void spiralTraversal(Node root) {

		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();

		s1.push(root);

		while (s1.isEmpty() == false || s2.isEmpty() == false) {

			while (s1.isEmpty() == false) {
				Node curr = s1.pop();
				System.out.print(curr.key + " ");

				if (curr.left != null) {
					s2.push(curr.left);
				}
				if (curr.right != null) {
					s2.push(curr.right);
				}
			}

			while (s2.isEmpty() == false) {
				Node curr = s2.pop();
				System.out.print(curr.key + " ");

				if (curr.right != null) {
					s1.push(curr.right);
				}
				if (curr.left != null) {
					s1.push(curr.left);
				}
			}

		}

	}

	static void printLevelK(Node root, int k) {
		if (root == null) {
			return;
		}

		if (k == 0) {
			System.out.print(root.key + " ");
		} else {
			printLevelK(root.left, k - 1);
			printLevelK(root.right, k - 1);
		}
	}

	public static void printLeftView(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (q.isEmpty() == false) {
			int count = q.size();
			for (int i = 0; i < count; i++) {
				Node curr = q.poll();
				if (i == 0)
					System.out.print(curr.key + " ");
				if (curr.left != null)
					q.add(curr.left);
				if (curr.right != null)
					q.add(curr.right);
			}
		}
	}

	static boolean isCSum(Node root) {
		if (root == null) {
			return true;
		}
		if (root.right == null && root.left == null) {
			return true;
		}

		int sum = 0;
		if (root.left != null) {
			sum += root.left.key;
		}
		if (root.right != null) {
			sum += root.right.key;
		}
		return (root.key == sum && isCSum(root.left) && isCSum(root.right));
	}

	static int getHeightOfTree(Node root) {
		if (root == null) {
			return 0;
		}

		int height = Math.max(getHeightOfTree(root.left), getHeightOfTree(root.right)) + 1;
		return height;
	}

	static int getWidthOfTree(Node root) {
		if (root == null)
			return 0;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int res = 0;
		while (q.isEmpty() == false) {
			int count = q.size();
			res = Math.max(res, count);
			for (int i = 0; i < count; i++) {
				Node curr = q.poll();
				if (curr.left != null)
					q.add(curr.left);
				if (curr.right != null)
					q.add(curr.right);
			}
		}
		return res;
	}

	// Diameter is the path which has max number of nodes.
	static int diameterOfBinaryTree(Node root) {
        if(root==null)
            return 0;
        int leftHeight=getHeightOfTree(root.left);
        int rightHeight=getHeightOfTree(root.right);
        
        int ldia=diameterOfBinaryTree(root.left);
        int rdia=diameterOfBinaryTree(root.right);
        
        return Math.max(leftHeight+rightHeight,Math.max(ldia,rdia));
        
    }

	static boolean checkIfBalancedTree(Node root) {
		if (root == null)
			return true;
		int lh = getHeightOfTree(root.left);
		int rh = getHeightOfTree(root.right);
		return (Math.abs(lh - rh) <= 1 && checkIfBalancedTree(root.left) && checkIfBalancedTree(root.right));
	}

	static int getSize(Node root) {
		if (root == null) {
			return 0;
		}

		return 1 + getSize(root.left) + getSize(root.right);
	}

	static int getMaxValueNode(Node root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}

		return Math.max(root.key, Math.max(getMaxValueNode(root.left), getMaxValueNode(root.right)));
	}

	public static void main(String[] args) {

		Node root = new Node(10);

		root.right = new Node(30);
		root.left = new Node(20);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);

		System.out.println("InOrder Traversal:");
		inOrderTraversal(root);
		System.out.println("");
		System.out.println("PreOrder Traversal:");
		preOrderTraversal(root);
		System.out.println("");
		System.out.println("PostOrder Traversal:");
		postOrderTraversal(root);
		System.out.println("");
		System.out.println("Level Order Traversal:");
		levelOrderTraversal(root);
		System.out.println("");
		System.out.println("LineByLine Level Order Traversal:");
		lineByLineTraversal(root);
		System.out.println("");
		System.out.println("Spiral Traversal of Tree:");
		spiralTraversal(root);
		System.out.println("");
		System.out.println("Left View of Tree:");
		printLeftView(root);

		System.out.println("\n");
		System.out.println("The height of tree is: " + getHeightOfTree(root));

		System.out.println("");
		System.out.println("The width of tree is: " + getWidthOfTree(root));
		
		System.out.println("");
		System.out.println("Diameter of tree is: " + diameterOfBinaryTree(root));

		System.out.println("");
		System.out.println("Count of Nodes in the tree is: " + getSize(root));

		System.out.println("");
		System.out.println("Max value of Node in the Tree is: " + getMaxValueNode(root));

		System.out.println("");
		System.out.println("Nodes on level 2 of the tree: ");
		printLevelK(root, 2);

		System.out.println("");

		/////// Tree 2///////
		Node root2 = new Node(20);
		root.left = new Node(8);
		root.right = new Node(12);
		root.right.left = new Node(3);
		root.right.right = new Node(9);

		System.out.println("");
		System.out.println("Every parent node of tree with root '" + root2.key
				+ "' is equal to the sum of the values of its children: " + isCSum(root2));
		System.out.println("Every parent node of tree with root '" + root.key
				+ "' is equal to the sum of the values of its children: " + isCSum(root));

		System.out.println("");
		System.out.println("The tree with root " + root.key + " is balanced: " + checkIfBalancedTree(root));
		System.out.println("The tree with root " + root2.key + " is balanced: " + checkIfBalancedTree(root2));

	}

}
