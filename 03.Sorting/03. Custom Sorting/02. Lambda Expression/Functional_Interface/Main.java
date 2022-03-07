import javax.net.ssl.X509ExtendedKeyManager;

public class Main {
    public static void main(String[] args) {
        // Cat myCat = new Cat();
        // myCat.print();

        // printThing(myCat);

        Printable x = () -> System.out.println("Meow");
        printThing(x);

    }

    static void printThing(Printable thing) {
        thing.print();
    }
}
