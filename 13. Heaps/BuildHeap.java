public class BuildHeap {
    // To heapify a subtree rooted with node i which is
    // an index in arr[].Nn is size of heap
    static void heapify(int arr[], int n, int startIdx) {
        int curr = startIdx; // Initialize curr as root
        int l = 2 * startIdx + 1; // left = 2*i + 1
        int r = 2 * startIdx + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[curr])
            curr = l;

        // If right child is larger than curr so far
        if (r < n && arr[r] > arr[curr])
            curr = r;

        // If curr is not root
        if (curr != startIdx) {
            int swap = arr[startIdx];
            arr[startIdx] = arr[curr];
            arr[curr] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, curr);
        }
    }

    // Function to build a Max-Heap from the Array
    static void buildHeap(int arr[], int n) {
        // Index of last non-leaf node
        int startIdx = (n / 2) - 1;
        // Perform reverse level order traversal
        // from last non-leaf node and heapify
        // each node
        for (int i = startIdx; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    // A utility function to print the array
    // representation of Heap
    static void printHeap(int arr[], int n) {
        System.out.println(
                "Array representation of Heap is:");

        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver Code
    public static void main(String args[]) {
        // Binary Tree Representation
        // of input array
        // 1
        // / \
        // 3 5
        // / \ / \
        // 4 6 13 10
        // / \ / \
        // 9 8 15 17
        int arr[] = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
        int n = arr.length;
        buildHeap(arr, n);
        printHeap(arr, n);
    }
}
