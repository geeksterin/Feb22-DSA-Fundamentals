import java.util.*;

public class largestSum {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(
                Arrays.asList(-1, 10, 2, 3, 9, 5, 6, 11));

        // Max-heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // 1. Build-heap O(N)
        pq.addAll(al); // give this priority over looping.

        // 2. Heapify O(NlgN)
        // for (int i = 0; i < al.size(); i++) {
        // pq.add(al.get(i));
        // }

        for (Integer x : pq) {
            System.out.print(x + ",");
        }

        System.out.println();
        int largest = pq.peek();
        pq.poll();
        int second_largest = pq.peek();

        System.out.println(largest + second_largest);

    }
}
