package recap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Role role = Role.valueOf(scanner.nextLine());

        User user = new User(name, role);

        // true || false
        Role userRole = Role.valueOf(String.valueOf(role));

        System.out.println(userRole.isAccessAllowed());
        System.out.println("Number of role is " + userRole.ordinal()); // + 1

        // My name is Zlati and my role is SUPPORT with access
        System.out.println(user);



    }
}
