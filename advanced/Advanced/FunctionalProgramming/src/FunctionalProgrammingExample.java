import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgrammingExample {
    public static void main(String[] args) {
        // Sample data: List of employees
        List<EmployeeClass> employees = Arrays.asList(
                new EmployeeClass(1, "Alice", 3000),
                new EmployeeClass(2, "Bob", 4000),
                new EmployeeClass(3, "Charlie", 5000),
                new EmployeeClass(4, "Diana", 6000),
                new EmployeeClass(5, "Eve", 7000)
        );

        // 1. Filter employees with salary > 4000 and collect names
        List<String> highEarners = employees.stream()
                .filter(emp -> emp.getSalary() > 4000) // Predicate for filtering
                .map(EmployeeClass::getName)               // Map to employee names
                .toList();        // Collect to a list
        System.out.println("High earners: " + highEarners);

        // 2. Calculate the total salary of all employees
        double totalSalary = employees.stream()
                .mapToDouble(EmployeeClass::getSalary)      // Map to salaries
                .sum();                                // Summing them up
        System.out.println("Total salary: " + totalSalary);

        // 3. Find the highest paid employee
        Optional<EmployeeClass> highestPaid = employees.stream()
                .max(Comparator.comparing(EmployeeClass::getSalary)); // Find max by salary
        highestPaid.ifPresent(emp ->
                System.out.println("Highest paid: " + emp.getName() + " - $" + emp.getSalary()));

        // 4. List of employee names sorted alphabetically
        List<String> sortedNames = employees.stream()
                .map(EmployeeClass::getName)               // Extract names
                .sorted()                             // Sort alphabetically
                .toList();        // Collect to a list
        System.out.println("Sorted names: " + sortedNames);

        // 5. Generate a list of even numbers using Streams
        List<Integer> evenNumbers = IntStream.range(1, 20) // Generate range of numbers
                .filter(n -> n % 2 == 0)                  // Filter even numbers
                .boxed()                                  // Box to Integer objects
                .toList();           // Collect to a list
        System.out.println("Even numbers: " + evenNumbers);

        // 6. Group employees by salary range (e.g., < 5000 and >= 5000)
        Map<String, List<EmployeeClass>> salaryGroups = employees.stream()
                .collect(Collectors.groupingBy(emp ->
                        emp.getSalary() < 5000 ? "Below 5000" : "5000 and above"));
        System.out.println("Grouped by salary range: " + salaryGroups);
    }
}

// Sample Employee class
class EmployeeClass {
    private int id;
    private String name;
    private double salary;

    public EmployeeClass(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}