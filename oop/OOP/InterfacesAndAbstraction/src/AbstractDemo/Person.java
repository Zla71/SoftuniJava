package AbstractDemo;

public abstract class Person {

    private String schoolName;

    public Person(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    // обикновен войд метод
    public void sayHello() {
        System.out.println("Hello");
    }

    public abstract void sayMyRole();

    // абстрактен метод
    public abstract void sayMyName();

    public void address() {
        System.out.println("Burgas");
    }


}
