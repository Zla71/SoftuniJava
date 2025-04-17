package AnimalFarm;

public class Chicken {

    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        // isBlank() - проверява дали стринга се състои само от интервали
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double productPerDay() {
        // връща информация за яйцата за един ден
        return calculateProductPerDay();
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.", name, age, productPerDay());
    }

    // предмятам по колко яйца снася моето пиле на ден
    private double calculateProductPerDay() {
        if (age <= 5) {
            return 2;
        } else if (age < 11) {
            return 1;
        } else {
            return 0.75;
        }
    }
}
