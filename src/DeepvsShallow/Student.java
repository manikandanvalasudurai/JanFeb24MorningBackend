package DeepvsShallow;

public class Student {
    private int age;
    private int gradYear;
    Exam enrolledExam;

    public Student(int age, int gradYear,Exam enrolledExam) {
        this.age = age;
        this.gradYear = gradYear;
        this.enrolledExam = enrolledExam;
    }

    public Student(Student other) {
        this.age = other.age;
        this.gradYear = other.gradYear;
//        shallow copy
//        this.enrolledExam = other.enrolledExam;
//        Deep Copy
        this.enrolledExam = new Exam(other.enrolledExam);

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }
}
