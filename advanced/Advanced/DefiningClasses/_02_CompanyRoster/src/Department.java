import javax.swing.border.StrokeBorder;
import java.util.ArrayList;
import java.util.List;

public class Department {

    // 1. fields
    private String name;
    private List<Employee> employees;

    // 2. constructor
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public double getDepartmentSalary() {

        double sum = 0;

        for (Employee employee : this.employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        // добавяме името на отдела и след това нов ред -> System.lineSeparator()
        stringBuilder.append("Highest Average Salary: ").append(this.name).append(System.lineSeparator());
        for (Employee employee : this.employees) {
            stringBuilder.append(employee.toString()).append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }



}
