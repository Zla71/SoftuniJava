public class Animal {
    private String name;
    protected int age;

    public Animal(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        // VALIDATION
        this.name = name;
    }

    protected void setAge(int age) {
        // VALIDATION
        if (age > 24) {
            String message = String.format("The age of %s should be less or equal to 24.", this.getClass().getName().toLowerCase());
            throw new IllegalArgumentException(message);
        }
        this.age = age;
    }

    public String toString() {
        return String.format("%s %s is %d old.", this.getClass().getName(),this.name, this.age);
    }

    public void eat() {
        System.out.printf("%s eats now.%n", this.getClass().getName());
    }

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }
}
