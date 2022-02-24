
public class BinarySearch {
    // TC : O(lgN)
    static int bs(int arr[], int target) {

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            // int mid = (low + high) / 2; Potential Integer Overflow
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        // if we reach here, then element was
        // not present
        System.out.println("Target not found");
        return 0; // dummy number.
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 9, 11, 13 };
        int target = 11;
        System.out.println(bs(arr, target));
    }

}