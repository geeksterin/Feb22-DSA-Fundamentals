
public class BinarySearch {
    static int bs(int arr[], int target) {

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            // int mid = (low + high) / 2;
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
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 11 };
        int target = 11;
        System.out.println(bs(arr, target));
    }

}