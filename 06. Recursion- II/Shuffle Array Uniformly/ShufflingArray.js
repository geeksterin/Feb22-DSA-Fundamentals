function shuffle(array) {
    let currentIndex = array.length, randomIndex;

    // While there remain elements to shuffle...
    while (currentIndex != 0) {

        // Pick a remaining element...
        randomIndex = Math.floor(Math.random() * currentIndex);
        currentIndex--;

        // swapping the two.
        [array[currentIndex], array[randomIndex]] = [
            array[randomIndex], array[currentIndex]];
    }

    return array;
}

// Used like so
var arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 11];
shuffle(arr);
console.log(arr);