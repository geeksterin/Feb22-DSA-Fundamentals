##                              Binary Search 
-------------------------------------------------------------------------------------------------------
- Binary Search Animation : https://www.interviewbit.com/courses/programming/topics/binary-search/

- It's a efficient searching Algorithm, With every iteration we reduce the search space by half.
    - The Time Complexity in WORST CASE is O(lgN)
    - The Space Complexity is O(1)

- At every step we compare mid element with the target, if mid element is not the target then we proceed to the half where target if present should be at and discard the another half.

- After all the iterations when low == high, if target is present in the array then it should be present at low == high == mid , if not then we can surely say that target is not present in the array.

- Binary Search will work with high = arr.length and high = arr.length -1
    - ceil and floor and rounding function all will work, given you modify the binary search code a little for which you can refer below link.
    https://leetcode.com/discuss/interview-question/1322500/5-variations-of-Binary-search-(A-Self-Note) 



##                                        Exponential Search 
-------------------------------------------------------------------------------------------------------
-   Exponential search is an algorithm used for searching sorted, unbounded/infinite arrays. The idea is to determine a range that the target value resides in and perform a binary search within that range. Assuming that the array is sorted in ascending order, it looks for the first exponent, k, where the value 2k is greater than the search key. Now 2k and 2k-1 becomes the upper bound and lower bound for the binary search algorithm, respectively.

###    Performance
-   The exponential search takes O(log(i)) time, where i is the target’s position in the array when the target is in the array or position where the target should be if it isn’t in the array.

We can also use the exponential search to search in bounded arrays. It can even out-perform binary search when the target is near the beginning of the array. This is because the exponential search will run in O(log(i)) time, where i is the index of the element being searched for in the array, whereas binary search would run in O(log(n)) time, where n is the total number of elements in the array.

- Read More : https://www.techiedelight.com/exponential-search/ 
