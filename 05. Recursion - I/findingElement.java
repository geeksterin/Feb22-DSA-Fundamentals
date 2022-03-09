
public class findingElement {

    // static int arr[] = { 1, 2, 10, 5, 6, 0, -1 };

    static void recursiveSearch(int idx, int target, int arr[]) {
        // Base case.
        if (arr.length == idx) {
            System.out.println("Element not present!!");
            return;
        }

        if (arr[idx] == target) {
            System.out.println("Found target at " + idx);
            return;
        }

        recursiveSearch(idx + 1, target, arr);
    }

    public static void main(String[] args) {
        int target = 1;
        int arr[] = { 1, 2, 10, 5, 6, 0, -1 };
        recursiveSearch(0, target, arr);

    }
}
