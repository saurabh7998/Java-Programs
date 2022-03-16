package bst.implementation;

public class BST {

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

	static Node insertNode(Node root, int k) {
		if (root == null) {
			return new Node(k);
		}

		if (root.key < k) {
			root.right = insertNode(root.right, k);
		} else if (root.key > k) {
			root.left = insertNode(root.left, k);
		}
		
		//
		return root;

	}
	
	static Node deleteNode(Node root, int k) {
		if(root==null) {
			return root;
		}
		if(root.key>k) {
			root.left = deleteNode(root.left, k);
		}
		else if(root.key<k) {
			root.right = deleteNode(root.right, k);
		}
		
		//If root is equal to key 
		else {
			//If it has no right child, then the left child can be replaced at its place after its deletion
			if(root.right==null) return root.left;
			//If it has no left child, then the right child can be replaced at its place after its deletion
			else if(root.left==null) return root.right;
			
			//If it has both right and left child, then we need to find the successor node that will replace the deleted node
			else {
				Node succ=getSuccessor(root);
                root.key=succ.key;
                //Delete the previous occurrence of the replaced node
                root.right=deleteNode(root.right,succ.key);
			}
		}
		return root;
	}
	
	/**
	 * This function is to find the closest greater node to the node to be deleted:
	 * So we the greater element will be to the right of the node and
	 * closest greater element will be the leftmost element to the right of the node.
	 * @param root
	 * @return
	 */
	static Node getSuccessor(Node curr) {
		curr = curr.right;
		while(curr!=null && curr.left!=null) {
			curr = curr.left;
		}
		return curr;
	}
	
	
	
	static boolean searchNode(Node root, int k) {
		if(root==null) {
			return false;
		}
		
		if(root.key==k) {
			return true;
		}
		else if(root.key>k) {
			searchNode(root.left, k);
		}
		else if(root.key<k) {
			searchNode(root.right, k);
		}
		return false;
		
	}

	public static void main(String[] args) {

		//Node root = new Node(10);
		Node root = insertNode(null, 10);
		//Node right = insertNode(root, 11);
		insertNode(root, 11);
		
		System.out.println(root.key);
		//System.out.println(right.key);
		System.out.println(root.right.key);
		
		System.out.println(searchNode(root, 10));
		System.out.println(searchNode(root, 100));
		
		deleteNode(root, 11);
		System.out.println(searchNode(root, 11));
		
	}

}
