public class queue {
    public static void main(String[] args) {
        int ar[] = new int[10];

        int front = -1,rear = -1;

        //enqueue
        if(rear >= ar.length){
            System.out.println("Queue is full");
        }
        else ar[++rear] = val;
        if(rear == 0){
            front++;
        }

        //dequeue
        if(front == -1){
            System.out.println("Queue is empty");
        }
        else System.out.println(ar[front++]);



    }
}
