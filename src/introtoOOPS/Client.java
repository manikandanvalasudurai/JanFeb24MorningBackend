package introtoOOPS;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Thanshika";
        student.setPsp(50);
        student.attendClass();
        System.out.println(student.getPsp());

//        Student student2 = new Student();
//        student2.name = "Thanshika";
//        student2.attendClass();
//
//        student2 = student;
//        student2.attendClass();
    }
}
