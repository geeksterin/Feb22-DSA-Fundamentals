public class Cat implements Printable {

    String Name;
    int age;

    Cat() {

    }

    @Override
    public void print(String s) {
        System.out.println("Meow");
    }

}
