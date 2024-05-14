import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int examTime = (examHour * 60) + examMinute;
        int arrivalTime = (arrivalHour * 60) + arrivalMinute;
        int diff = 0;
        boolean checker = true;

        if (arrivalTime > examTime) {
            diff = arrivalTime - examTime;
            System.out.println("Late");
            if (diff < 60) {
                System.out.printf("%d minutes after the start", diff);
                checker = false;
            }
            else {
                int hour = diff / 60;
                int minute = diff % 60;
                if (minute < 10) {
                    System.out.printf("%d:0%d hours after the start", hour, minute);
                    checker = false;
                }
                else {
                    System.out.printf("%d:%d hours after the start", hour, minute);
                    checker = false;
                }
            }
        } else if (arrivalTime < examTime) {
            diff = examTime - arrivalTime;
            if (diff > 30) {
                System.out.println("Early");
                if (diff < 60) {
                    System.out.printf("%d minutes before the start", diff);
                    checker = false;
                } else {
                    int hour = diff / 60;
                    int minute = diff % 60;
                    if (minute < 10) {
                        System.out.printf("%d:0%d hours before the start", hour, minute);
                        checker = false;
                    }
                    else {
                        System.out.printf("%d:%d hours before the start", hour, minute);
                        checker = false;
                    }
                }
            }
        }
        if (checker) {
            diff = examTime - arrivalTime;
            if (diff == 0 || diff <= 30) {
                if (diff == 0) {
                    System.out.println("On time");
                }
                else {
                    System.out.println("On time");
                    System.out.printf("%d minutes before the start", diff);
                }
            }
        }
    }
}
