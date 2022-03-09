public class gcd {
    // TC : lg(N)
    static int _gcd(int dividend, int divisor) {
        // Base case
        if (divisor == 0)
            return dividend;

        return _gcd(divisor, dividend % divisor);
    }

    // n * m = gcd(n,m) * lcm(n,m)

    // gcd(a,b,c) => gcd(gcd(a,b),c) => ans

    public static void main(String[] args) {
        System.out.println(_gcd(3, 16));
        // System.out.println(_lcm(3, 16));
    }

}