public class Frequency {
    static int FrequencyCount(int arr[], int target, boolean flag) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                if (flag == true) {
                    low = mid + 1;
                } else
                    high = mid - 1;
            }

            else if (arr[mid] < target) {
                low = mid + 1;
            } else
                high = mid - 1;

        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 2, 3, 4, 5, 6, 6, 7, 7, 7 };
        int target = 7;
        int lower_idx = FrequencyCount(arr, target, false);
        int uppper_idx = FrequencyCount(arr, target, true);

        //some logic ...
        System.out.println(uppper_idx - lower_idx + 1);
    }
}
