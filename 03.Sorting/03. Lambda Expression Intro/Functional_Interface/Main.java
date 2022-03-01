
public class Main {
    public static void main(String[] args) {
        // Cat myCat = new Cat();
        // myCat.print();

        // printThing(myCat);

        printThing((s) -> System.out.println("Meow" + s));

    }

    static void printThing(Printable thing) {
        thing.print("!");
    }
}
