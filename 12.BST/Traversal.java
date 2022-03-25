import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node {
    public int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = null;
        right = null;
    }
}

public class Traversal {
    static void inorderTraversal(Node root) {
        Stack<Node> stk = new Stack<Node>();
        while (true) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            if (stk.empty())
                break;
            root = stk.peek();
            stk.pop();
            System.out.println(root.key);
            root = root.right;
        }
    }

    // Finding the KthSmallest in BST.
    static void KthSmallest(Node root, int k) {
        Stack<Node> stk = new Stack<Node>();
        while (true) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            if (stk.empty())
                break;
            root = stk.peek();
            stk.pop();
            if (--k == 0)
                break;
            root = root.right;
        }
        System.out.println(root.key);
    }

    // Validation of BST.
    static boolean ValidateBST(Node root) {
        Stack<Node> stk = new Stack<Node>();
        Node pre = null;
        while (true) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            if (stk.empty())
                break;
            root = stk.peek();
            stk.pop();
            if (pre != null && pre.key > root.key)
                return false;
            pre = root;
            root = root.right;
        }

        return true;
    }
}
