public class UpperBound {
    static int upperBound(int arr[], int target, boolean flag) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                //futher investigation
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else
                high = mid - 1;

        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 2, 3, 4, 5, 6, 6, 7, 7, 7 };
        int target = 2;
        System.out.println(upperBound(arr, target, true));
    }
}