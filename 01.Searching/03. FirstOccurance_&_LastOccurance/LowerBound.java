public class LowerBound {
    static int lowerBound(int arr[], int target, boolean lowerbound) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                // we got the answer but storing it in tmp var and doing futher investigation.
                result = mid;
                // futher investagtion
                if (lowerbound == true) {
                    high = mid - 1;
                }
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
        System.out.println(lowerBound(arr, target, false));
    }
}