
import java.util.*;

/* Class containing left and right child of current
Node and key value*/
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

    static public List<Integer> preorderTraversal(Node root) {
        Stack<Node> stk = new Stack<Node>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        while (true) {
            // To traverse the left sub-tree till it goes to null
            while (root != null) {
                ans.add(root.key); // processing.
                stk.push(root);
                root = root.left;
            }
            if (stk.empty())
                break;
            root = stk.peek();
            stk.pop();
            root = root.right;
        }
        return ans;
    }

    static List<Integer> inorderTraversal(Node root) {
        Stack<Node> stk = new Stack<Node>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while (true) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            if (stk.empty())
                break;
            root = stk.peek();
            stk.pop();
            ans.add(root.key);
            root = root.right;
        }
        return ans;
    }

    static void postOrderIterative2(Node root) {
        // Two stacks as used in explanation
        Stack<Node> s1, s2;
        // Create two stacks
        s1 = new Stack<>();
        s2 = new Stack<>();
        if (root == null)
            return;

        // push root to first stack
        s1.push(root);
        // Run while first stack is not empty
        while (!s1.isEmpty()) {
            // Pop an item from s1 and push it to s2
            Node temp = s1.pop();
            s2.push(temp);

            // Push left and right children of
            // removed item to s1
            if (temp.left != null)
                s1.push(temp.left);
            if (temp.right != null)
                s1.push(temp.right);
        }
        // Print all elements of second stack
        while (!s2.isEmpty()) {
            Node temp = s2.pop();
            System.out.print(temp.key + " ");
        }
    }

    static List<Integer> postorderTraversal(Node root) {
        Stack<Node> stk = new Stack<Node>();
        ArrayList<Integer> ans = new ArrayList<Integer>();

        while (true) {
            if (root != null) {
                stk.push(root);
                root = root.left;
            } else {
                if (stk.empty())
                    break;
                // main logic
                root = stk.peek().right;
                if (root == null) {
                    Node last = null;
                    while (!stk.empty() && stk.peek().right == last) {
                        last = stk.peek();
                        stk.pop();
                        ans.add(last.key);
                    }
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
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

        System.out.println(preorderTraversal(root));
        System.out.println(inorderTraversal(root));
        postOrderIterative2(root);

        System.out.println();
        System.out.println(postorderTraversal(root));

    }
}
