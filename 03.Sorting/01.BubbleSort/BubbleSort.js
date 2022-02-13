// Bubble sort Implementation using Javascript
function bubbleSort(arr) {

    for (var i = 0; i < arr.length; i++) {
        // Last i elements are already in place
        for (var j = 0; j < (arr.length - i - 1); j++) {

            // Checking if the item at present iteration
            // is greater than the next iteration
            if (arr[j] > arr[j + 1]) {

                // If the condition is true then swap them
                var temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
    // Print the sorted array
    console.log(arr)
}

//Optimized Bubble sort
function OptimizedBubbleSort(arr) {
    var i, j;
    var len = arr.length;
    var isSwapped = false;

    for (i = 0; i < len; i++) {
        isSwapped = false;
        for (j = 0; j < len; j++) {
            if (arr[j] > arr[j + 1]) {
                //swapping in js
                [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
                isSwapped = true;
            }
        }

        // IF no two elements were swapped by inner loop, then break
        if (!isSwapped) {
            break;
        }
    }

    // Print the array
    console.log(arr)
}





//Drive code.
// This is our unsorted array
var arr = [4, 43, 55, 63, 5, 6, 5, 47];
// bubbleSort(arr);


var arr = [243, 45, 23, 356, 3, 5346, 35, 5];
OptimizedBubbleSort(arr)
