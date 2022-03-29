
import java.util.*;


// O(N) + O(k.lgN) => O(N)
public class KthLargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(-1, 11, 10, 3, 5, 9, -3, 0));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Build heap method O(N)
        pq.addAll(al);

        for (Object x : pq) {
            System.out.print(x + ",");
        }
        System.out.println();

        int k = 3;
        while (k-- > 0) {
            // System.out.println(pq.peek());
            pq.poll();
        }
        System.out.println("Kth Largest element: " + pq.peek());

    }
}
