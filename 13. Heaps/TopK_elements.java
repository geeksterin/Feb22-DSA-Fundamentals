
import java.util.*;

public class TopK_elements {
    static public void topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> (b.getValue() - a.getValue()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.add(entry);
        }

        List<Integer> res = new ArrayList<>();
        while (res.size() < k) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res.add(entry.getKey());
        }

        // print the res
        for (int i : res) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { -1, 11, 10, 3, 5, 9, -3, 0, 11, 11, 3, 11, 3, -1 };
        int k = 4;
        topKFrequent(arr, k);

    }
}
