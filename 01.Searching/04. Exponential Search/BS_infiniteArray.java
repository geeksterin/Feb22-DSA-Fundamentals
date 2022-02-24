public class BS_infiniteArray {
    static int bs(int[] arr, int target) {
        int low = 0, high = 1;

        // setting the upper limit aka high
        while (target >= arr[high]) {
            low = high; // optimization
            high = 2 * high;
            if (high >= arr.length - 1) {
                high = arr.length - 1;
                break;
            }
        }
        // regular binary Search.
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int target = 1001;
        System.out.println(bs(arr, target));
    }
}