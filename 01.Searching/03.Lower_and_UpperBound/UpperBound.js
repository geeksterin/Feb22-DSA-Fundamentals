let Upper_bound = function (arr, target, flag) {
    let result = -1;
    let low = 0, high = arr.length - 1;
    while (low <= high) {
        let mid = Math.floor((low + high) / 2);
        if (arr[mid] === target) {
            result = mid;
            if (flag === true) {
                low = mid + 1;
            }
        } else if (arr[mid] < target) {
            low = mid + 1;
        } else
            high = mid - 1;

    }
    return result;
}
let arr = [1, 2, 3, 4, 5, 5, 6, 6, 6, 6, 6, 7, 8, 9, 10, 11];
let target = 11;
console.log(Upper_bound(arr, target, true));
