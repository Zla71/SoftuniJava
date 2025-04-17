package ComparingObjects;

public class Person implements Comparable<Person> {

    private String name;
    private String town;
    private Integer age;

    public Person(String name, String town, Integer age) {
        this.name = name;
        this.town = town;
        this.age = age;
    }

    public int compareTo(Person otherPerson) {

        int result = this.name.compareTo(otherPerson.name);

        if (result == 0) {
            result = this.age.compareTo(otherPerson.age);
        }

        if (result == 0) {
            result = this.town.compareTo(otherPerson.town);
        }

        return result;
    }
}
