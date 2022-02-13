public class HeadRecursion {

    static void printDec(int i) {
        // stopping
        if (i > 10) {
            return;
        }
        printDec(i + 1); // head recursion.
        //defering my computation.
        System.out.print(i + ",");
        //some more statemets
    }

    public static void main(String[] args) {
        // 10,9,8,7,6,....1
        printDec(1);
    }
}
