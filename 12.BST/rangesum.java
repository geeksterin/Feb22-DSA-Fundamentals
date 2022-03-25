class Node {
    int key;
    Node left, right;

    Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

public class rangesum {

    static int sum = 0;

    static public int rangeSum(Node root, int L, int R) {
        if (root == null)
            return 0;

        // processing the root.
        if (root.key >= L && root.key <= R) {
            sum += root.key;
        }
        rangeSum(root.left, L, R);
        rangeSum(root.right, L, R);
        return sum;
    }

    public static void main(String[] args) {
        int L = 2, R = 10;
        Node root = null;
        rangeSum(root, L, R);
    }
}
