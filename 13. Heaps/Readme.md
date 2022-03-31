#                           Heap Data-Structure 
----------------------------------------------------------------------------------------------
A Heap is a special Tree-based data structure in which the tree is a complete binary tree. Generally, Heaps can be of two types:

- **Max-Heap**: In a Max-Heap the key present at the root node must be greatest among the keys present at all of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.

- **Min-Heap**: In a Min-Heap the key present at the root node must be minimum among the keys present at all of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.
    - Code: https://www.geeksforgeeks.org/min-heap-in-java/#:~:text=A%20Min%2DHeap%20is%20a,child%20at%20index%202k%20%2B%202. 

Reference for Heap Collection: https://www.geeksforgeeks.org/priority-queue-class-in-java/ 


**Array representation of CBT**
----------------------------------------------------------------------------------------------
- left child = (2*root)+1
- right child = (2*root)+2;
- parent = floor((i-1)/2)
- Internal Nodes ranges from: 0 to floor([N/2]-1)
- Leaf Nodes ranges from : floor(N/2) to N-1

**Heapify Method** : 

- PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
- PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
- PriorityQueue<Integer> minheap = new PriorityQueue<>(ArrayList<Integers>);

**Time Complexity of heaps**
----------------------------------------------------------------------------------------------
- Insertion: O(lgN)
- Deletion: O(N)
- Deletion of min/max node: O(lgN)
- GetMin/GetMax : O(1)
- Searching : O(N)


1. https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/ 
2. https://leetcode.com/problems/kth-largest-element-in-an-array/ 




Additional Resources to learn:
----------------------------------------------------------------------------------------------
1. https://www.geeksforgeeks.org/binary-tree-array-implementation/
2. https://www.geeksforgeeks.org/g-fact-42/
3. https://www.geeksforgeeks.org/why-is-binary-heap-preferred-over-bst-for-priority-queue/ 