import java.util.*;

/* Class containing left and right child of current
node and key value*/
class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

// A Java program to introduce Binary Tree
public class BinaryTree {

	public static void preorder(Node root) {
		// Base case => to check for null roots
		if (root == null)
			return;

		System.out.print(root.key + ",");
		preorder(root.left);
		preorder(root.right);
	}

	public static void inorder(Node root) {
		if (root == null)
			return;

		inorder(root.left);
		System.out.print(root.key + ",");
		inorder(root.right);

	}

	public static void postOrder(Node root) {
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.key + ",");

	}

	static int getHeight(Node node) {
		if (node.left == null && node.right == null)
			return 0;
		else {
			/* compute the depth of each subtree */
			int lheight = getHeight(node.left);
			int rheight = getHeight(node.right);

			/* use the larger one */
			if (lheight >= rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}

	static void print_leafNodes(Node root) {
		if (root == null)
			return;

		if (root.left == null && root.right == null) {
			System.out.println("LeafNode:" + root.key);
		}
		print_leafNodes(root.left);
		print_leafNodes(root.right);
	}

	// static void count_leafNodes(Node root){
	// if(root == null) return;

	// if(root.left == null && root.right==null){
	// return 1;
	// }
	// int leftCount = count_leafNodes(root.left);
	// int rightCount = count_leafNodes(root.right);
	// return leftCount+ rightCount;
	// }

	static int get_count(Node root) {
		if (root == null) {
			return 0;
		}
		int leftCount = get_count(root.left);
		int rightCount = get_count(root.right);
		return 1 + leftCount + rightCount;
	}

	static int get_leaf(Node root) {
		if (root.left == null && root.right == null) {
			return 1;
		}
		return get_leaf(root.left) + get_leaf(root.right);
	}

	static boolean pathSum(Node root, int Tsum) {
		if (root == null)
			return false;
		if (root.key == Tsum && root.left == null && root.right == null)
			return true;

		return pathSum(root.left, Tsum - root.key) || pathSum(root.right, Tsum - root.key);
	}

	static int levelSoFar = 0;

	// Printing the left view nodes only.
	static void leftView(Node root, int currlevel) {

		if (root == null)
			return;

		if (currlevel > levelSoFar) {
			// reached a new level
			System.out.println(root.key);
			levelSoFar++; // indicates that i have visited this level before
		}

		leftView(root.left, currlevel + 1);
		leftView(root.right, currlevel + 1);
	}

	// Try for rightView

	// level order traversal : Iterative way.
	// https://www.geeksforgeeks.org/level-order-tree-traversal/

	// Print the kth Level only.
	static void PrintKthLevel(Node root, int k) {
		if (root == null)
			return;

		if (k == 0) {
			System.out.print(root.key + " ");
		}
		PrintKthLevel(root.left, k - 1);
		PrintKthLevel(root.right, k - 1);
	}

	// level order traversal : Recursive way
	// TC: O(N+h)
	// SC: O(depth)
	static void levelTraversal(Node root) {
		int h = getHeight(root);

		for (int i = 0; i <= h; i++) {
			PrintKthLevel(root, i);
			System.out.println();
		}
	}

	// level order traversal : Iterative way
	static void LevelOrderTraversal(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			int k = q.size();
			while (k > 0) {
				Node front = q.poll();
				// Adding valid left child
				if (front.left != null) {
					q.add(front.left);
				}
				// Adding valid right child
				if (front.right != null) {
					q.add(front.right);
				}
				k--;
				System.out.print(front.key + ",");
			}
			System.out.println();
		}
	}

	static void LeftViewOfTree(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			int k = q.size();
			for (int i = 0; i < k; i++) {
				Node front = q.poll();
				if (i == 0) {
					System.out.print(front.key + ",");
				}

				if (front.left != null) {
					q.add(front.left);
				}
				if (front.right != null) {
					q.add(front.right);
				}
			}
			System.out.println();
		}
	}

	// level order traversal : Iterative way
	static void AvgOfLevel(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			int k = q.size();
			int sum = 0;
			int N = k;
			while (k > 0) {
				Node front = q.poll();
				sum += front.key;
				// Adding valid left child
				if (front.left != null) {
					q.add(front.left);
				}
				// Adding valid right child
				if (front.right != null) {
					q.add(front.right);
				}
				k--;
			}
			System.out.print((float) sum / N);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Node root = new Node(1);

		/* create root */
		// root = new Node(1);

		/*
		 * following is the tree after above statement
		 * 
		 * 1
		 * / \
		 * null null
		 */

		root.left = new Node(2);
		root.right = new Node(3);

		/*
		 * 2 and 3 become left and right children of 1
		 * 1
		 * / \
		 * 2 3
		 * / \ / \
		 * null null null null
		 */

		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		/*
		 * 4 becomes left child of 2
		 * 1
		 * / \
		 * 2 3
		 * / \ / \
		 * 4 5 null 6
		 * / \
		 * null null
		 */

		AvgOfLevel(root);
		// LevelOrderTraversal(root);
		// System.out.println(get_count(root));
		// print_leafNodes(root);
		// levelTraversal(root);
		// PrintKthLevel(root, 2);
		// LevelOrderTraversal(root);
		// LeftViewOfTree(root);
		// leftView(root,0);
		// preorder(root);
		// System.out.println();
		// postOrder(root);
		// System.out.println();
		// inorder(root);

		// System.out.println(maxDepth(root));
		// System.out.println(get_count(root));
	}
}
