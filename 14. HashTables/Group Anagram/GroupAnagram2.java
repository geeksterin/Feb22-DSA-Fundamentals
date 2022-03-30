
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram2 {
    static public String mysort(String word) {
        char freq[] = new char[26];

        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                sb.append((char) ('a' + i)).append(freq[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        HashMap<String, List<String>> map = new HashMap<>();

        String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
        for (var word : strs) {
            String sword = mysort(word);

            if (map.containsKey(sword) == true) {
                map.get(sword).add(word);
            } else {
                map.put(sword, new ArrayList<>());
                map.get(sword).add(word);
            }
        }

        System.out.println(new ArrayList<>(map.values()));

    }
}
