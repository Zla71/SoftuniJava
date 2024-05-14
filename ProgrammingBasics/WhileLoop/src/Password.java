import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String password = scanner.nextLine();

        while (true) {
            String currentPassword = scanner.nextLine();
            if (currentPassword.equals(password)) {
                break;
            }
        }
        System.out.printf("Welcome %s!", userName);
    }
}
