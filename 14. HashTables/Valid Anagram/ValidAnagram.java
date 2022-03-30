import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// TC : O(nlgn) , SC: O(N)
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaXram";
        Map<String, String> map = new HashMap<>(2);

        char s1[] = s.toCharArray(); // O(N)
        Arrays.sort(s1); // O(NlgN)
        String sortedS = new String(s1); // O(1)

        map.put(sortedS, s); // O(1)

        char s2[] = t.toCharArray(); // O(N)
        Arrays.sort(s2); // O(NlgN)
        String sortedT = new String(s2);

        if (map.containsKey(sortedT)) {
            System.out.println("ANAGRAM");
        } else {
            System.out.println("NOT ANAGRAM");
        }

    }
}
