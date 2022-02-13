function linearSearch(arr, key) {
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === key) {
            return i
        }
    }
    return -1
}

//Driver code
let arr = [1, 2, 10, 11, 12, 15, 16]
console.log(linearSearch(arr, 10));