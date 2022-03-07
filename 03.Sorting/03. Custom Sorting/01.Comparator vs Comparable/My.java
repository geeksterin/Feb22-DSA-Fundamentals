import java.util.*;

public class My {

    static class comp implements Comparator {
        @Override
        public int compare(Object obj1, Object obj2) {
            Integer x = (Integer) obj1;
            Integer y = (Integer) obj2;

            // logic to compare objects
            return -1 * (x - y);
        }
    }

    // Older way
    static class lencomp implements Comparator {
        @Override
        public int compare(Object obj1, Object obj2) {
            String x = (String) obj1;
            String y = (String) obj2;
            return (x.length() - y.length());
        }
    }

    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 0, 10, 11, 15, -1, 4 }; //

        Arrays.sort(arr, new comp());

        // for (int x : arr) {
        // System.out.print(x + " ");
        // }

        String[] b = { "arun", "singh", "abc", "xyz", "a", "b" };
        Arrays.sort(b); // dict format. aka lexiographical sorting.

        for (String x : b) {
            System.out.print(x + " ");
        }

        Arrays.sort(b, new lencomp());
        System.out.println();

        for (String x : b) {
            System.out.print(x + " ");
        }

    }
}
