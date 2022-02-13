import java.util.*;

public class lamda {

    static class comp implements Comparator {
        @Override
        public int compare(Object obj1, Object obj2) {
            Integer x = (Integer) obj1;
            Integer y = (Integer) obj2;

            // logic to compare objects
            return -1 * (x - y); // hacked
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
        Integer[] arr = { 1, 2, 0, 10, 11, 15, -1, 4 };

        // Arrays.sort(arr,new comp());
        // for (int x : arr) {
        // System.out.print(x + " ");
        // }

        // Lamda expression. in java 8 : de-facto way!
        // Arrays.sort(arr,(x,y)->{
        // return -1*(x-y);
        // });

        // for (int x : arr) {
        // System.out.print(x + " ");
        // }

        // System.out.println("");

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
            return -1*(x.length() - y.length());
        });

        for (String x : sa) {
            System.out.print(x + " ");
        }
    }
}
