import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Department> departments = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            // Peter 120.00 Dev Development peter@abv.bg 28

            String[] employeeData = scanner.nextLine().split("\\s+");

            String name = employeeData[0];
            double salary = Double.parseDouble(employeeData[1]);
            String position = employeeData[2];
            String departmentName = employeeData[3];
            String email = "n/a";
            int age = -1;

            if (employeeData.length == 6) {
                email = employeeData[4];
                age = Integer.parseInt(employeeData[5]);
            } else if (employeeData.length == 5) {
                if (employeeData[4].contains("@")) {
                    email = employeeData[4];
                } else {
                    age = Integer.parseInt(employeeData[4]);
                }
            }

            Employee employee = new Employee(name, salary, position, email, age);

            Department department = getDepartmentByName(departments, departmentName);

            department.addEmployee(employee);

        }

        // сортираме отделите по заплащане в намалящ ред
        Collections.sort(departments, Comparator.comparing(Department::getDepartmentSalary).reversed());

        // вземаме първият отдел
        Department highestPaidDepartment = departments.getFirst();

        // сортираме работниците по големина на заплатата в намалящ ред
        Collections.sort(highestPaidDepartment.getEmployees(), Comparator.comparing(Employee::getSalary).reversed());

        System.out.println(highestPaidDepartment);


    }

    public static Department getDepartmentByName(List<Department> departments, String departmentName) {

        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                return department;
            }
        }

        Department department = new Department(departmentName);
        departments.add(department);

        return  department;
    }
}