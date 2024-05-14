import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int grade = 1;
        double sumNotes = 0;
        int fails = 0;

        while (true) {
            if (fails > 1) {
                System.out.printf("%s has been excluded at %d grade", name, grade);
                break;
            }
            double currentNote = Double.parseDouble(scanner.nextLine());
            if (currentNote < 4) {
                fails += 1;
                continue;
            }
            sumNotes += currentNote;
            grade += 1;

            if (grade > 12) {
                double average = sumNotes / 12;
                System.out.printf("%s graduated. Average grade: %.2f", name, average);
                break;
            }

        }

    }
}
