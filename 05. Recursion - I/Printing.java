public class Printing {

    static void printEven(int arr[], int idx) {
        // Base case: To stop recursive calls
        if (arr.length == idx) {
            System.out.println("Reached end of array");
            return;
        }
        // This is the actual logic.
        if (arr[idx] % 2 == 0) {
            System.out.println(arr[idx]);
        }
        printEven(arr, idx + 1);
    }

    // Prints from 1 to 10 using tail recursion.
    static void print1toN(int n) {
        // Base case
        if (n == 10) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        print1toN(++n);
    }

    // Print from 10 to 1.
    static void printNto1(int n) {
        // Base case
        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        //couple of stmts
        
        printNto1(--n);

    }

    public static void main(String[] args) {
        // print1toN(10);
        printNto1(10);

    }
}
