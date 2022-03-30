public class Student2 {
    private int rollno;

    Student2(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return rollno + " ";
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public static void main(String[] args) {
        Student s1 = new Student(100);
        Student s2 = new Student(200);

        System.out.println(s1);
        System.out.println(s2);
    }
}
