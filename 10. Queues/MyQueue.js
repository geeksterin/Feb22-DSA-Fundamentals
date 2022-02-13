class CircularQueue {
    constructor(size) {
        this.data = [];
        this.size = size;
        this.length = 0;
        this.front = 0;
        this.rear = -1;
    }
    isEmpty() {
        return (this.length == 0)
    }
    enqueue(element) {
        if (this.length >= this.size)
            console.log("full");
        //rear=(rear+1)%size;  
        this.data[(this.rear + 1) % this.size] = element;// data[0]=10
        this.length++;
    }

    print() {
        for (let i = 0; i < this.data.length; i++) {
            console.log[this.data[i]];
        }
    }

    getfront() {
        if (this.isEmpty()) {
            console.log("no element in circular queue");
        }
        return this.data[(this.front) % (this.size)];
    }

    dequeue() {
        if (this.isEmpty())
            console.log("no element");
        const value = this.getfront();
        this.data[this.front % this.size] = null;
        this.front++;
        this.length--;
        console.log(value);
    }
}

//Driver Code.
let cq = new CircularQueue(5);
cq.enqueue(10);
cq.enqueue(15);
cq.enqueue(16);
cq.enqueue(17);
cq.enqueue(18);
console.log("deleted element ");
cq.dequeue();
