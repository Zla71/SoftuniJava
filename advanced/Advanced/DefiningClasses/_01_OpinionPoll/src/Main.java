import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            Person person = new Person(name, age);

            people.add(person);
        }

        // remove people with age less or equal to 30
        people.removeIf(person -> person.getAge() <= 30);

        // sort people by their names
        Collections.sort(people, Comparator.comparing(Person::getName));

        for (Person person : people) {
            System.out.println(person);
        }
    }
}