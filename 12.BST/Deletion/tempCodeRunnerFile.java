 // public int rangeSumBST(Node root, int L, int R) {
    // if (root == null) {
    // return 0;
    // }
    // int sum = 0;
    // // left child is a possible candidate.
    // if (root.val > L) {
    // sum += rangeSumBST(root.left, L, R);
    // }
    // if (root.val < R) {
    // sum += rangeSumBST(root.right, L, R);
    // } // right child is a possible candidate.
    // if (root.val >= L && root.val <= R) {
    // sum += root.val;
    // } // count root in.
    // return sum;
    // }