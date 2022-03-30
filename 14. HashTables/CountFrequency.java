import java.util.HashMap;
import java.util.Map;

// TC: O(N) , SC: O(N)
public class CountFrequency {
    public static void main(String[] args) {
        String arr[] = { "arun", "singh", "roshan", "arun", "yadav", "nav", "singh" };
        Map<String, Integer> map = new HashMap<>(); // default cap 11 , load_factor = 0.75

        // Adding element into hashmap
        for (String word : arr) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Iterating over hashmap
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}