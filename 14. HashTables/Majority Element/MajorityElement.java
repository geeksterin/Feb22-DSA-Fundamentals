import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        int res = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > nums.length / 2) {
                res = num;
                break;
            }
        }

        System.out.println(res);

    }
}
