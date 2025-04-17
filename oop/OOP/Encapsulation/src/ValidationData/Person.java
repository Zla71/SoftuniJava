package ValidationData;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;


    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setFirstName(String firstName) {

        // валидирам дали името на човека е повече от 3 символа
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        // валидирам дали името на човека е повече от 3 символа
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.lastName = lastName;
    }

    public void setAge(int age) {
        // валидирам дали годините на човека са повече от 0 години
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }

        this.age = age;
    }

    public void setSalary(double salary) {
        // валидирам дали заплатата на човека е повече от 460.0 лева
        if (salary <= 460.0) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        if (this.age < 30) {
            this.salary += this.salary * (bonus / 100) * 0.5;
        } else {
            this.salary += this.salary * bonus / 100;
        }
    }

    @Override
    public String toString() {
        // Angel Ivanov gets 2640.0 leva
        return String.format("%s %s gets %f leva", this.getFirstName(), this.getLastName(), this.getSalary());
    }


}
