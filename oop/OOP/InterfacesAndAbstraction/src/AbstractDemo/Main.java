package AbstractDemo;

public class Main {
    public static void main(String[] args) {


        // създаваме инстнация на Student, но изпозлваме клас Person
        Person student = new Student("Dimcho Debelyanov");

        // създаваме инстнация на Teacher, но изпозлваме клас Person
        Person teacher = new Teacher("Dimcho Debelyanov");

        // метода в абстрактният клас
        student.sayHello();

        // метода в абстрактният клас
        student.sayMyRole();
        student.sayMyName();

        // getter за полето schoolName
        System.out.println(student.getSchoolName());

        System.out.println();

        // метода в абстрактният клас
        teacher.sayHello();

        // метода в абстрактният клас
        teacher.sayMyRole();
        teacher.sayMyName();

        // getter за полето schoolName
        System.out.println(teacher.getSchoolName());

        // новодобавен метод address() в абстрактният клас, няма проблем за наследнитие
        student.address();
        teacher.address();

    }
}
