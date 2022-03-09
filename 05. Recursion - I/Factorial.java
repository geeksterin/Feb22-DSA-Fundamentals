public class Factorial {

    static int _fact(int n) {
        // Base case
        if (n == 1)
            return 1;

        return n * _fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(_fact(5));
    }
}
