import java.util.*;

public class Sort_Using_Lambda {

    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 0, 10, 11, 15, -1, 4 };

        // Lamda expression. in java 8 : de-facto way!
        Arrays.sort(arr, (x, y) -> {
            return -1 * (x - y);
        });

        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println("");

        String[] sa = { "arun", "arun", "singh", "a", "b", "rahul", "katrina" }; // dict order.

        // //The natural/default seq for numbers is ascending order.
        // // The natural/default seq for strings is dictionary order.
        // Arrays.sort(sa);

        // Custom defined sorting based len of strings
        // Arrays.sort(sa,new lencomp());

        // for (String x : sa) {
        // System.out.print(x + " ");
        // }

        // Lamda expression. in java 8 : de-facto way!
        Arrays.sort(sa, (x, y) -> {
            return -1 * (x.length() - y.length());
        });

        for (String x : sa) {
            System.out.print(x + " ");
        }
    }
}
