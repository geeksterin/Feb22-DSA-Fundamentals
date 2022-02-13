
// JavaScript code to Segregate 0s and 1s in an array
// Approch 1: Using a count variable 
//TC: O(N).
//SC: O(1)
let method1 = function segregate0and1(arr, n) {
    let count = 0; // Counts the no of zeros in arr
    for (let i = 0; i < n; i++) {
        if (arr[i] == 0)
            count++;
    }
    // Loop fills the arr with 0 until count
    for (let i = 0; i < count; i++)
        arr[i] = 0;

    // Loop fills remaining arr space with 1
    for (let i = count; i < n; i++)
        arr[i] = 1;
}

//Approch 2 : Using two pointer approch.
//TC: O(N).
//SC : O(1).
let method2 = function segregate0and1(arr, size) {
    /* Initialize left and right indexes */
    let left = 0, right = size - 1;
    while (left < right) {
        /* Increment left index while we see 0 at left */
        while (arr[left] == 0 && left < right)
            left++;

        /* Decrement right index while we see 1 at right */
        while (arr[right] == 1 && left < right)
            right--;

        /* If left is smaller than right then there is a 1 at left
        and a 0 at right. Exchange arr[left] and arr[right]*/
        if (left < right) {
            arr[left] = 0;
            arr[right] = 1;
            left++;
            right--;
        }
    }
}

// Driver Code.
let arr = [0, 1, 0, 1, 1, 1];
let n = arr.length;

method1(arr, n);
console.log(arr);

method2(arr, n);
console.log(arr);



