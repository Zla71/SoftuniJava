package AbstractDemo;

public class Teacher extends Person {

    public Teacher(String schoolName) {
        super(schoolName);
    }

    @Override
    public void sayMyRole() {
        System.out.println("I am a teacher");
    }

    @Override
    public void sayMyName() {
        System.out.println("My name is Ivan");
    }
}
