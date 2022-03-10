
public class QuickSort {
    static int partition(int a[], int s, int e) {
        int i = s - 1;
        int j = s;
        int p = a[e]; // default pivot

        for (; j < e; j++) {
            if (a[j] < p) {
                ++i;
                // swap
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        // swap(a[i + 1], a[e]);
        int tmp = a[++i];
        a[i] = a[e];
        a[e] = tmp;
        return i;
    }

    static void quicksort(int arr[], int s, int e) {
        //Base case.
        if (s >= e) return;
        int pivot_idx = partition(arr, s, e);
        quicksort(arr, s, pivot_idx - 1);
        quicksort(arr, pivot_idx + 1, e);

    }

    public static void main(String args[]) {
        int a[] = { 10, -1, -9, 2, 4, 5, 6, 8, 10, 11, 15 };
        quicksort(a, 0, a.length - 1);

        // display
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }
}
