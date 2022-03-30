import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static void main(String[] args) {
        HashMap<String, List<String>> map = new HashMap<>();

        String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };

        for (String word : strs) {
            char cword[] = word.toCharArray();
            Arrays.sort(cword);
            String s = new String(cword);

            if (map.containsKey(s) == true) {
                map.get(s).add(word);
            } else {
                map.put(s, new ArrayList<>());
                map.get(s).add(word);
            }

        }

        System.out.println(new ArrayList<>(map.values()));

    }
}