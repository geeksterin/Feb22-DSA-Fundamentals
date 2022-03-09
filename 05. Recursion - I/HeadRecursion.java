public class HeadRecursion {

    static void printDec(int i) {
        // Base case
        if (i >= 10) {
            System.out.println(i);
            return;
        }

        printDec(i + 1);
        System.out.println(i);
    }

    public static void main(String[] args) {
        // 10,9,8,7,6,....1
        printDec(1);
    }
}
