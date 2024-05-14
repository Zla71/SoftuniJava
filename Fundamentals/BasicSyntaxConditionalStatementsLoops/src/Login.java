import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        // reversing String
        String password = new StringBuffer(userName).reverse().toString();
        String tryPass = "";
        int counter = 0;
        boolean hit = false;

        while (true) {
            tryPass = scanner.nextLine();
            counter += 1;

            if (tryPass.equals(password)) {
                System.out.printf("User %s logged in.", userName);
                break;
            }

            if (counter == 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }

            System.out.println("Incorrect password. Try again.");

        }
    }
}
