##                              Stacks
---------------------------------------------------------------------------------------

1. Defining Stacks and creating stacks 
2. Inbuilt stack in java: https://www.geeksforgeeks.org/stack-class-in-java/

    Note: Please note that the Stack class in Java is a legacy class and inherits from Vector in Java. It is a thread-safe class and hence involves overhead when we do not need thread safety. It is recommended to use ArrayDeque for stack implementation as it is more efficient in a single-threaded environment.

3. Why does array start with index zero, infact why everything is zero-based in CSE
-   https://iq.opengenus.org/array-indices-start-from-1/ 



###                 Questions on Stacks:
------------------------------------------------------------------------------------------
    - Reverse a string using stack.
    - Reverse words in a sentence using stack.
    - Check balanced parenthesis. ()()((())) **
    - Min stack in O(1) space. ** -> Max, Avg, Mode.
    - https://leetcode.com/problems/valid-anagram/ -> example: s = "anagram", t = "nagaram"
    - https://www.geeksforgeeks.org/leaders-in-an-array/ ****

###  How to identitfy when to use stack.


"Hi how is this class going?"
"going? class this is how Hi"
Hint: Stack<> stk = new Stack<String>()