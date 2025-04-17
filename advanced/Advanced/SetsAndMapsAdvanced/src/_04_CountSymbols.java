import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_CountSymbols {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();
        Map<Character, Integer> resultMap = new TreeMap<>();

        for (char c : input) {
            if (!resultMap.containsKey(c)) {
                resultMap.put(c, 1);
            } else {
                resultMap.put(c, resultMap.get(c) + 1);
            }
        }

        printMap(resultMap);
    }

    private static void printMap(Map<Character, Integer> resultMap) {
        for (Map.Entry<Character, Integer> entry : resultMap.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}
