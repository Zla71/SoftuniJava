public class Person {

    private String name;
    private int age;

    // ВАЖНО - КОГАТО СИ СЪЗДАДЕМ НАШИ КОНСТРУКТОРИ, ДЕФОЛТНИЯТ КОНСТРУКТОР СПИРА ДА РАБОТИ

    // това е default конструктор на класа -> създава празен обект
    public Person() {
        // name = null
        // age = 0
    }

    // може да се създаде и 2ри конструктор, създава обекти от този клас, като създава стойности на полетата още при самото създаване на обекта.
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    // този метод, за да се използва не е нужно да се създава инстанция/обект от класа
    public static void sayHello() {
        System.out.print("Hi, I am person");
    }


    public static void main(String[] args) {

        Person personOne = new Person("Zlati", 34);
        Person personTwo = new Person();

        // използваме празният обект
        System.out.println(personTwo.getName());
        System.out.println(personTwo.getAge());

        // използваме вторият конструктор, който създава стойности на полетата още при самото създаване на обекта.
        System.out.println(personOne.getName());
        System.out.println(personOne.getAge());

        Person.sayHello();
    }


}
