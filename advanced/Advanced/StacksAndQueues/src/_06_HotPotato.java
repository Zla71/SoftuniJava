import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _06_HotPotato {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] kids = scanner.nextLine().split("\\s+");

        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, kids); // вкарваме масива в опашката

        int n = Integer.parseInt(scanner.nextLine());
        int rotations = 0;

        while (queue.size() > 1) {
            // 1. вемам 1вото дете на опашката
            String firstKid = queue.poll();

            // 2. увеличавам броя на завъртанията
            rotations++;

            // 3. проверявм дали това Nth завъртане
            if (rotations % n == 0) {
                // - ако е Nth завърртане = не го добавям в края на опашката
                System.out.println("Removed " + firstKid);
            } else {
                // - ако не е Nth завърртане = го добавям в края на опашката
                queue.offer(firstKid);
            }
        }

        System.out.println("Last is " + queue.poll());
    }
}
