public class pow {

    // TC : lg(N)
    static int _pow(int a, int b) {
        if (b == 0)
            return 1;

        int res = _pow(a, b / 2);

        if (b % 2 != 0) {
            return (a * res * res);
        } else
            return (res * res);
    }

    public static void main(String[] args) {
        System.out.println(_pow(3, 3));

        // pow(a,-b);

    }
}
