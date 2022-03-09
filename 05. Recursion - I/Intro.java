public class Intro {

    // static int cnt = 0;

    static void print(int cnt) {
        // Base condition or anchor condition or stopping condition.
        if (cnt == 5)
            return;

        print(++cnt);

        System.out.println("1");
        //do some calc.
        // cnt = cnt+1;
        // print(cnt); //
        // print(++cnt); // correct output
        // print(cnt++); // infinite calls
    }

    public static void main(String[] args) {
        print(0);

    }
}
