#                           Heap Data-Structure 
----------------------------------------------------------------------------------------------
A Heap is a special Tree-based data structure in which the tree is a complete binary tree. Generally, Heaps can be of two types:

- **Max-Heap**: In a Max-Heap the key present at the root node must be greatest among the keys present at all of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.

- **Min-Heap**: In a Min-Heap the key present at the root node must be minimum among the keys present at all of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.
    - Code: https://www.geeksforgeeks.org/min-heap-in-java/#:~:text=A%20Min%2DHeap%20is%20a,child%20at%20index%202k%20%2B%202. 


***Array representation of CBT***
left child = (2*root)+1
right child = (2*root)+2;
parent = floor((i-1)/2)
//https://www.geeksforgeeks.org/binary-tree-array-implementation/


https://www.geeksforgeeks.org/g-fact-42/

https://www.geeksforgeeks.org/why-is-binary-heap-preferred-over-bst-for-priority-queue/ 

***Asked In: Microsoft, Adobe:***
- https://www.geeksforgeeks.org/implement-stack-using-priority-queue-or-heap/