##                       Recursion - III
----------------------------------------------------------------

###   Merge Sort vs Quick Sort
----------------------------------------------------------------

- 10 min excercise for you guys.
https://www.geeksforgeeks.org/quicksort-better-mergesort/


### Master's Theorem on Divide and Conquer
---------------------------------------------------------------
``` T(n) = aT(n/b) + f(n)
    where: n = size of input
           a = number of subproblems in the recursion / constant
           n/b = size of each subproblem. All subproblems are assumed to have the same size.
           f(n) = cost of the work done outside the recursive call, which includes the cost of dividing the problem and cost of merging the solutions 
Here, a ≥ 1 and b > 1 are constants, and f(n) is an asymptotically positive function.

```
- Practice Questions: https://www.csd.uwo.ca/~mmorenom/CS433-CS9624/Resources/master.pdf 

1. RandomQuickSort
2. Merge VS QUick
3. Master Theorm and TC of merge and quick 
4. Counting Sort.
