
import java.util.ArrayList;
import java.util.List;

public class Subset {

    static void genSubset(List<List<Integer>> ans, int arr[], int start, List<Integer> curr) {
        // Every new function call means a new subset is generated.
        ans.add(new ArrayList<>(curr));
        // Loop ensures that at any given level we go through all the
        // elements
        for (int i = start; i < arr.length; i++) {
            curr.add(arr[i]);
            // Choosing the curr element for the subset
            genSubset(ans, arr, i + 1, curr);
            // Backtracking step
            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        List<List<Integer>> ans = new ArrayList<>();
        genSubset(ans, nums, 0, new ArrayList<>());
        System.out.println(ans);
    }
}
