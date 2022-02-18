let firstOccurance = function (arr, target, flag) {
    let result = -1;

    let low = 0, high = arr.length - 1;

    while (low <= high) {
        let mid = Math.floor((low + high) / 2);

        if (arr[mid] === target) {
            //we got the answer but storing it in tmp var and doing futher investigation.
            result = mid;
            //futher investagtion
            if (flag === true)
                high = mid - 1;
        }
        else if (arr[mid] < target) {
            low = mid + 1;
        } else
            high = mid - 1;

    }
    return result;
}
let arr = [1, 2, 3, 4, 5, 5, 6, 6, 6, 6, 6, 7, 8, 9, 10, 11];
let target = 6;
console.log(firstOccurance(arr, target, false));
