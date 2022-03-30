public class Student {
    private int rollno;

    Student(int rollno) {
        this.rollno = rollno;
    }

    public static void main(String[] args) {
        Student s1 = new Student(100);
        Student s2 = new Student(200);

        System.out.println(s1);
        System.out.println(s2);
    }
}