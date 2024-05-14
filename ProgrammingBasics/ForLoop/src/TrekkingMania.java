import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int groupsCount = Integer.parseInt(scanner.nextLine());
        int sumOfPeople = 0;
        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 0; i < groupsCount; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            sumOfPeople += peopleInGroup;
            if (peopleInGroup <= 5) {
                musala += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                monblan += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                kilimandjaro += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                k2 += peopleInGroup;
            } else {
                everest += peopleInGroup;
            }

        }

        double percentMusala = ((double) musala / sumOfPeople) * 100;
        double percentMonblan = ((double) monblan / sumOfPeople) * 100;
        double percentKilimandjaro = ((double) kilimandjaro / sumOfPeople) * 100;
        double percentK2 = ((double) k2 / sumOfPeople) * 100;
        double percentEverest = ((double) everest / sumOfPeople) * 100;
        System.out.printf("%.2f%%%n", percentMusala);
        System.out.printf("%.2f%%%n", percentMonblan);
        System.out.printf("%.2f%%%n", percentKilimandjaro);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%%n", percentEverest);

    }
}
