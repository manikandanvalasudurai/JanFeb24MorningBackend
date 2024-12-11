package Static;

public class Client {
    public static void main(String[] args) {
        System.out.println(Student.count);

        Student st1 = new Student(25,1975);
        Student st2 = new Student(25,1975);
        Student st3 = new Student(25,1975);
        System.out.println(Student.count);
        Student st4 = new Student(25,1975);
        Student st5 = new Student(25,1975);

        System.out.println(st5.nonstaticCount);
        System.out.println(st5.id);
        System.out.println(Student.count);

    }
}
