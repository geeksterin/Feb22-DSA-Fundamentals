public class callStack {

    static void A() {
        System.out.println("Inside A");
        return;
    }

    static void B() {
        System.out.println("Inside B");
        return;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        A();
        B();

        System.out.println(a);
    }
}
