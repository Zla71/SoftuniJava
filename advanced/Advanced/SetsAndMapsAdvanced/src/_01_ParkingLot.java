import java.util.*;

public class _01_ParkingLot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> parking = new LinkedHashSet<>();

        while (true) {
            String[] commandArr = scanner.nextLine().split(", ");
            String currentCommand = commandArr[0];

            if (currentCommand.equals("END")) {
                showParking(parking);
                break;
            }
            String number = commandArr[1];

            if (currentCommand.equals("IN")) {
                parking.add(number);
            } else if (currentCommand.equals("OUT")) {
                parking.remove(number);
            }
        }
    }

    private static void showParking(Set<String> parking) {
        if (!parking.isEmpty()) {
            for (String number : parking) {
                System.out.println(number);
            }
        } else {
            System.out.println("Parking Lot is Empty");
        }
    }
}
