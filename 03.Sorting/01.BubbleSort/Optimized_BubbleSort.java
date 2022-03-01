
//Java program for implementation of Bubble Sort
public class Optimized_BubbleSort {
    // TC: O(N) to O(N^2)
    // SC: O(1)
    void bubbleSort(int arr[]) {
        int n = arr.length;

        boolean hasSwapped = false;

        for (int i = 0; i < n - 1; i++) {
            hasSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    hasSwapped = true;
                }

            }
            if (hasSwapped == false)
                break;
        }
        // sorting is complete
    }

    /* Prints the array */
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
