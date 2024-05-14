import java.util.Scanner;

public class TimePlusMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());

        int newMinute = (minute + 15) % 60;
        int newHour = (hour + (minute + 15) / 60) % 24;

        System.out.printf("%d:%02d", newHour, newMinute);

    }
}