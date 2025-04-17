package BirthdayCelebrations;

public class Citizen implements Birthable, Identifiable {

    private String name;
    private int age;
    private String id;
    private String birthDay;

    public Citizen(String name, int age, String id, String birthDay) {
        this.name = name;
        this.age = age;
        this.setId(id);
        this.setBirthDay(birthDay);
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

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String getBirthDate() {
        return this.birthDay;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public String toString() {
        return String.format("Citizen %s %d %s %s", this.getName(), this.getAge(), this.getId(), this.getBirthDate());
    }
}
