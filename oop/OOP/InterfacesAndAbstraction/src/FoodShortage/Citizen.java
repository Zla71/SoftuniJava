package FoodShortage;

import MultipleImplementation.Birthable;

public class Citizen implements Person, Identifiable, Buyer, Birthable {

    private String name;
    private int age;
    private String id;
    private String birthDay;
    private int food;

    public Citizen(String name, int age, String id, String birthDay) {
        this.name = name;
        this.age = age;
        this.setId(id);
        this.setBirthDay(birthDay);
        this.food = 0;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public int getFood() {
        return food;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void buyFood() {
        this.food += 10;
    }

    @Override
    public String getBirthDate() {
        return this.birthDay;
    }
}
