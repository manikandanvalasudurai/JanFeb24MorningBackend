package Constructors;

public class Student {
    private int age;
    private int gradYear;
    //Default Constructor
//    public Student(){
//        age = 20;
//        gradYear = 2020;
//    }
    //Manual Constructor
    public Student(int age, int gradYear){
        this.age = age;
        this.gradYear = gradYear;
    }
    public Student(Student other){
        this.age = other.age;
        this.gradYear = other.gradYear;
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
