import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _02_SoftUniParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> guestList = new TreeSet<>();

        while (true) {
            String guest = scanner.nextLine();

            if (guest.equals("PARTY")) {
                break;
            }

            if (guest.length() == 8) {
                guestList.add(guest);
            }
        }

        while (true) {
            String guest = scanner.nextLine();

            if (guest.equals("END")) {
                showInfo(guestList);
                break;
            }

            guestList.remove(guest);
        }
    }

    private static void showInfo(Set<String> guestList) {
        System.out.println(guestList.size());
        for (String guest : guestList) {
            System.out.println(guest);
        }
    }
}
