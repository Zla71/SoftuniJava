package AbstractDemo;

public class Student extends Person {


    public Student(String schoolName) {
        super(schoolName);
    }

    @Override
    public void sayMyRole() {
        System.out.println("I am a student");
    }

    @Override
    public void sayMyName() {
        System.out.println("My name is Zlati");
    }
}
