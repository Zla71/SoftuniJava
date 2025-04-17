package BirthdayCelebrations;

public class Pet implements Birthable {
    private String name;
    private String birthDay;

    public Pet(String name, String birthDay) {
        this.setName(name);
        this.setBirthDay(birthDay);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    @Override
    public String getBirthDate() {
        return this.birthDay;
    }

    public String toString() {
        return String.format("Pet %s %s" , this.getName(), this.getBirthDate());
    }
}
