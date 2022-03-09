public class pow_recursive {

    // TC : O(b)
    static int _pow(int a, int b) {
        if (b == 0)
            return 1;
        return a * _pow(a, b - 1);

    }

    public static void main(String[] args) {
        System.out.println(_pow(2, 5));
    }
}
