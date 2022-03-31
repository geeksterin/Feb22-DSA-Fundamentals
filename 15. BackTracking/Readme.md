#                       BackTracking (Recursion IV)
-----------------------------------------------------------------------------------
**Defination** :
- Backtracking is an algorithm for finding all solutions by exploring all potential candidates. If the solution candidate turns to be not a solution (or at least not the last one), backtracking algorithm discards it by making some changes on the previous step, i.e. backtracks and then try again.

**Where is BackTracking Applicable**
- Where there is atleast 2 choices to make and we are interested in finding all the solutions and not just one or the most optimal one.



Let us first review the problems of Permutations / Combinations / Subsets, since they are quite similar to each other and there are some common strategies to solve them.

First, their solution space is often quite large:

Permutations: N!N!.

Combinations: C_N^k = \frac{N!}{(N - k)! k!}C 
N
k
​
 = 
(N−k)!k!
N!
​
 

Subsets: 2^N2 
N
 , since each element could be absent or present.

Given their exponential solution space, it is tricky to ensure that the generated solutions are complete and non-redundant. It is essential to have a clear and easy-to-reason strategy.

There are generally three strategies to do it:

Recursion

Backtracking

Lexicographic generation based on the mapping between binary bitmasks and the corresponding
permutations / combinations / subsets.

As one would see later, the third method could be a good candidate for the interview because it simplifies the problem to the generation of binary numbers, therefore it is easy to implement and verify that no solution is missing.

Besides, this method has the best time complexity, and as a bonus, it generates lexicographically sorted output for the sorted inputs.

- https://leetcode.com/problems/binary-tree-paths/ 
- https://leetcode.com/problems/subsets/ (I,II)
- https://leetcode.com/problems/permutations/ 
- 


https://leetcode.com/problems/subsets/discuss/27281/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partitioning) 
