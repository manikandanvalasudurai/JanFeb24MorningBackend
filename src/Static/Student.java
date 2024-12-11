package Static;

public class Student {
    private int age;
    private int gradYear;
    static int count;
    int id;
    int nonstaticCount;

    public Student(int age, int gradYear) {
        this.age = age;
        this.gradYear = gradYear;
        count++;
        nonstaticCount++;
        id = count;
    }
    //in static method static count can be accessed and manipulated
    public static int getCount() {
        return count;
    }
    //non static age cant be accessed by static methods
//    public static void dosomething() {
//        age++;
//    }
}
