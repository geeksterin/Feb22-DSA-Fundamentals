public class sortedArrayToBST {
      static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
      }
    }
     

     static TreeNode solve(int[] arr, int i,int j){
        if(i>j) return null;
        int mid = i+(j-i)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = solve(arr,i,mid-1);
        root.right = solve(arr,mid+1,j);
        return root;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        TreeNode root = solve(arr,0,arr.length-1);
        System.out.println(root.val);
        int3 a = 10;
    }
}
