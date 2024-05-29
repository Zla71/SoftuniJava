import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] currentCommand = scanner.nextLine().split(" ");
            int length = currentCommand.length;
            String personName = currentCommand[0];

            switch (length) {
                case 3:
                    //Allie is going!
                    if (names.contains(personName)) {
                        System.out.printf("%s is already in the list!%n", personName);
                    } else {
                        names.add(personName);
                    }
                    break;
                default:
                    //Allie is not going!
                    if (names.contains(personName)) {
                        names.remove(personName);
                    } else {
                        System.out.printf("%s is not in the list!%n", personName);
                    }
                    break;
            }
        }
        for (String name : names) {
            System.out.printf("%s%n", name);
        }
    }

}
