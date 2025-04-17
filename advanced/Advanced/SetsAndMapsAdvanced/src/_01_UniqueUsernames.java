import java.util.*;

public class _01_UniqueUsernames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Set<String> wordsSet = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            wordsSet.add(scanner.nextLine());
        }

        for (String word : wordsSet) {
            System.out.println(word);
        }
    }
}
