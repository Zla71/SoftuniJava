public class PersonExample {
    private String name;
    private int age;


    public PersonExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // this - реферира към сегашният обект


    // field hiding - искаме полето на обекта, за това се слага this.name =
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void printInfo() {
        System.out.println("Аз съм класа Person");
    }
}
