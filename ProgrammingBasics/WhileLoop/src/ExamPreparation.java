import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int badNotes = Integer.parseInt(scanner.nextLine());
        int sumNotes = 0;
        int numberOfTasks = 0;
        int sumBadNotes = 0;
        String lastTask = "";


        while (true) {
            String task = scanner.nextLine();

            if (!task.equals("Enough")) {
                lastTask = task;
            }

            if (task.equals("Enough")) {
                double average = (double) sumNotes / numberOfTasks;
                System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s", average, numberOfTasks, lastTask);
                break;
            }

            int currentNote = Integer.parseInt(scanner.nextLine());

            if (currentNote <= 4) {
                sumBadNotes += 1;
            }

            if (badNotes == sumBadNotes) {
                System.out.printf("You need a break, %d poor grades.", badNotes);
                break;
            }

            numberOfTasks += 1;
            sumNotes += currentNote;

        }
    }
}
