
public class findingElement {

    static int arr[] = { 1, 2, 10, 5, 6, 0, -1 };

    static void find(int idx, int target) {
        // Stopping condition
        if (arr[idx] == target) {
            System.out.println("Found element at: " + idx);
            return;
        }
        // recursive part
        find(idx + 1, target); //tail recursion.
    }

    public static void main(String[] args) {
        int target = -1;
        find(0, target);
    }
}
