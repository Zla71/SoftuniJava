import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_Phonebook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();

        while (true) {
            String[] currentRow = scanner.nextLine().split("-");
            String name = currentRow[0];

            if (name.equals("search")) {
                break;
            }

            String number = currentRow[1];
            phoneBook.put(name, number);
        }

        while (true) {
            String nameToSearch = scanner.nextLine();

            if (nameToSearch.equals("stop")) {
                break;
            }

            if (phoneBook.containsKey(nameToSearch)) {
                System.out.printf("%s -> %s%n", nameToSearch, phoneBook.get(nameToSearch));
            } else {
                System.out.printf("Contact %s does not exist.%n", nameToSearch);
            }
        }
    }
}
