public class LinearSearch {
    //TC: O(N)
    //SC: O(1)
    public static int search(int arr[], int x) { //extra space 
        int n = arr.length; //extra space.
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;

        // Function call
        int result = search(arr, x); //extra space BUT not a aux space.
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index "
                    + result);
    }
}
