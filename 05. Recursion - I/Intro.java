public class Intro {

    // static int cnt = 0;

    static public void foo(int cnt) {
        // 1. Base condition or stopping condition.
        if (cnt == 5) {
            return;
        }

        // 2. recursive part
        System.out.println("Inside foo");
        foo(cnt + 1); // Tail recursion.
    }

    static void print(int i) {
        // base condition
        if (i > 10) {
            return;
        }
        System.out.print(i + ",");
        print(i + 1); // tail
    }

    static void print1(int i) {
        // base condition
        if (i <= 0) {
            return;
        }
        // Egar execution.
        System.out.print(i + ",");
        // do some more computation.
        print(i - 1);
    }

    public static void main(String[] args) {
        // .Calling function multiple times
        foo(0);

    }
}
