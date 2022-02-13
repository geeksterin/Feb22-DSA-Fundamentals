
public class sumofDigits {
    static int sum = 0;

    static public int solve(int num) {
        if (num == 0)
            return 0;
        sum += num % 10 + solve(num / 10);
        return sum;
    }

    public static void main(String[] args) {
        int a = 32525;
        System.out.println(solve(a));
    }

}