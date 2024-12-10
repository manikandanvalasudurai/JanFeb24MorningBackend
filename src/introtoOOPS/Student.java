package introtoOOPS;

public class Student {
    public String name;
    public int age;
    int gradeYear;
    private int psp;

    public Student() {
        name = "Sri";
        age = 10;
        gradeYear = 20;
        psp = 100;
    }
    void attendClass(){
        System.out.println("Student "+ name + " is Attending class");
    }
    public int getPsp() {
        return psp;
    }
    public void setPsp(int pspVar) {
        if(pspVar < 0 || pspVar > 100) {
            throw new RuntimeException("Invalid psp");
        }
        psp = pspVar;
    }
}
